package org.log5j.ymv.model.board;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ReviewBoardDAOImpl implements ReviewBoardDAO {
	@Resource(name="sqlSessionTemplate")
	private SqlSessionTemplate sqlSessionTemplate;
	@Override
	public void deleteReviewAdmin(int boardNo) {
			sqlSessionTemplate.delete("reviewBoard.deleteReviewAdmin");
	}
	@Override
	public void registerReview(ReviewBoardVO rvo) {
		sqlSessionTemplate.selectOne("reviewBoard.registerReview");
		
	}

}
