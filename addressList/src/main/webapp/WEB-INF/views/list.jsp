<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyBatis 주소록 리스트</title>
</head>
<body>
	<h1>MyBatis 주소록 리스트</h1>
	
	<form action="search" method="post" style="text-align:center;">
		<select name="searchoption">
			<option value="aName">이름</option>
			<option value="aContent">번호</option>
			<option value="aAddress">주소</option>
			<option value="aRelation">관계</option>
		</select>&nbsp;
		<input type="text" name="keyword" size="20">&nbsp;
		<input type="submit" class="btn" value="검색">
	</form>
	
	<table width="500" cellpadding="0" cellspacing="0" border="1">
		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>번호</td>
			<td>주소</td>
			<td>전자우편</td>
			<td>관계</td>
		</tr>
		<c:forEach items="${list}" var="dto">
		<tr>
			<td><a href="content_view?seq=${dto.seq}">${dto.seq}</a></td>
			<td>${dto.aName}</td>
			<td>${dto.aContent}</td>
			<td>${dto.aAddress}</td>
			<td>${dto.aEmail}</td>
			<td>${dto.aRelation}</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="5"> <a href="write_view">주소록 등록</a> </td>
		</tr>
		
		
	</table>


</body>
</html>