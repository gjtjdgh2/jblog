<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
<script src="<c:url value="/jquery/jquery-3.6.0.js"/>"></script>
<script src="<c:url value="/jquery/users.js"/>"></script>
</head>
<body>
	<div id="container">
		

		<div id="wapper">
			<div id="content">
				<div id="site-introduction">
				
	<h1>회원 가입</h1>
	
	<form
		id="join-form"
		name="registerForm" 
		action="<c:url value="/usr/join"/>"
		method="POST" onsubmit="return checkForm(this)"
		>
		<input type="hidden" name="check" value="f">
		<input type="hidden" name="a" value="join">
		
		<label for="userName">이름</label><br/>
		<input name="userName" typr="text" placeholder="이름을 입력하십시오"><br/>
		
		<label for="id">아이디</label><br/>
		<input name="id" typr="text" placeholder="아이디을 입력하십시오">
		<input type="button" value="id중복체크"
		onclick="checkid(this.form.id, '<c:url value="/usr/idcheck"/>')"/>
		<br/>
		
		<label for="password">비밀번호</label>
		<input name="password" type="password" placeholder="비밀번호를 입력하십시오"><br/>
		
		<label for="cbox" >약관동의</label>
		<input type="checkbox" id="cbox" /><br/>
		<input type="submit" vlaue="회원가입">
				

	
	</form>
		
				</div>
			</div>
		</div>
		
	</div>
</body>
</html>