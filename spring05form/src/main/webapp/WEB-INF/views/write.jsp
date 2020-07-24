<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<h1>게시판</h1>

<form method="post" action="write">
	<select name="board_type">
		<option>선택하세요</option> 
		<option value="막장 게시판">막장 게시판</option>
		<option value="아무 게시판">아무 게시판</option>
	</select> 
	<br><br>
	제목<input type="text" name="board_title"> 
	<br><br>
	내용<textarea name="board_content" style="width:500; height:500"></textarea>
	<br><br>
	<input type="submit" value="확인">
</form>
