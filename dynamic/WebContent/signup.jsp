<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원가입</h1>
	<form action="Controller2?command=signUp_check" method="post">
		ID: <input type="text" name="id" id="id2">
		PW: <input type="password" name="pw"/>
		NAME:  <input type="text" name="name">
		<input type="submit" id="submit" value="회원가입"/>
	</form>
</body>
</html>