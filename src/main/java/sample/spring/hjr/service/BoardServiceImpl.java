package sample.spring.hjr.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sample.spring.hjr.domain.BoardVO;
import sample.spring.hjr.persistence.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDAO boardDAO;
	

	@Override
	public void regist(BoardVO board) throws Exception {
		// TODO Auto-generated method stub
		boardDAO.create(board);
	}

	@Override
	public BoardVO read(Integer no) throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.read(no);
	}

	@Override
	public void modify(BoardVO board) throws Exception {
		// TODO Auto-generated method stub
		boardDAO.update(board);
	}

	@Override
	public void remove(int no) throws Exception {
		// TODO Auto-generated method stub
		boardDAO.delete(no);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.listAll();
	}

}
