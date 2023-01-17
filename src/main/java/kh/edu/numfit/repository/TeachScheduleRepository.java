package kh.edu.numfit.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import kh.edu.numfit.model.TeachScheduleModel;

@Repository
public interface TeachScheduleRepository  extends JpaRepository<TeachScheduleModel, Integer>{
	@Query("SELECT t FROM TeachScheduleModel t WHERE t.teacherCode = ?1")
    public List<TeachScheduleModel> getTeachScheduleByTeacherCode(String teacherCode);
}
