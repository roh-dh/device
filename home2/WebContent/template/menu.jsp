<%@page import="home.beans.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 메뉴 -->    
<!-- 
	링크 주소는 어떤 방식으로 작성해야 하는가?
	- 템플릿 페이지는 어느 페이지에서 실행될지 모르기 때문에 경로를 무조건 절대경로로 작성해야 한다
	- context path(프로젝트명으로 구성된 주소) 는 언제든지 바뀔 수 있다
		- 변하는 경로에 맞게 경로를 계산해내는 명령이 필요 : request.getContextPath()
 -->
<%
	//rootPath에는 프로젝트 root path(/home)가 자동으로 계산되어 저장된다. 이는 절대경로 작성 시 활용할 수 있다.
	String rootPath = request.getContextPath();

	//로그인 여부에 따른 메뉴 구성을 변경
	// - 세션에 "userinfo"라는 데이터가 있으면 로그인 , 없으면 로그아웃 상태
	MemberDto mdto = (MemberDto)session.getAttribute("userinfo");//다운캐스팅(down-casting)
	boolean isLogin = mdto != null;
%>

<%if(isLogin){ %>
	<!-- 로그인 상태일 경우 -->
	<a href="<%=rootPath%>/index.jsp">홈으로</a>
	<a href="<%=rootPath%>/member/logout.do">로그아웃</a>
	<a href="<%=rootPath%>/member/info.jsp">내정보</a>
	
	<!-- 로그인 된 사용자 중에서도 "관리자" 인 경우만 나와야 하는 메뉴 -->
	<%if(mdto.getMember_auth().equals("관리자")){ %>
	<a href="<%=rootPath%>/admin/home.jsp">관리메뉴</a>
	<%} %>
	
	<a href="<%=rootPath%>/board/list.jsp">게시판</a>
<%}else{ %>
	<!-- 로그아웃 상태일 경우 -->
	<a href="<%=rootPath%>/index.jsp">홈으로</a>
	<a href="<%=rootPath%>/member/join.jsp">회원가입</a>
	<a href="<%=rootPath%>/member/login.jsp">로그인</a>
	<a href="<%=rootPath%>/board/list.jsp">게시판</a>
<%} %>




