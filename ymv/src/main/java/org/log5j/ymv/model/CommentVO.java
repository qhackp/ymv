package org.log5j.ymv.model;

public class CommentVO {
	private int commentNo;
	private String boardType;
	private int memberNo;
	private int boardNo;
	private String writer;
	private String content;
	private String timePosted;
	public CommentVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CommentVO(int commentNo, String boardType, int memberNo,
			int boardNo, String writer, String content, String timePosted) {
		super();
		this.commentNo = commentNo;
		this.boardType = boardType;
		this.memberNo = memberNo;
		this.boardNo = boardNo;
		this.writer = writer;
		this.content = content;
		this.timePosted = timePosted;
	}
	public int getCommentNo() {
		return commentNo;
	}
	public void setCommentNo(int commentNo) {
		this.commentNo = commentNo;
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
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTimePosted() {
		return timePosted;
	}
	public void setTimePosted(String timePosted) {
		this.timePosted = timePosted;
	}
	@Override
	public String toString() {
		return "CommentVO [commentNo=" + commentNo + ", boardType=" + boardType
				+ ", memberNo=" + memberNo + ", boardNo=" + boardNo
				+ ", writer=" + writer + ", content=" + content
				+ ", timePosted=" + timePosted + "]";
	}
	
}
