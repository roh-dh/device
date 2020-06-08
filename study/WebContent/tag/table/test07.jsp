
<%@page import="study.beans.StudentDto"%>
<%@page import="java.util.List"%>
<%@page import="study.beans.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 
	목표 : 데이터베이스에 존재하는 student 테이블의 데이터를 불러와서 표로 출력
	- StudentDao의 getList 메소드 사용 
-->    
<%
	//StudentDao를 만든다 그리고 getList를 불러서 목록정보를 얻어낸다
	// -> jsp에서는 기본적으로 예외처리가 다 되어있으므로 생략이 가능
	StudentDao sdao = new StudentDao();
	List<StudentDto> list = sdao.getList();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 목록</title>
</head>
<body>
	
	<div align="center">
		<h1>학생 목록</h1>
		<table border="1">
			<thead>
				<tr>
					<th>번호</th>
					<th>이름</th>
					<th>점수</th>
					<th>등록일</th>
				</tr>
			</thead>
			<tbody>
				<%for(StudentDto sdto : list){ %>
				<tr>
					<td><%=sdto.getStudent_no()%></td>
					<td><%=sdto.getStudent_name()%></td>
					<td><%=sdto.getStudent_score()%></td>
					<td><%=sdto.getStudent_create()%></td>
				</tr>
				<%} %>
			</tbody>
		</table>
	</div>
	
</body>
</html>