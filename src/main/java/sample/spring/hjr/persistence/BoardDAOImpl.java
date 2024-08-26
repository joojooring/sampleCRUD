package sample.spring.hjr.persistence;

import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import sample.spring.hjr.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace="sample.spring.hjr.mapper.BoardMapper";
	
	@Override
	public void create(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		session.insert(namespace+".create", vo);
	}

	@Override
	public BoardVO read(Integer no) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".read", no);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		session.update(namespace+".update",vo);
	}

	@Override
	public void delete(int no) throws Exception {
		// TODO Auto-generated method stub
		session.delete(namespace+".delete",no);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".listAll");
	}

}
