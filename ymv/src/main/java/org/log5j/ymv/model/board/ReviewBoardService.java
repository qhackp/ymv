package org.log5j.ymv.model.board;

public interface ReviewBoardService {
	
	public void deleteReviewAdmin(int boardNo);
	
	public void registerReview(ReviewBoardVO rvo);

	public ListVO getBoardList(String pageNo);
	
}