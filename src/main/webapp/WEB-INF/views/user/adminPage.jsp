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
	<div class="panel-heading">유저 목록 페이지
		<a href="/product/list" class="btn btn-info">돌아가기</a>
	</div>
	<div class="panel-body">
		<table class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
					<th>유저이름</th>
					<th>유저아이디</th>
					<th>유저비밀번호</th>
					<th>유저권한</th>
				</tr>
			</thead>
			<c:forEach items="${list}" var="user">
			<tr>
				<td><c:out value="${user.name}"></c:out></td>
				<td><c:out value="${user.id}"></c:out></td>
				<td><c:out value="${user.password}"></c:out></td>
				<td><c:out value="${user.role}"></c:out></td>
			</tr>
			</c:forEach>
		</table>
	</div>
	</div>
</div>
</body>
</html>