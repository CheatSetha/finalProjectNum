package kh.edu.numfit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kh.edu.numfit.model.TeachScheduleModel;

@Repository
public interface TeachScheduleRepository  extends JpaRepository<TeachScheduleModel, Integer>{

}
