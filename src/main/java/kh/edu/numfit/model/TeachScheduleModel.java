package kh.edu.numfit.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tblTeachSchedule")
public class TeachScheduleModel {
	@Id
	private int tSid;
	private int proId;
	private int subId;
	private String teacherCode;
	private String classNo;
	private Date startDate;
	private Date endDate;
	private String googleCode;
	private String googleMeet;
	private String teachingDay;
	private String teachingTime;
	private int teachingTimeNo;
	private int teachingDuration;
	private int totalStudentInList;
	private int totalStudentInGoogle;
	private int studentAdd;
	private int studentDrop;
	public TeachScheduleModel() {}
	public TeachScheduleModel(int tSid, int proId, int subId, String teacherCode, String classNo, Date startDate,
			Date endDate, String googleCode, String googleMeet, String teachingDay, String teachingTime,
			int teachingTimeNo, int teachingDuration, int totalStudentInList, int totalStudentInGoogle, int studentAdd,
			int studentDrop) {
		super();
		this.tSid = tSid;
		this.proId = proId;
		this.subId = subId;
		this.teacherCode = teacherCode;
		this.classNo = classNo;
		this.startDate = startDate;
		this.endDate = endDate;
		this.googleCode = googleCode;
		this.googleMeet = googleMeet;
		this.teachingDay = teachingDay;
		this.teachingTime = teachingTime;
		this.teachingTimeNo = teachingTimeNo;
		this.teachingDuration = teachingDuration;
		this.totalStudentInList = totalStudentInList;
		this.totalStudentInGoogle = totalStudentInGoogle;
		this.studentAdd = studentAdd;
		this.studentDrop = studentDrop;
	}
	public int gettSid() {
		return tSid;
	}
	public void settSid(int tSid) {
		this.tSid = tSid;
	}
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public int getSubId() {
		return subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public String getTeacherCode() {
		return teacherCode;
	}
	public void setTeacherCode(String teacherCode) {
		this.teacherCode = teacherCode;
	}
	public String getClassNo() {
		return classNo;
	}
	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getGoogleCode() {
		return googleCode;
	}
	public void setGoogleCode(String googleCode) {
		this.googleCode = googleCode;
	}
	public String getGoogleMeet() {
		return googleMeet;
	}
	public void setGoogleMeet(String googleMeet) {
		this.googleMeet = googleMeet;
	}
	public String getTeachingDay() {
		return teachingDay;
	}
	public void setTeachingDay(String teachingDay) {
		this.teachingDay = teachingDay;
	}
	public String getTeachingTime() {
		return teachingTime;
	}
	public void setTeachingTime(String teachingTime) {
		this.teachingTime = teachingTime;
	}
	public int getTeachingTimeNo() {
		return teachingTimeNo;
	}
	public void setTeachingTimeNo(int teachingTimeNo) {
		this.teachingTimeNo = teachingTimeNo;
	}
	public int getTeachingDuration() {
		return teachingDuration;
	}
	public void setTeachingDuration(int teachingDuration) {
		this.teachingDuration = teachingDuration;
	}
	public int getTotalStudentInList() {
		return totalStudentInList;
	}
	public void setTotalStudentInList(int totalStudentInList) {
		this.totalStudentInList = totalStudentInList;
	}
	public int getTotalStudentInGoogle() {
		return totalStudentInGoogle;
	}
	public void setTotalStudentInGoogle(int totalStudentInGoogle) {
		this.totalStudentInGoogle = totalStudentInGoogle;
	}
	public int getStudentAdd() {
		return studentAdd;
	}
	public void setStudentAdd(int studentAdd) {
		this.studentAdd = studentAdd;
	}
	public int getStudentDrop() {
		return studentDrop;
	}
	public void setStudentDrop(int studentDrop) {
		this.studentDrop = studentDrop;
	}
	@Override
	public String toString() {
		return "TeachScheduleModel [tSid=" + tSid + ", proId=" + proId + ", subId=" + subId + ", teacherCode="
				+ teacherCode + ", classNo=" + classNo + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", googleCode=" + googleCode + ", googleMeet=" + googleMeet + ", teachingDay=" + teachingDay
				+ ", teachingTime=" + teachingTime + ", teachingTimeNo=" + teachingTimeNo + ", teachingDuration="
				+ teachingDuration + ", totalStudentInList=" + totalStudentInList + ", totalStudentInGoogle="
				+ totalStudentInGoogle + ", studentAdd=" + studentAdd + ", studentDrop=" + studentDrop + "]";
	}
	
	
	
}
