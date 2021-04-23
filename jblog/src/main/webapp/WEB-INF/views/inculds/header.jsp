<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div id="header">
	<img src="images/123.PNG" name="mainimage" width="300" height="150">
	
	<ul>
	
 
	<c:choose>
		<c:when test="${empty authUser }"> 
			<li><a href="<c:url value="/usr/join" />">회원가입</a></li>
			<li><a href="<c:url value="/usr/login" />">로그인</a></li>
		</c:when>
		<c:otherwise>
			<li><a href="<c:url value="/usr/logout" />">로그아웃</a></li>
			<li><a href="<c:url value="/{id}/joinform" />">내블로그</a></li>
			
		</c:otherwise>
		</c:choose>
	
		
	</ul>
</div>