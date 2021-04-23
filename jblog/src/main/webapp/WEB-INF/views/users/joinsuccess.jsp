<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
	prefix="c" %>        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Portal</title>
<link rel="stylesheet"
	href="<c:url value="/assets/css/user.css" />" />
</head>
<body>
	<div id="container">
	<jsp:include page="/WEB-INF/views/inculds/header.jsp"/>
<jsp:include page="/WEB-INF/views/inculds/navigation.jsp"/>
		<div id="wapper">
			<div id="content">
				<div id="site-introduction">
				
	
	<p class="jr-success">
		"감사합니다.회원가입및 블로그가 성공적으로 만들어 졌습니다"
	</p>
	<p>
		<a href="<c:url value="/usr/login"/>">로그인하기</a>
	</p>

				</div>
			</div>
		</div>
		
	</div>
</body>
</html>