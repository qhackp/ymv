package org.log5j.ymv.model.board;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class ReviewBoardServiceImpl implements ReviewBoardService {
@Resource(name="reviewBoardDAOImpl")
ReviewBoardDAO reviewBoardDAO;

@Override
public void deleteReviewAdmin(int boardNo) {
	reviewBoardDAO.deleteReviewAdmin(boardNo);
	
}

@Override
public void registerReview(ReviewBoardVO rvo) {
	reviewBoardDAO.registerReview(rvo);
	
}

@Override
public ListVO getBoardList(String string) {
	
	return null;
}
}