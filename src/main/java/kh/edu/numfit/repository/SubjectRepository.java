package kh.edu.numfit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kh.edu.numfit.model.SubjectModel;

@Repository
public interface SubjectRepository extends JpaRepository<SubjectModel, Integer> {

}
