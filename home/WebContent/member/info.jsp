<%@page import="home.beans.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!--  
	info.jsp
	1. 세션의 정보 조회
	2. 데이터베이스 조회
	3. 조회된 데이터 출력
-->	
	
	<%
	//세션에서 userinfo를 읽어온다. 다운캐스팅
	MemberDto mdto =(MemberDto)session.getAttribute("userinfo");
	%>
	
	
	
<jsp:include page="/template/header.jsp"></jsp:include>

<div align="center">
	<h2>내정보</h2>
	
	<table border="1" width="400">
		<tr>
			<th>아이디</th>
			<td></td>
	
		</tr>
		<tr>
			<th>닉네임</th>
			<td><%=mdto.getMember_nick()%></td>
	
		</tr>
		<tr>
			<th>주소</th>
			<td>
					[<%=mdto.getPost()%>] 
					<%=mdto.getBase_addr()%> 
					<%=mdto.getExtra_addr()%>
			</td>
			
		</tr>				
		<tr>
			<th>생년월일</th>
			<td><%=mdto.getMember_birthdayFormat()%></td>
		</tr>
		<tr>
			<th>전화번호</th>
			<td><%=mdto.getMember_phone() %></td>
		</tr>
		<tr>
			<th>등급</th>
			<td><%=mdto.getMember_auth() %></td>
	
		</tr>		
		<tr>
			<th>자기소개</th>
			<td><%=mdto.getMember_intro() %></td>
	
		</tr>
		<tr>
			<th>가입일</th>
			<td><%=mdto.getMember_join() %></td>
	
		</tr>
		<tr>
			<th>마지막 로그인</th>
			<td><%=mdto.getMember_login() %></td>
	
		</tr>		
	</table>
	
		<h5><a href="check.jsp?go=change_password.jsp">비밀번호 변경하기</a></h5>
		<h5><a href="check.jsp?go=change_info.jsp">개인정보 변경하기</a></h5>
		<h5><a href="check.jsp?go=exit.do.jsp">로그아웃</a></h5>
		<h5><a href="#">회원탈퇴</a></h5>


</div>

<jsp:include page="/template/footer.jsp"></jsp:include>