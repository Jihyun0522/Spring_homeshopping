<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="row">
	<div class="panel panel-default">
	<div class="panel-heading">마이페이지</div>
	<div class="panel-body">
			<div class="form-group">
				<label for="name">이름</label>
				<input type="text" name="name" id="name" value="${user.name}">
			</div>
			<div class="form-group">
				<label for="id">아이디</label>
				<input type="text" name="id" id="id" value="${user.id}">
			</div>
			<div class="form-group">
				<label for="password">비밀번호</label>
				<input type="text" name="password" id="password" value="${user.password}">
			</div>
			<button type="submit">회원정보 수정</button>
			<a href="/user/remove?id=${user.id}">회원탈퇴</a>
	</div>
	</div>
</div>
</body>
</html>