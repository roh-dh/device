<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- test02.jsp -->


<%-- <h2>a = <%=a%></h2> --%>
<h2>b = <%=session.getAttribute("b")%></h2>
<h2>c = <%=application.getAttribute("c")%></h2>

<h2>session id = <%=session.getId()%></h2>