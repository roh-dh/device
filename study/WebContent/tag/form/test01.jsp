<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form 태그</title>
</head>
<body>
	
	<!-- form은 "데이터 전송"을 위한 태그. 반드시 전송할 데이터와 전송 버튼이 나와야 한다 -->
	<!-- action : form이 전송될 목적지 -->
<!-- 	<form action="http://localhost:8080/study/tag/form/test02.jsp"> -->
	<form action="test02.jsp">
		<!-- 입력창 : input, select, textarea 중 하나 -->
		<!-- name : 전송될 데이터의 파라미터 이름 -->		
		<!-- value : 표시될 글자 + 전송될 데이터 -->
		<input type="text" name="q">
		
		<!-- 전송(submit)버튼 : 검색 등 -->
		<input type="submit" value="검색">
	</form>
	
</body>
</html>




