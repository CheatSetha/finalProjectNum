package kh.edu.numfit.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name= "tblTeachers")
public class TeacherModel {
	@Id
	private String teacherCode;
	private String nameEn;
	private String nameKh;
	private String gender;
	@Temporal(TemporalType.DATE)
	private Date dob;
	private String nationality;
	private String country;
	private String phoneNumber;
	private String pob;
	private String emailNum;
	private String emailPersonal;
	private String currentAddress;
	private String currentPosition;
	private String currentOrganization;
	private String currentPositionEntryDate;
	private String pwd;
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
