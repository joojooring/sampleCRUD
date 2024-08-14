package sample.spring.hjr.service;

import sample.spring.hjr.domain.BoardVO;
import java.util.List;

public interface BoardService {

	public void regist(BoardVO board) throws Exception;
	public BoardVO read(Integer no) throws Exception;
	public void modify(BoardVO board) throws Exception;
	public void remove(int no) throws Exception;	
	public List<BoardVO> listAll() throws Exception;
}
