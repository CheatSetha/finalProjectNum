package kh.edu.numfit.securityconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import kh.edu.numfit.model.TeacherModel;
import kh.edu.numfit.repository.TeacherRepository;

@Service
public class CustomTeacherDetailService implements UserDetailsService {

	private TeacherRepository teacherRepo;
	public CustomTeacherDetailService(TeacherRepository teacherRepostory) {
		this.teacherRepo = teacherRepostory;
	}
	@Override
	public UserDetails loadUserByUsername(String txtPhoneNumber) throws UsernameNotFoundException {
		System.out.println("loadUserByUsername()"+txtPhoneNumber);
		TeacherModel teacher =  teacherRepo.findByPhoneNumber(txtPhoneNumber);
		if(teacher ==null) {
			throw new UsernameNotFoundException("phone number is not found!");
		}
		return new CustomTeacherDetails(teacher);
	}

}
