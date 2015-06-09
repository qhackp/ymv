package org.log5j.ymv.model;

public class PictureVO {
	private int pictureNo;
	private String boardType;
	private int memberNo;
	private int boardNo;
	private String pictureName;
	public PictureVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PictureVO(int pictureNo, String boardType, int memberNo,
			int boardNo, String pictureName) {
		super();
		this.pictureNo = pictureNo;
		this.boardType = boardType;
		this.memberNo = memberNo;
		this.boardNo = boardNo;
		this.pictureName = pictureName;
	}
	public int getPictureNo() {
		return pictureNo;
	}
	public void setPictureNo(int pictureNo) {
		this.pictureNo = pictureNo;
	}
	public String getBoardType() {
		return boardType;
	}
	public void setBoardType(String boardType) {
		this.boardType = boardType;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getPictureName() {
		return pictureName;
	}
	public void setPictureName(String pictureName) {
		this.pictureName = pictureName;
	}
	@Override
	public String toString() {
		return "PictureVO [pictureNo=" + pictureNo + ", boardType=" + boardType
				+ ", memberNo=" + memberNo + ", boardNo=" + boardNo
				+ ", pictureName=" + pictureName + "]";
	}
	
	
}
