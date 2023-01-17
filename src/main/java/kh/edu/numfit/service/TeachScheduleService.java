package kh.edu.numfit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import kh.edu.numfit.model.TeachScheduleModel;
import kh.edu.numfit.repository.TeachScheduleRepository;

@Service
public class TeachScheduleService {
	@Autowired
	private TeachScheduleRepository teachScheduleRepo;
	
	public List<TeachScheduleModel> getTeachSchedule(){
		return teachScheduleRepo.findAll();
	}
	public TeachScheduleModel getTeachScheduleById(int tsid) {
		return teachScheduleRepo.findById(tsid).get();
	}
	public TeachScheduleModel saveOrUpdateTeachSchedule(TeachScheduleModel teacher) {
		return teachScheduleRepo.save(teacher);
	}
	public void deleteUserById(int tsid) {
		teachScheduleRepo.deleteById(tsid);
	}
	public Page<TeachScheduleModel> findTeachSchedulePaginated(int pageNum, int pageSize) {
		Pageable pageable = PageRequest.of(pageNum-1, pageSize);
		
		return teachScheduleRepo.findAll(pageable);
	}
	public List<TeachScheduleModel> getTeachScheduleByTeacherCode(String teacherCode){
		return teachScheduleRepo.getTeachScheduleByTeacherCode(teacherCode);
	}
	
}
