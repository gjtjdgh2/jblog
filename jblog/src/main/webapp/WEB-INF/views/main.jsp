<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JBLOG 메인</title>
<link rel="stylesheet"
	href="<c:url value="/css/main.css"/>"/>
</head>
<body>
<div id="container">
<jsp:include page="/WEB-INF/views/inculds/header.jsp"/>

		<div id="wapper">
		<from id="select-font" modelAttribute="UserVo"
		name="selectfont" action="<c:url value="/usr/selectfont"/>" method="GET">
		<lable><input type="text"></lable>
		<input type="submit" value="검색">
		
		</from>
			<div id="content">
		<input  type="radio" name="gender" value="blogtitle" >블로그제목</radio>
		<input  type="radio" name="gender" value="blogmaster">블러거</radio><br>
					
			</div>
		</div>
	
	</div>
</body>
</html>