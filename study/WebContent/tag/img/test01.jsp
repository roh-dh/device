<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
퉁퉁이 성형외과
<hr>
<meta charset="UTF-8">
<title>img 태그 </title>
</head>
<body>
	<!-- 이미지 -->
	<!--
	<img>:이미지 삽입태그
속성 
src : 이미지 경로
alt : 이미지 표시할수없을때 출력내용
width : 이미지의 가로 크기
height : 이미지의 세로 크기
loading : 이미지 로딩 방식 loading="lazy" 이미지 일부만  
-->
	
	before
	<hr>
	<img alt = "퉁퉁이" src= "data:image/jpeg;base64,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">
	<hr>

	after
	<hr>
	<img alt = "연습이미지" src= "/study/image/퉁퉁이.jfif"width="200"height="200">
	<!-- img alt = "퉁퉁이	" src= "../../image/퉁퉁이.jfif"width="200"height="200"-->
	
</body>
</html>