<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 학생 등록 화면 -->    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 등록</title>
</head>
<body>

	<div align="center">
		
		<h2>학생 등록</h2>
		
		<!-- 데이터 전송을 위한 form -->
		<form action="/study/student/regist.do">
			
			<!-- 이름 입력창 -->
			<input type="text" name="student_name"> <br><br>
			
			<!-- 점수 입력창 -->
			<input type="number" name="student_score"> <br><br>
			
			<input type="submit" value="등록">
		
		</form>
		
	</div>

</body>
</html>