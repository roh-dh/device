<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>img 태그</title>
</head>
<body>
	
	<!-- 외부 이미지 -->
	<img alt="연습이미지" src="https://i.pinimg.com/originals/5f/8e/f5/5f8ef59193d4b20e0b99a45272dc9eae.jpg" width="300" height="200">
	<hr>
	<img alt="연습이미지" src="https://i.pinimg.com/originals/5f/8e/f5/5f8ef59193d4b20e0b99a45272dc9eae.jpg" width="100%" height="200">
	
	<hr>
	<!-- 내가 가진 이미지 -->
	<!-- 절대 경로 : absolute path, 전체 주소를 이용하여 작성 -->
	<img alt="늑대이미지" src="http://localhost:8080/study/image/wolf.jpg" width="200" height="400">
	<img alt="늑대이미지" src="//localhost:8080/study/image/wolf.jpg" width="200" height="400">
	<img alt="늑대이미지" src="/study/image/wolf.jpg" width="200" height="400">
	
	<!-- 상대 경로 : relative path, 현위치를 기준으로 하여 계산 -->
	<!-- ../ 는 상위경로 ./는 현재 경로를 의미 -->
	<img alt="늑대이미지" src="../../image/wolf.jpg" width="200" height="400">
	
</body>
</html>










