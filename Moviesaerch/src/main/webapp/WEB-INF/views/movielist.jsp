<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyBatis 를 이용한 영화 정보 검색</title>
</head>
<body>
	<h1>영화검색</h1>
	<br>
	
	<table width="500" cellpadding="0" cellspacing="0" border="1">
		<tr>
			<td>이미지</td>
			<td>제목</td>
		</tr>
		<c:forEach items="${list}" var="dto">
		<tr>
			<td><img src="${dto.image}"></td>
			<td>${dto.title}</td>
		</tr>

		</c:forEach>
		<tr>
			<td colspan="5">검색된 결과는 ${size} </td>
		</tr>
		
		
	</table>


</body>
</html>