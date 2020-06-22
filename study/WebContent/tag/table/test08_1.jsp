<%@page import="study.beans.client.ClientDto"%>
<%@page import="java.util.List"%>
<%@page import="study.beans.client.ClientDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//처리
	ClientDao cdao = new ClientDao();
	List<ClientDto> list = cdao.getList();
%>

<!-- --------------------------------------------------------------------------- -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록</title>
</head>
<body>
	
	<div align="center">
		
		<h1>회원 목록</h1>
		
		<table border="1">
			<thead>
				<tr>
					<th>번호</th>
					<th>아이디</th>
					<th>비밀번호</th>
					<th>권한</th>
					<th>가입일</th>
					<th>포인트</th>
				</tr>
			</thead>
			<tbody>
				<%for(ClientDto cdto : list){%>
				<tr>
					<td><%=cdto.getClient_no()%></td>
					<td><%=cdto.getClient_id() %></td>
					<td><%=cdto.getClient_pw() %></td>
					<td><%=cdto.getClient_auth() %></td>
					<td><%=cdto.getClient_join() %></td>
					<td><%=cdto.getClient_point() %></td>
				</tr>
				<%}%>
			</tbody>
		</table>
		
	</div>
	
</body>
</html>




