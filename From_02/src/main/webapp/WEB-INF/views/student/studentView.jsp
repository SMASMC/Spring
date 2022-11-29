<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	Get<br>
	<form action="student" method="get">
	student id: <input type="text" class="form-control" name="studentId"><br>
	<input type="submit" value="전송">
	</form>
	post<br>
	<form action="student" method="post">
	student id: <input type="text" class="form-control" name="studentId"><br>
	<input type="submit" value="전송">
	</form>
	post dto
	<form action="studentdto" method="post">
	student id: <input type="text" class="form-control" name="studentId"><br>
	<input type="submit" value="전송">
	</form>
	
</body>
</html>