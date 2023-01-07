package kh.edu.numfit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kh.edu.numfit.model.PromotionModel;

@Repository
public interface PromotionRepository extends JpaRepository<PromotionModel, Integer>{

}
