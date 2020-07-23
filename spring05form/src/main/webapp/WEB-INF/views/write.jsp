<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<h1>게시판</h1>

<form method="post" action="write">
	<select name="board_type">
		<option value="막장 게시판"></option>
		<option value="아무 게시판"></option>
	</select> 
	<br><br>
	제목<input type="text" name="board_title"> 
	<br><br>
	내용<textarea name="board_content"></textarea>
	<br><br>
	확인<input type="submit" value="확인">
</form>
