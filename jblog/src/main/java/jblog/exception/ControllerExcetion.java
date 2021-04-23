package jblog.exception;

import javax.servlet.http.HttpServletRequest;

public class ControllerExcetion extends RuntimeException{
	private HttpServletRequest req;
	//예외 상황의 요청 정보를 저장해 둘 필드
	
	public ControllerExcetion(String message) {
		super(message);
	}
	public ControllerExcetion(String message, HttpServletRequest req) {
		super(message);
		this.req=req;
	}

	public HttpServletRequest getReq() {
		return req;
	}

	public void setReq(HttpServletRequest req) {
		this.req = req;
	}
	

}
