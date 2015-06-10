package org.log5j.ymv.controller;

import javax.annotation.Resource;

import org.log5j.ymv.model.board.ReviewBoardService;
import org.log5j.ymv.model.board.ReviewBoardVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class JHSController {
	@Resource(name="reviewBoardServiceImpl")
	private ReviewBoardService reviewBoardService;
	private Logger log=LoggerFactory.getLogger(getClass());
	
	@RequestMapping("/reviewBoard/deleteReviewAdmin.vol")
	public ModelAndView deleteReviewAdmin(int boardNo) {		
		reviewBoardService.deleteReviewAdmin(boardNo);
		return new ModelAndView("/reviewBoard/list","lvo",reviewBoardService.getBoardList("1"));
	}
	@RequestMapping(value="/reviewBoard/registerReview.vol",method=RequestMethod.POST)	
	public ModelAndView registerReview(ReviewBoardVO rvo) {	
		reviewBoardService.registerReview(rvo);
		return new ModelAndView("redirect:/reviewBoard/showContentNoHit.vol?no="+rvo.getBoardNo());
	}	
	}

