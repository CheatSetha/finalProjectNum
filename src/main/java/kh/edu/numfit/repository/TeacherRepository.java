package kh.edu.numfit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import kh.edu.numfit.model.TeacherModel;
import kh.edu.numfit.model.UserModel;
@Repository
public interface TeacherRepository extends JpaRepository<TeacherModel, String>{
	@Query("SELECT t FROM TeacherModel t WHERE t.nameEn LIKE %?1% Or t.nameKh LIKE %?1%")
    public List<TeacherModel> searchByKeyword(String keyword);
	//@Query("SELECT t FROM TeacherModel t WHERE t.phoneNumber = ?1")
	public TeacherModel findByPhoneNumber(String phoneNumber);
}
