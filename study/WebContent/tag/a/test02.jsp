<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>
<!-- 위로 올라간다  ../ -->
		<a href= "../../student/list.do">  
		<img src="data:image/jpeg;base64,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">
		</a>
	</h1>
</body>
</html>