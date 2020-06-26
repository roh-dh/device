<%@page import="home.beans.dto.DailyCountDto"%>
<%@page import="java.util.List"%>
<%@page import="home.beans.dao.DailyCountDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	DailyCountDao dao = new DailyCountDao();
	List<DailyCountDto> list = dao.getList();
%>

<jsp:include page="/template/header.jsp"></jsp:include>

<div align="center">
	
	<h2>일별 회원가입자 현황</h2>
	
	<%for(DailyCountDto dto : list){%>
		<h4><%=dto.getDay()%> : <%=dto.getCnt()%>명</h4>
	<%} %>
	
</div>

<jsp:include page="/template/footer.jsp"></jsp:include>