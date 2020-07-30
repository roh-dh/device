<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<table border="1">
	<thead>
		<tr>
			<td>게시글번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>날짜</td>
			<td>조회수</td>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="boardDto" items="${list}">
			<tr>
				<td>${boardDto.board_no}</td>
				<td>${boardDto.board_title}</td>
				<td>${boardDto.board_writer}</td>
				<td>${boardDto.board_date}</td>
				<td>${boardDto.board_read}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<!-- 검색창 -->
<form action="union" method="post">
	<select name="type">
		<option value="board_title">제목만</option>
		<option value="board_writer">작성자</option>
	</select>
		
	<input type="text" name="keyword">
	
	
	<input type="submit" value="검색">
</form>