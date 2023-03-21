package kh.edu.numfit.repository;

import kh.edu.numfit.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {
    //void delete(int id);
}
