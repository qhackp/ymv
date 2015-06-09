package org.log5j.ymv.model;
//area => location
// timeHr,date 타입 다시 생각
public class RecruitBoardVO {
	private int recruitNo;
	private String title;
	private String field;
	private String location;
	private String timeHr;
	private String date;
	public RecruitBoardVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RecruitBoardVO(int recruitNo, String title, String field,
			String location, String timeHr, String date) {
		super();
		this.recruitNo = recruitNo;
		this.title = title;
		this.field = field;
		this.location = location;
		this.timeHr = timeHr;
		this.date = date;
	}
	public int getRecruitNo() {
		return recruitNo;
	}
	public void setRecruitNo(int recruitNo) {
		this.recruitNo = recruitNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTimeHr() {
		return timeHr;
	}
	public void setTimeHr(String timeHr) {
		this.timeHr = timeHr;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "RecruitBoardVO [recruitNo=" + recruitNo + ", title=" + title
				+ ", field=" + field + ", location=" + location + ", timeHr="
				+ timeHr + ", date=" + date + "]";
	}
	
	
}
