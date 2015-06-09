package org.log5j.ymv.model;

public class QnABoardVO {
	private int qnaNo;
	private int memberNo;
	private String title;
	private String writer;
	private String content;
	private int ref;
	private int restep;
	private int relevel;
	public QnABoardVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QnABoardVO(int qnaNo, int memberNo, String title, String writer,
			String content, int ref, int restep, int relevel) {
		super();
		this.qnaNo = qnaNo;
		this.memberNo = memberNo;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.ref = ref;
		this.restep = restep;
		this.relevel = relevel;
	}
	public int getQnaNo() {
		return qnaNo;
	}
	public void setQnaNo(int qnaNo) {
		this.qnaNo = qnaNo;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
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
	public int getRef() {
		return ref;
	}
	public void setRef(int ref) {
		this.ref = ref;
	}
	public int getRestep() {
		return restep;
	}
	public void setRestep(int restep) {
		this.restep = restep;
	}
	public int getRelevel() {
		return relevel;
	}
	public void setRelevel(int relevel) {
		this.relevel = relevel;
	}
	@Override
	public String toString() {
		return "QNABoardVO [qnaNo=" + qnaNo + ", memberNo=" + memberNo
				+ ", title=" + title + ", writer=" + writer + ", content="
				+ content + ", ref=" + ref + ", restep=" + restep
				+ ", relevel=" + relevel + "]";
	}
	
	
}
