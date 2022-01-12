<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%
   String a = request.getParameter("id2");
	System.out.println(a);
   %>
<!DOCTYPE html>
<html>
<head>
<style>
	.container {
		margin: 0 auto;
		width:1100px;
	}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<script>
	$(function(){
		$('#button').click(function(){
			alert('로그아웃 되었습니다');
			location.href = "login.jsp";
		})
	})
</script>
</head>
<body>
<div class="container">
	<h1>메인페이지</h1>
	<button type="button" id="button" style="float:right;">로그아웃</button>
	<br><br>
	<h3>구입할 컨텐츠를 선택하세요</h3>
	<br>
	<a><img src="./image/Intro_350_408.png"></a>
	<a><img src="./image/Java_350_408.png"></a>
	<a><img src="./image/Cpp_350_408.png"></a>
	<br>
	<br>
	<br>
	<br>
	<a><img src="./image/korea_it.png" style="float:right;"></a>
</div>
</body>
</html>