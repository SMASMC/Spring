<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table cellpadding="0" cellspacing="0" border="1">
		<form action="updatelist" method="post">
			<input type="hidden" name="seq" value="${content_view.seq}">
			<tr>
				<td> 번호 </td>
				<td> ${content_view.seq} </td>
			</tr>
			<tr>
				<td> 이름 </td>
				<td> <input type="text" name="aName" value="${content_view.aName}"></td>
			</tr>
			<tr>
				<td> 번호 </td>
				<td> <input type="text" name="aContent" value="${content_view.aContent}"></td>
			</tr>
			<tr>
				<td> 주소 </td>
				<td> <textarea rows="5" cols="10" name="aAddress" >${content_view.aAddress}</textarea></td>
			</tr>
			<tr>
				<td> Email </td>
				<td> <textarea rows="5" cols="10" name="aEmail" >${content_view.aEmail}</textarea></td>
			</tr>
			<tr>
				<td> 관계 </td>
				<td> <textarea rows="5" cols="5" name="aRelation" >${content_view.aRelation}</textarea></td>
			</tr>
			<tr >
				<td colspan="2"> <input type="submit" value="수정"> &nbsp;&nbsp; <a href="list">목록보기</a> &nbsp;&nbsp; <a href="deleteDao?seq=${content_view.seq}">삭제</a> &nbsp;&nbsp; </td>
			</tr>
		</form>
	</table>


</body>
</html>