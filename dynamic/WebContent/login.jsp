<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<script>


		$(document).ready(function () {
		$("#submit").click(function(){
			var a = $('#id2').val();
			var b = "admin";
	
			if(a == b)
			 $("form").attr('action', 'Controller?command=admin');
			 else {
				 $("form").attr('action', 'Controller?command=Login_check');
			 }
		})
		})
</script>
</head>
<body>
	<h1>로그인</h1>
	<form method="post">
		ID: <input type="text" name="id" id="id2">
		PW: <input type="password" name="pw"/>
		<a href="signup.jsp">회원가입</a>
		<input type="submit" id="submit" value="로그인"/>
	</form>

</body>

</html>