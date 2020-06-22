<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- test01.jsp -->
<%
	//JSP는 기본 범위(scope)가 페이지이기 때문에 페이지 내부에서만 생성한 데이터에 접근이 가능
	// - JSP는 page가 기본 scope 이다.
	// - 이를 벗어나기 위해서는 JSP에서 제공하는 영역 객체에 대해 알아야 한다
	// - pageContext, request, session, application 4종류가 존재한다.
	// - 중요한 것은 session과 application의 차이를 이해하는 것!
	int a = 10;

	//Q1) session 이 무엇인가? 데이터는 어떻게 저장하는가?
	//session.setAttribute("이름", 저장할 데이터);
	//(중요) 저장되는 데이터는 무조건 Object 형태로 저장(업캐스팅)
	session.setAttribute("b", 20);
	application.setAttribute("c", 30);
%>

<h2>a = <%=a%></h2>
<h2>b = <%=session.getAttribute("b")%></h2>
<h2>c = <%=application.getAttribute("c")%></h2>

<h2>session id = <%=session.getId()%></h2>






