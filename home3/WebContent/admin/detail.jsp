<%@page import="home.beans.dto.MemberDto"%>
<%@page import="home.beans.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 
	detail.jsp : 회원 상세정보 페이지
	- 조회할 대상의 기본키(member_id)를 수신한다
	- 수신한 기본키(member_id)를 이용하여 회원정보를 단일조회한다(내정보와 동일)
 -->
<%
	String member_id = request.getParameter("member_id");

	MemberDao mdao = new MemberDao();
	MemberDto user = mdao.get(member_id);
%>

<jsp:include page="/template/header.jsp"></jsp:include>

<div align="center">
	<h2>내 정보</h2>
	
	<table border="1" width="400">
		<tbody>
			<tr>
				<th>아이디</th>
				<td><%=user.getMember_id()%></td>
			</tr>
			<tr>
				<th>닉네임</th>
				<td><%=user.getMember_nick()%></td>
			</tr>
			<tr>
				<th>주소</th>
				<td>
					[<%=user.getPost()%>] 
					<%=user.getBase_addr()%> 
					<%=user.getExtra_addr()%>
				</td>
			</tr>
			<tr>
				<th>생년월일</th>
				<td><%=user.getMember_birthdayFormat()%></td>
			</tr>
			<tr>
				<th>전화번호</th>
				<td><%=user.getMember_phone()%></td>
			</tr>
			<tr>
				<th>등급</th>
				<td><%=user.getMember_auth()%></td>
			</tr>
			<tr>
				<th>자기소개</th>
				<td><%=user.getMember_intro()%></td>
			</tr>
			<tr>
				<th>가입일</th>
				<td><%=user.getMember_join()%></td>
			</tr>
			<tr>
				<th>마지막 로그인</th>
				<td><%=user.getMember_login()%></td>
			</tr>
		</tbody>
	</table>
	
	<h5><a href="list.jsp">목록보기</a></h5>
	
</div>

<jsp:include page="/template/footer.jsp"></jsp:include>

