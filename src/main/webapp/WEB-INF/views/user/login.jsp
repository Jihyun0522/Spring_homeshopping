<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/user" method="post">
<label for="id">아이디</label>
<input type="text" name="id" id="id">
<label for="password">비밀번호</label>
<input type="text" name="password" id="password">
<button type="submit">로그인</button>
</form>
</body>
</html>