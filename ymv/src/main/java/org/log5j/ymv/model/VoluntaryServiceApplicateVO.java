package org.log5j.ymv.model;
//얘도 다시생각
public class VoluntaryServiceApplicateVO {
	private int applicateNo;
	private int memberNo;
	public VoluntaryServiceApplicateVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VoluntaryServiceApplicateVO(int applicateNo, int memberNo) {
		super();
		this.applicateNo = applicateNo;
		this.memberNo = memberNo;
	}
	public int getApplicateNo() {
		return applicateNo;
	}
	public void setApplicateNo(int applicateNo) {
		this.applicateNo = applicateNo;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	@Override
	public String toString() {
		return "VoluntaryServiceApplicateVO [applicateNo=" + applicateNo
				+ ", memberNo=" + memberNo + "]";
	}
	
	
}
