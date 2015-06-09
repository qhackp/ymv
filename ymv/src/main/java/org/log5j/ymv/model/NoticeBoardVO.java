package org.log5j.ymv.model;

public class NoticeBoardVO {
	private int memberNo;
	private int boardNo;
	private String title;
	private String writer;
	private String content;
	public NoticeBoardVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NoticeBoardVO(int memberNo, int boardNo, String title,
			String writer, String content) {
		super();
		this.memberNo = memberNo;
		this.boardNo = boardNo;
		this.title = title;
		this.writer = writer;
		this.content = content;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	@Override
	public String toString() {
		return "NoticeBoardVO [memberNo=" + memberNo + ", boardNo=" + boardNo
				+ ", title=" + title + ", writer=" + writer + ", content="
				+ content + "]";
	}
	
	
}
