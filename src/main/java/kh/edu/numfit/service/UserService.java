package kh.edu.numfit.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import kh.edu.numfit.model.UserModel;

public interface UserService {
	public List<UserModel> getUsers();
	public UserModel getUserById(int id);
	public UserModel updateorSaveUser(UserModel user);
	public void deleteUserById(int id);
	Page<UserModel> findPaginated(int pageNum,int pageSize);
	public int getCountRole(String role);
}
