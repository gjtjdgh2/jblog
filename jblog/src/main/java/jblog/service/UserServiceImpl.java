package jblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jblog.repository.UserDao;
import jblog.vo.UserVo;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	@Override
	public boolean join(UserVo vo) {
		int insertCont = userDao.insert(vo);
		return insertCont==1;
	}

	@Override
	public UserVo getUser(String id, String password) {
		UserVo vo =  userDao.selectUser(id, password);
		return vo;
	}

	@Override
	public UserVo getUser(String id) {
		UserVo vo =userDao.selectUser(id);
		return vo;
	}

}
