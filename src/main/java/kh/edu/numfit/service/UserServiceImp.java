package kh.edu.numfit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kh.edu.numfit.model.UserModel;
import kh.edu.numfit.repository.UserRepository;
@Service
public class UserServiceImp implements UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<UserModel> getUsers() {
		try {
//			List<UserModel> list =  userRepository.findAll();
			return userRepository.findAll();
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
	}
	

	@Override
	public UserModel getUserById(int id) {
		
			return userRepository.findById(id).get();
//			Optional<UserModel> optional = userRepository.findById(id);
//			UserModel user = null;
//			if(optional.isPresent()) {
//				user = optional.get();
//			}else {
//				throw new RuntimeException("Employee is not found!"+id);
//			}
//		return user;
	}

	@Override
	public UserModel updateorSaveUser(UserModel user) {
		try {
			return userRepository.save(user);
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
		
	}

	@Override
	public void deleteUserById(int id) {
		try {
			userRepository.deleteById(id);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}


	@Override
	public Page<UserModel> findPaginated(int pageNum, int pageSize) {
		Pageable pageable = PageRequest.of(pageNum-1, pageSize);
		
		return userRepository.findAll(pageable);
	}
	public List<UserModel> searchUser(String keyword){
		return userRepository.searchByKeyword(keyword);
	}


	@Override
	public int getCountRole(String role) {
		return userRepository.getCountRole(role);
	}
	
	
	


}
