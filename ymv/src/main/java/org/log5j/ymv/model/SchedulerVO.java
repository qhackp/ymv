package org.log5j.ymv.model;

import java.sql.Date;

public class SchedulerVO {
	private int memberNo;
	private Date time_date;
	private String field;
	private String location;
	public SchedulerVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SchedulerVO(int memberNo, Date time_date, String field,
			String location) {
		super();
		this.memberNo = memberNo;
		this.time_date = time_date;
		this.field = field;
		this.location = location;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public Date getTime_date() {
		return time_date;
	}
	public void setTime_date(Date time_date) {
		this.time_date = time_date;
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
	@Override
	public String toString() {
		return "SchedulerVO [memberNo=" + memberNo + ", time_date=" + time_date
				+ ", field=" + field + ", location=" + location + "]";
	}
	
}
