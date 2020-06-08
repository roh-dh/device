<%@page import="study.beans.student.StudentDto"%>
<%@page import="study.beans.student.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//학생 상세정보 : student_no 를 받아서 Database 조회를 수행한 뒤 출력
	int student_no = Integer.parseInt(request.getParameter("student_no"));
	StudentDao sdao = new StudentDao();
	StudentDto sdto = sdao.get(student_no);
%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 상세 정보</title>
</head>
<body>
	
	<div align="center">
		
		<h2>학생 상세 정보</h2>
		
		<table border="1">
			<tbody>
				<tr>
					<th>번호</th>
					<td><%=sdto.getStudent_no()%></td>
				</tr>
				<tr>
					<th>이름</th>
					<td><%=sdto.getStudent_name()%></td>
				</tr>
				<tr>
					<th>점수</th>
					<td><%=sdto.getStudent_score()%></td>
				</tr>
				<tr>
					<th>등록일</th>
					<td><%=sdto.getStudent_create()%></td>
				</tr>
			</tbody>
		</table>
		
		<h3><a href="/study/tag/table/test07.jsp">돌아가기</a></h3>
		
	</div>
	
</body>
</html>