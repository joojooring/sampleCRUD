package sample.spring.hjr.controller;

import javax.inject.Inject;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import sample.spring.hjr.domain.BoardVO;
import sample.spring.hjr.service.BoardService;


@Controller
@RequestMapping(value="/")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value="/listAll", method=RequestMethod.GET)
	public void listAll(Model model) throws Exception {
		logger.info("전체페이지");
		model.addAttribute("list", boardService.listAll());
	}
	
	@RequestMapping(value="/regist", method = RequestMethod.GET)
	public void registGet(BoardVO board, Model model) throws Exception{
		logger.info("등록페이지");
		
	}
	
	@RequestMapping(value="/regist", method = RequestMethod.POST)
	public String registPost(BoardVO board, RedirectAttributes rttr) throws Exception{
		logger.info("등록");
		boardService.regist(board); // 글작성 service 호출
		return "redirect:/listAll";
	}
	
	@RequestMapping(value="/read", method=RequestMethod.GET)
	public void read(@RequestParam("no")int no, Model model) throws Exception{
		logger.info("읽기전용");
		model.addAttribute(boardService.read(no));
	}
	
	@RequestMapping(value="/modify", method=RequestMethod.GET)
	public void modifyGET(int no, Model model) throws Exception{
		logger.info("수정페이지");
		model.addAttribute(boardService.read(no));
	}
	
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String modify(BoardVO board, RedirectAttributes rttr) throws Exception{
		logger.info("수정");
		boardService.modify(board);
		return "redirect:/listAll";
	}
	
	@RequestMapping(value="/remove", method=RequestMethod.POST)
	public String remove(@RequestParam("no") int no, RedirectAttributes rttr) throws Exception{
		logger.info("삭제");
		boardService.remove(no); // 서비스에서 글삭제관련 호출
		return "redirect:/listAll";
		
	}
}
