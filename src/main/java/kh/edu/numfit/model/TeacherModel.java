package kh.edu.numfit.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name= "tblTeachers")
public class TeacherModel implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(nullable = false)
	private String teacherCode;
	@Column(nullable = true)
	private String nameEn;
	@Column(nullable = true)
	private String nameKh;
	@Column(nullable = true)
	private String gender;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date dob;
	@Column(nullable = true)
	private String nationality;
	@Column(nullable = true)
	private String country;
	@Column(nullable = true)
	private String phoneNumber;
	@Column(nullable = true)
	private String pob;
	@Column(nullable = true)
	private String emailNum;
	@Column(nullable = true)
	private String emailPersonal;
	@Column(nullable = true)
	private String currentAddress;
	@Column(nullable = true)
	private String currentPosition;
	@Column(nullable = true)
	private String currentOrganization;
	@Column(nullable = true)
	private String currentPositionEntryDate;
	@Column(nullable = true)
	private String pwd;
	@Enumerated(EnumType.STRING)
	private Role role;
	
	public TeacherModel() {}
	public String getTeacherCode() {
		return teacherCode;
	}
	public void setTeacherCode(String teacherCode) {
		this.teacherCode = teacherCode;
	}
	public String getNameEn() {
		return nameEn;
	}
	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}
	public String getNameKh() {
		return nameKh;
	}
	public void setNameKh(String nameKh) {
		this.nameKh = nameKh;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		
		this.dob = dob;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPob() {
		return pob;
	}
	public void setPob(String pob) {
		this.pob = pob;
	}
	public String getEmailNum() {
		return emailNum;
	}
	public void setEmailNum(String emailNum) {
		this.emailNum = emailNum;
	}
	public String getEmailPersonal() {
		return emailPersonal;
	}
	public void setEmailPersonal(String emailPersonal) {
		this.emailPersonal = emailPersonal;
	}
	public String getCurrentAddress() {
		return currentAddress;
	}
	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}
	public String getCurrentPosition() {
		return currentPosition;
	}
	public void setCurrentPosition(String currentPosition) {
		this.currentPosition = currentPosition;
	}
	public String getCurrentOrganization() {
		return currentOrganization;
	}
	public void setCurrentOrganization(String currentOrganization) {
		this.currentOrganization = currentOrganization;
	}
	public String getCurrentPositionEntryDate() {
		return currentPositionEntryDate;
	}
	public void setCurrentPositionEntryDate(String currentPositionEntryDate) {
		this.currentPositionEntryDate = currentPositionEntryDate;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Teacher [teacherCode=" + teacherCode + ", nameEn=" + nameEn + ", nameKh=" + nameKh + ", gender="
				+ gender + ", dob=" + dob + ", nationality=" + nationality + ", country=" + country + ", phoneNumber="
				+ phoneNumber + ", pob=" + pob + ", emailNum=" + emailNum + ", emailPersonal=" + emailPersonal
				+ ", currentAddress=" + currentAddress + ", currentPosition=" + currentPosition
				+ ", currentOrganization=" + currentOrganization + ", currentPositionEntryDate="
				+ currentPositionEntryDate + ", pwd=" + pwd + "]";
	}
	
}
