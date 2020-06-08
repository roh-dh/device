<%@page import="study.beans.StudentDto"%>
<%@page import="java.util.List"%>
<%@page import="study.beans.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String q =request.getParameter("q");

StudentDao sdao = new StudentDao();
List<StudentDto> list = sdao.search(q);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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

