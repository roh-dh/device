<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/template/header.jsp"></jsp:include>

<div align="center">
	<h2>존재하지 않는 페이지입니다</h2>
	<img src="<%=request.getContextPath()%>/image/404.gif" width="700" height="400">
</div>


<jsp:include page="/template/footer.jsp"></jsp:include>