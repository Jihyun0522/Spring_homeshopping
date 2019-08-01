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
	<div class="panel-heading">로그인</div>
	<div class="panel-body">
		<form action="/user/login" method="post">
			<div class="form-group">
				<label for="loginId">아이디</label>
				<input type="text" name="loginId" id="loginId">
			</div>
			<div class="form-group">
				<label for=loginPw>비밀번호</label>
				<input type="text" name="loginPw" id="loginPw">
			</div>
			<div class="form-group">
				<label for="cookie">
					<input type="checkbox" name="loginCookie" id="cookie"> 자동로그인
				</label>
			</div>
			<button type="submit" class="btn btn-info">로그인</button>
		</form>
	</div>
	</div>
</div>
</body>
</html>