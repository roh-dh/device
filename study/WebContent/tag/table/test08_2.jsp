<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//DAO가 없으면....
	Class.forName("oracle.jdbc.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
	String sql = "select * from client order by client_no asc";
	PreparedStatement ps = con.prepareStatement(sql);
	ResultSet rs = ps.executeQuery();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
				<%while(rs.next()){ %>
				<tr>
					<td><%=rs.getInt("client_no")%></td>
					<td><%=rs.getString("client_id")%></td>
					<td><%=rs.getString("client_pw")%></td>
					<td><%=rs.getString("client_auth")%></td>
					<td><%=rs.getString("client_join")%></td>
					<td><%=rs.getInt("client_point")%></td>
				</tr>
				<%} %>
			</tbody>
		</table>
	</div>
</body>
</html>



<%
	con.close();
%>