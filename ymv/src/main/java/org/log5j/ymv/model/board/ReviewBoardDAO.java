package org.log5j.ymv.model.board;

public interface ReviewBoardDAO {

	public void deleteReviewAdmin(int boardNo);

	public void registerReview(ReviewBoardVO rvo);

}
