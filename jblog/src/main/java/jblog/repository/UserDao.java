package jblog.repository;

import jblog.vo.UserVo;

public interface UserDao {

	public int insert(UserVo vo);
	public UserVo selectUser(String id,String password);
	public UserVo selectUser(String id);
}
