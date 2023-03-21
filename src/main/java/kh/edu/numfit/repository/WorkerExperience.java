package kh.edu.numfit.repository;

import kh.edu.numfit.model.WorkerExperiencesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerExperience extends JpaRepository<WorkerExperiencesModel, Integer>  {
}
