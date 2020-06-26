<%@page import="study.beans.student.StudentDto"%>
<%@page import="java.util.List"%>
<%@page import="study.beans.student.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 목표 : test01.jsp에서 전송한 데이터를 수신하여 검색 결과를 출력(목록) -->

<%
	//jsp에서는 HttpServletRequest를 request라는 내장객체로 관리한다.
	String q = request.getParameter("q");
	
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
		
		<h5>검색 결과는 총 <%=list.size()%>개입니다</h5>
		
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





