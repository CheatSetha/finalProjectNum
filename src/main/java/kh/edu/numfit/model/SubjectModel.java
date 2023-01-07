package kh.edu.numfit.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tblSubject")
public class SubjectModel {
	@Id
	private int subId;
	private String subject;
	private String faculty;
	private String major;
	private String semester;
	private String year;
	private String credit;
	private int hours;
	private String degree;
	private String code;
	public SubjectModel() {
		
	}
	public SubjectModel(int subId, String subject, String faculty, String major, String semester, String year,
			String credit, int hours, String degree, String code) {
		super();
		this.subId = subId;
		this.subject = subject;
		this.faculty = faculty;
		this.major = major;
		this.semester = semester;
		this.year = year;
		this.credit = credit;
		this.hours = hours;
		this.degree = degree;
		this.code = code;
	}
	public int getSubId() {
		return subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "SubjectModel [subId=" + subId + ", subject=" + subject + ", faculty=" + faculty + ", major=" + major
				+ ", semester=" + semester + ", year=" + year + ", credit=" + credit + ", hours=" + hours + ", degree="
				+ degree + ", code=" + code + "]";
	}
	
	
	
}
