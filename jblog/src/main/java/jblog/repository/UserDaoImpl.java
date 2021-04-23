package jblog.repository;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



import jblog.exception.UserDaoException;
import jblog.vo.UserVo;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	private static Logger logger= LoggerFactory.getLogger(UserDaoImpl.class);
	@Autowired
	private SqlSession sqlSession;
	
	
	@Override
	public int insert(UserVo vo) {
		int insertCont =0;
		try {
			insertCont = sqlSession.insert("users.insert",vo);
		}catch(Exception e) {
			logger.error("예외 발생: "+e.getMessage());
			throw new UserDaoException("회원가입중 오류"+vo);
		}
		return insertCont;
	}

	@Override
	public UserVo selectUser(String id, String password) {
		Map<String,String> userMap= new HashMap<>();
		userMap.put("id", id);
		userMap.put("password", password);
		UserVo vo = sqlSession.selectOne("users.selectUserLogin",userMap );
		return vo;
	}

	@Override
	public UserVo selectUser(String id) {
		UserVo vo = sqlSession.selectOne("users.selectUserId",id);
		return vo;
	}

}
