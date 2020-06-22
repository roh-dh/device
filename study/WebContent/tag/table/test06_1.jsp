<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단 테이블 만들기</title>
</head>
<body>
	
	<div align="center">
		
		<h2>구구단 테이블</h2>
		
		<table border="1">
			<thead>
				<tr>
					<%for(int j=2; j <= 9; j++){ %>
					<th><%=j%>단</th>
					<%} %>
				</tr>
			</thead>
			<tbody>
				<%for(int i=1; i <= 9; i++){ %>
				<tr>
					<%for(int j=2; j <= 9; j++){ %>
					<td><%=j%> X <%=i%> = <%=j*i%></td>
					<%} %> 
				</tr>
				<%} %>
			</tbody>
		</table>
		
	</div>
	
</body>
</html>





