package kh.edu.numfit.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tblTeacherDetail")
public class TeacherDetail {
	@Id
	@Column(nullable = false)
	private int tdId;
	@Column(nullable = true)
	private int teachNo;
	@Column(nullable = true)
	private Date teachDate;
	@Column(nullable = true)
	private String content;
	@Column(nullable = true)
	private Date startTeach;
	@Column(nullable = true)
	private Date endTeach;
	@Column(nullable = true)
	private int studentAttendance;
	@Column(nullable = true)
	private int tsid;
	@Column(nullable = true)
	private String teachDetail;
	@Column(nullable = true)
	private int checkBy;
	@Column(nullable = true)
	private Date checkDate;
	
	public TeacherDetail() {
		
	}
	
	public TeacherDetail(int tdId, int teachNo, Date teachDate, String content, Date startTeach, Date endTeach,
			int studentAttendance, int tsid, String teachDetail, int checkBy, Date checkDate) {
		super();
		this.tdId = tdId;
		this.teachNo = teachNo;
		this.teachDate = teachDate;
		this.content = content;
		this.startTeach = startTeach;
		this.endTeach = endTeach;
		this.studentAttendance = studentAttendance;
		this.tsid = tsid;
		this.teachDetail = teachDetail;
		this.checkBy = checkBy;
		this.checkDate = checkDate;
	}

	public int getTdId() {
		return tdId;
	}
	public void setTdId(int tdId) {
		this.tdId = tdId;
	}
	public int getTeachNo() {
		return teachNo;
	}
	public void setTeachNo(int teachNo) {
		this.teachNo = teachNo;
	}
	public Date getTeachDate() {
		return teachDate;
	}
	public void setTeachDate(Date teachDate) {
		this.teachDate = teachDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getStartTeach() {
		return startTeach;
	}
	public void setStartTeach(Date startTeach) {
		this.startTeach = startTeach;
	}
	public Date getEndTeach() {
		return endTeach;
	}
	public void setEndTeach(Date endTeach) {
		this.endTeach = endTeach;
	}
	public int getStudentAttendance() {
		return studentAttendance;
	}
	public void setStudentAttendance(int studentAttendance) {
		this.studentAttendance = studentAttendance;
	}
	public int getTsid() {
		return tsid;
	}
	public void setTsid(int tsid) {
		this.tsid = tsid;
	}
	public String getTeachDetail() {
		return teachDetail;
	}
	public void setTeachDetail(String teachDetail) {
		this.teachDetail = teachDetail;
	}
	public int getCheckBy() {
		return checkBy;
	}
	public void setCheckBy(int checkBy) {
		this.checkBy = checkBy;
	}
	public Date getCheckDate() {
		return checkDate;
	}
	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}

	@Override
	public String toString() {
		return "TeacherDetail [tdId=" + tdId + ", teachNo=" + teachNo + ", teachDate=" + teachDate + ", content="
				+ content + ", startTeach=" + startTeach + ", endTeach=" + endTeach + ", studentAttendance="
				+ studentAttendance + ", tsid=" + tsid + ", teachDetail=" + teachDetail + ", checkBy=" + checkBy
				+ ", checkDate=" + checkDate + "]";
	}
	
}

