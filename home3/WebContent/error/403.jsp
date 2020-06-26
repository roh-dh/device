<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/template/header.jsp"></jsp:include>

<div align="center">
	<h2>해당 기능을 이용할 권한이 없습니다</h2>
	<img src="<%=request.getContextPath()%>/image/403.jpg" width="700" height="400">
</div>

<jsp:include page="/template/footer.jsp"></jsp:include>