<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- <form action="http://localhost:8080/study/tag/form/test02.jsp"> -->
	<form action ="test02.jsp">
	<!-- 입력창 : input, select, textarea중 하나 -->
	<!-- name: 전송될 데이터의 파라미터 이름 -->
	<!-- value : 표시될 글자 + 전송될 데이터 -->
		<input type="text" name="q">
		<input type="email">
		
		
		<!-- 전송(submit)버튼 : 검색 등 -->
		<input type="submit" value="검색">
		
	</form>
</body>
</html>