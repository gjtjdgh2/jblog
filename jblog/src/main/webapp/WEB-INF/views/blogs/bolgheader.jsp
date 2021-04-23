<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
		<h1>${authUser.userName }의 블러그 입니다</h1>
		<ul>
		<c:choose>
		<c:when test="${empty authUser }"> 
			<li><a href="<c:url value="/usr/join" />">회원가입</a></li>
			<li><a href="<c:url value="/usr/login" />">로그인</a></li>
		</c:when>
		<c:otherwise>
		<li><a href="<c:url value="/{id}/admin/basic" />">내블로그 관리</a></li>
			<li><a href="<c:url value="/usr/logout" />">로그아웃</a></li>
			
			
		</c:otherwise>
		</c:choose>
		</ul>
	</div>

</body>
</html>