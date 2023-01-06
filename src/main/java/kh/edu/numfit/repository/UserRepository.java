package kh.edu.numfit.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import kh.edu.numfit.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer> {
	@Query("SELECT u FROM UserModel u WHERE u.userName LIKE %?1% Or u.userRole LIKE %?1%")
    public List<UserModel> searchByKeyword(String keyword);
	@Query("SELECT COUNT(u.userRole) FROM UserModel u WHERE u.userRole = ?1 GROUP BY u.userRole")
	public Integer getCountRole(String role);
}
