package kh.edu.numfit.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import kh.edu.numfit.model.Role;
import kh.edu.numfit.model.TeacherModel;
import kh.edu.numfit.repository.TeacherRepository;

@Configuration
public class DatabaseLoader  {
	@Autowired
	private TeacherRepository teacherRepository;
	public DatabaseLoader(TeacherRepository teacherRepo) {
		this.teacherRepository = teacherRepo;
	}
	@Bean
	public CommandLineRunner initializeDatabase() {
		return args->{
			TeacherModel t1 = new TeacherModel();
			t1.setTeacherCode("fit001");
			t1.setNameEn("SRENG VICHET");
			t1.setNameKh("ស្រេង វិចិត្រ");
			t1.setPwd(new BCryptPasswordEncoder().encode("123"));
			t1.setPhoneNumber("092131771");
			t1.setRole(Role.ADMIN);
			
			TeacherModel t2 = new TeacherModel();
			t2.setTeacherCode("fit002");
			t2.setNameEn("Sok Moniroth");
			t2.setNameKh("សុខ មុន្នីរ័ត្ន");
			t2.setPwd(new BCryptPasswordEncoder().encode("123"));
			t2.setPhoneNumber("012334465");
			t2.setRole(Role.USER);
			
			TeacherModel t3 = new TeacherModel();
			t3.setTeacherCode("fit003");
			t3.setNameEn("Lorn Nara");
			t3.setNameKh("លន ណារ៉ា");
			t3.setPwd(new BCryptPasswordEncoder().encode("123"));
			t3.setPhoneNumber("012121314");
			t3.setRole(Role.USER);
			
			TeacherModel t4 = new TeacherModel();
			t4.setTeacherCode("fit004");
			t4.setNameEn("Kong Chanpanith");
			t4.setNameKh("គង់ ចាន់ផានិត");
			t4.setPwd(new BCryptPasswordEncoder().encode("123"));
			t4.setPhoneNumber("089523499");
			t4.setRole(Role.USER);
			
			TeacherModel t5 = new TeacherModel();
			t5.setTeacherCode("fit005");
			t5.setNameEn("Som Vicheak");
			t5.setNameKh("សំ​ វិច្ឆិកា");
			t5.setPwd(new BCryptPasswordEncoder().encode("123"));
			t5.setPhoneNumber("092168485");
			t5.setRole(Role.USER);
			
			
			TeacherModel t6 = new TeacherModel();
			t6.setTeacherCode("fit006");
			t6.setNameEn("Sim Vicheka");
			t6.setNameKh("ស៊ឹម វិច្ឆិកា");
			t6.setPwd(new BCryptPasswordEncoder().encode("123"));
			t6.setPhoneNumber("012683168");
			t6.setRole(Role.USER);
			
			
			TeacherModel t7 = new TeacherModel();
			t7.setTeacherCode("fit007");
			t7.setNameEn("Ly Boravun");
			t7.setNameKh("លី បូរ៉ាវុន");
			t7.setPwd(new BCryptPasswordEncoder().encode("123"));
			t7.setPhoneNumber("012599209");
			t7.setRole(Role.USER);
			
			TeacherModel t8 = new TeacherModel();
			t8.setTeacherCode("fit008");
			t8.setNameEn("Mok Ratha");
			t8.setNameKh("ម៉ក់ រដ្ឋា");
			t8.setPwd(new BCryptPasswordEncoder().encode("123"));
			t8.setPhoneNumber("017307327");
			t8.setRole(Role.USER);
			
//			teacherRepository.save(t1);
//			teacherRepository.save(t2);
//			teacherRepository.save(t3);
//			teacherRepository.save(t4);
//			teacherRepository.save(t5);
//			teacherRepository.save(t6);
//			teacherRepository.save(t7);
//			teacherRepository.save(t8);
			//System.out.println("user is created!");
		};
	}
	
}
