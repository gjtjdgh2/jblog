<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
	prefix="c" %>        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>

</head>
<body>
	<div id="container">
		<jsp:include page="/WEB-INF/views/inculds/navigation.jsp"/>
		<div id="wapper">
			<div id="content">
				<div id="site-introduction">
				
				
	<form id="login-form" 
		name="loginfrom" 
		method="POST" 
		action="<c:url value="/usr/login"/>">
		
		<label class="block-label" for="id">아이디</label> 
		<input id="id" name="id" type="text" value=""> 

		<label class="block-label">패스워드</label> 
		<input name="password" type="password" value="">
		<c:if test="${msg == false }">
		<p> 로그인 실패 <br/> 아이디/비밀번호를 확인해 주세요</p>
		</c:if>
		<input type="submit" value="로그인">
	</form>
	
	
	
    				</div>
			</div>
		</div>
	</div>
</body>
</html>