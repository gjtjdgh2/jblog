package jblog.vo;

import java.util.Date;

public class UserVo {
	private Long userNo;
	private String id;
	private String userName;
	private String password;
	private Date regdate;
	
	public UserVo() {
		
	}
	

	public Long getUserNo() {
		return userNo;
	}

	public void setUserNo(Long userNo) {
		this.userNo = userNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "UserVo [userNo=" + userNo + ", id=" + id + ", userName=" + userName + ", password=" + password
				+ ", regdate=" + regdate + "]";
	}
	
	
}
