package kh.edu.numfit.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Service;
import kh.edu.numfit.model.TeacherModel;
import kh.edu.numfit.model.UserModel;
import kh.edu.numfit.repository.TeacherRepository;

@Service
public class TeacherService {
	@Autowired
	private TeacherRepository teacherRepository;
	public List<TeacherModel> getTeacher(){
		return teacherRepository.findAll();
	}
	public TeacherModel getTeacherById(String teacherCode) {
		return teacherRepository.findById(teacherCode).get();
	}
	public TeacherModel updateorSaveUser(TeacherModel teacher) {
		return teacherRepository.save(teacher);
	}
	public void deleteUserById(String teacherCode) {
		teacherRepository.deleteById(teacherCode);
	}
	public Page<TeacherModel> findPaginated(int pageNum, int pageSize) {
		Pageable pageable = PageRequest.of(pageNum-1, pageSize);
		
		return teacherRepository.findAll(pageable);
	}
	public List<TeacherModel> searchUser(String keyword){
		return teacherRepository.searchByKeyword(keyword);
	}
}
