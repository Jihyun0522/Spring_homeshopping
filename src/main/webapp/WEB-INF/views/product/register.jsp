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
	<div class="panel-heading">회원가입</div>
	<div class="panel-body">
		<form action="/user/register" method="post">
			<div class="form-group">
				<label for="imgsrc">제품이미지링크</label>
				<input type="text" name="imgsrc" id="imgsrc">
			</div>
			<div class="form-group">
				<label for="proname">제품명</label>
				<input type="text" name="proname" id="proname">
			</div>
			<div class="form-group">
				<label for="content">내용</label>
				<input type="text" name="content" id="content">
			</div>
			<div class="form-group">
				<label for="price">가격</label>
				<input type="text" name="price" id="price">
			</div>
			<div class="form-group">
				<label for="amount">수량</label>
				<input type="text" name="amount" id="amount">
			</div>
			<button type="submit" class="btn btn-info">회원가입</button>
		</form>
	</div>
	</div>
</div>
</body>
</html>