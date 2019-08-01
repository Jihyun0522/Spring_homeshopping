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
	<div class="panel-heading">제품 자세히</div>
	<div class="panel-body">
		<div class="form-group">
			<img src="${product.imgsrc}" height="300px">
		</div>
		<div class="form-group">
			<label for="proname">제품명</label>
			<input name='title' id="proname" value="${product.proname}" readonly="readonly" class="form-control">
		</div>
		<div class="form-group">
			<label>내용</label>
			<textarea name='content' readonly="readonly" class="form-control">${product.content}</textarea>
		</div>
		<div class="form-group">
			<label>가격</label>
			<input name='price' value="${product.price}" readonly="readonly" class="form-control">
		</div>
		<div class="form-group">
			<label>수량</label>
			<input name='amount' value="${product.amount}" readonly="readonly" class="form-control">
		</div>
		<a href="/product/modify?proname=${product.proname}" class="btn btn-info">수정</a>
		<a href="/product/remove?proname=${product.proname}" class="btn btn-info">삭제</a>
		<a href="/product/list" class="btn btn-info">목록으로</a>
	</div>
	</div>
</div>
</body>
</html>