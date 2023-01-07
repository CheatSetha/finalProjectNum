package kh.edu.numfit.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tblPromotion")
public class PromotionModel {
	@Id
	private int proId;
	private Date startDate;
	private Date endDate;
	private String promotion;
	private String groupNo;
	private String classNo;
	private String detail;
	public PromotionModel() {}
	public PromotionModel(int proId, Date startDate, Date endDate, String promotion, String groupNo, String classNo,
			String detail) {
		super();
		this.proId = proId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.promotion = promotion;
		this.groupNo = groupNo;
		this.classNo = classNo;
		this.detail = detail;
	}
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
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
	public String getPromotion() {
		return promotion;
	}
	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}
	public String getGroupNo() {
		return groupNo;
	}
	public void setGroupNo(String groupNo) {
		this.groupNo = groupNo;
	}
	public String getClassNo() {
		return classNo;
	}
	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	@Override
	public String toString() {
		return "PromotionModel [proId=" + proId + ", startDate=" + startDate + ", endDate=" + endDate + ", promotion="
				+ promotion + ", groupNo=" + groupNo + ", classNo=" + classNo + ", detail=" + detail + "]";
	}
	
}
