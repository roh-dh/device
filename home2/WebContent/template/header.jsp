<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내가 만든 홈페이지</title>
</head>
<body>

	<!-- 화면배치는 테이블로 하면 안되지만 빠른 구현을 위해 테이블로 하고 추후에 div로 교체 -->
	<div align="center">
		<table border="1" width="1000">
			<tbody>
				<!-- 상단(header) 영역 -->
				<tr height="100">
					<td align="center">
						<h1>JSP 2주만에 뽀개기</h1>
					</td>
				</tr>
				<!-- 메뉴(navigation) 영역 -->
				<tr>
					<td>
						<jsp:include page="/template/menu.jsp"></jsp:include>
					</td>
				</tr>
				<!-- 본문(section) 영역 -->
				<tr height="350">
					<td valign="top">