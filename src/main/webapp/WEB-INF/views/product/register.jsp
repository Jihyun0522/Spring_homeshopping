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
	<div class="panel-heading">제품등록</div>
	<div class="panel-body">
		<form action="/product/register" method="post">
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
				<textarea name="content" id="content"></textarea>
			</div>
			<div class="form-group">
				<label for="price">가격</label>
				<input type="number" name="price" id="price">
			</div>
			<div class="form-group">
				<label for="amount">수량</label>
				<input type="number" name="amount" id="amount">
			</div>
			<button type="submit" class="btn btn-info">등록</button>
			<a href="/product/list" class="btn btn-info">목록으로</a>
		</form>
	</div>
	</div>
</div>
</body>
</html>