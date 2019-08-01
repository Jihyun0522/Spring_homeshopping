<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
	<div class="panel-heading">제품 목록 페이지
		<a href="/product/register" class="btn btn-info">Register(등록)</a>
	</div>
	<div class="panel-body">
		<div class="form-group">
			<form action="/product/list" method="post">
				<select name="type">
					<option value="">----</option>
					<option value="proname">제품명</option>
					<option value="content">내 용</option>
				</select>
				<input type="text" name="keyword">
				<button class="btn btn-primary">검 색</button>
			</form>
		</div>
		<table class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
					<th>제품명</th>
					<th>가격</th>
					<th>수량</th>
					<th>구매</th>
				</tr>
			</thead>
			<c:forEach items="${list}" var="product">
			<tr>
				<td>
					<a href="/product/get?bno=<c:out value='${product.proname}'/>">
						<c:out value="${product.proname}"></c:out>
					</a>
				</td>
				<td><c:out value="${product.price}"></c:out></td>
				<td><c:out value="${product.amount}"></c:out></td>
				<td><a href="/product/buy" class="btn btn-info">구매하기</a></td>
			</tr>
			</c:forEach>
		</table>
	</div>
	</div>
</div>
</body>
</html>