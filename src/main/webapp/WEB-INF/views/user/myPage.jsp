<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<div class="row">
	<div class="panel panel-default">
	<div class="panel-heading">마이페이지</div>
	<div class="panel-body">
			<div class="form-group">
				<label for="name">이름</label>
				<input type="text" name="name" id="name" class="form-control" value="${login.name}" readonly="readonly">
			</div>
			<div class="form-group">
				<label for="id">아이디</label>
				<input type="text" name="id" id="id" class="form-control" value="${login.id}" readonly="readonly">
			</div>
			<div class="form-group">
				<label for="password">비밀번호</label>
				<input type="text" name="password" id="password" class="form-control" value="${login.password}" readonly="readonly">
			</div>
			<a href="/product/list" class="btn btn-info">목록으로</a>
			<a href="/user/remove?id=${login.id}" class="btn btn-danger">회원탈퇴</a>
	</div>
	</div>
</div>
</body>
</html>