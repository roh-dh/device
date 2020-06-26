<%@page import="study.beans.client.ClientDto"%>
<%@page import="study.beans.client.ClientDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//상세 정보 보여주는 페이지
	// - 보여주기 위해서는 반드시 "client_no" 파라미터가 필요
	int client_no = Integer.parseInt(request.getParameter("client_no"));

	ClientDao cdao = new ClientDao();
	ClientDto cdto = cdao.get(client_no);//단일조회
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 상세 정보</title>
</head>
<body>
	<h3>번호 : <%=cdto.getClient_no()%></h3>
	<h3>아이디 : <%=cdto.getClient_id()%></h3>
	<h3>비밀번호 : <%=cdto.getClient_pw()%></h3>
	<h3>권한 : <%=cdto.getClient_auth()%></h3>
	<h3>가입일 : <%=cdto.getClient_join()%></h3>
	<h3>포인트 : <%=cdto.getClient_point()%></h3>
</body>
</html>




