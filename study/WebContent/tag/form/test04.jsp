<%@page import="study.beans.ClientDto"%>
<%@page import="java.util.List"%>
<%@page import="study.beans.ClientDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//검색어를 key라는 이름의 파라미터로 처리하려고 합니다.
	//1. 해당 파라미터가 있으면 "검색"으로 간주하여 처리합니다.(key != null)
	//2. 해당 파라미터가 없으면 "목록"으로 간주하여 처리합니다.(key == null)
	String key = request.getParameter("key");
	boolean isSearch = key != null;
	
	ClientDao cdao = new ClientDao();
	//List<ClientDto> list = 목록 or 검색결과;
	List<ClientDto> list;
	if(isSearch){
		list = cdao.search(key);
	}
	else{
		list = cdao.getList();
	}
%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 관리 페이지</title>
</head>
<body>
	<div align="center">
		<div>
			key = <%=key%>, 
			isSearch : <%=isSearch%>
		</div>
	
		<h2>회원 조회</h2>
		
		<!-- 검색창 시작 -->
		<form action="test04.jsp">
			<input type="search" name="key" placeholder="검색어 입력" value="<%=key%>">
			<input type="submit" value="검색">
		</form>
		<!-- 검색창 종료 -->
		
		<h6>총 <%=list.size()%>건의 검색 결과가 있습니다</h6>
		
		<%if(!list.isEmpty()){ %>
		<!-- 테이블 시작 -->
		<table border="1" width="700">
			<thead>
				<tr>
					<th>번호</th>
					<th>아이디</th>
					<th>권한</th>
					<th>가입일</th>
					<th>포인트</th>
					<th>메뉴</th> 
				</tr>
			</thead>
			<tbody align="center">
				<%for(ClientDto cdto : list){ %>
				<tr>
					<td><%=cdto.getClient_no()%></td>
					<td><%=cdto.getClient_id()%></td> 
					<td><%=cdto.getClient_auth()%></td>
					<td><%=cdto.getClient_join()%></td>
					<td><%=cdto.getClient_point()%></td>
					<td>?</td>
				</tr>
				<%} %>
			</tbody>
			<tfoot>
				<tr>
					<td colspan="6" align="right">
						[이전]
						1 2 3 4 5 6 7 8 9 10
						[다음]
					</td>
				</tr>
			</tfoot>
		</table>		
		<!-- 테이블 종료 -->
		<%} else{ %>
			<h6>데이터가 존재하지 않습니다.</h6>
		<%} %>
	</div>
</body>
</html>