package kh.edu.numfit.model;

import java.util.Date;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sreng
 *
 */
@Entity
@Table(name = "tblUsers")
public class UserModel {
	@Id
	private int userId;
	@Column(nullable = true)
	private String userName;
	@Column(nullable = true)
	private String pwd;
	@Column(nullable = true)
	private String userRole;
	@Column(nullable = true)
	private String details;
	@Column(nullable = true)
	private Date createDate;
	@Column(nullable = true)
	private String photo;
	@Column(nullable = true)
	private String firstName;
	@Column(nullable = true)
	private String lastName;
	@Column(nullable = true)
	private String tel;
	@Column(nullable = true)
	private String email;
	@Column(nullable = true)
	private String address;
	
	public UserModel() {
		
	}
	public UserModel(String username,String pwd, String role) {
		this.userName = username;
		this.pwd = pwd;
		this.userRole = role;
	}
	public UserModel(int uid, String username,String pwd, String role) {
		this.userId = uid;
		this.userName = username;
		this.pwd = pwd;
		this.userRole = role;
	}
	
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "userid:"+userId+" username: "+userName+" pwd: "+pwd+" role = "+userRole;
	}
	
}
