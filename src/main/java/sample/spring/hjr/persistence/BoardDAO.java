package sample.spring.hjr.persistence;

import java.util.List;
import sample.spring.hjr.domain.BoardVO;

public interface BoardDAO {
	
	public void create(BoardVO vo) throws Exception;
	public BoardVO read(Integer no) throws Exception;
	public void update(BoardVO vo) throws Exception;
	public void delete(int no) throws Exception;
	public List<BoardVO> listAll() throws Exception;
}
