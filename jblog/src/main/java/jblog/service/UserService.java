package jblog.service;

import jblog.vo.UserVo;

public interface UserService {

	public boolean join(UserVo vo); //가입
	public UserVo getUser(String id,String password); //로그인용
	public UserVo getUser(String id); //중복 체크 아이디
}
