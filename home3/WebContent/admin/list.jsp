<%@page import="java.util.ArrayList"%>
<%@page import="home.beans.dto.MemberDto"%>
<%@page import="java.util.List"%>
<%@page import="home.beans.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 
	분류와 검색어를 전달하여 원하는 분류의 항목을 찾을 수 있도록 구현
	- 항목 : 아이디(member_id) , 닉네임(member_nick) , 권한(member_auth) 중 선택
		- 뭐가 들어올 지 모르기 때문에 이름을 type으로 처리 
	- 검색어 : 항목에 따라 달라지기 때문에 이름을 keyword로 처리
 -->

<%
	//type과 keyword를 받아서 해당하는 분류에 대해 검색을 수행
	String type = request.getParameter("type");//검색분류
	String keyword = request.getParameter("keyword");//검색어
	
	//type과 keyword를 이용한 검색 수행
	MemberDao mdao = new MemberDao();
	
	//만약 type과 keyword가 없다면 ---> 처음 실행했다면 ---> 검색을 하지말고 비어있는 목록을 준비(결과가 없으니까)
	List<MemberDto> list;
	if(type == null || keyword == null){//type이 없거나 keyword가 없으면 --> 처음 실행한 경우
		list = new ArrayList<>();//검색을 할 수 없으니까 비어있는 목록을 준비
	}
	else{//검색어가 있는 경우
		list = mdao.search(type, keyword);//검색을 수행해라!
	}
%>
 
 
<jsp:include page="/template/header.jsp"></jsp:include>

<div align="center">
	<!-- 제목 -->
	<h2>회원 검색</h2>
	
	<!-- 검색창 -->
	<form action="list.jsp" method="get">
		<!-- 분류 선택창 -->
		<select name="type">
			<option value="member_id">아이디</option>
			<option value="member_nick">닉네임</option>
			<option value="member_auth">권한</option>
		</select>
		
		<!-- 검색어 입력창 -->
		<input type="text" name="keyword" required placeholder="검색어">
		
		<!-- 검색 버튼 -->
		<input type="submit" value="검색">
		
	</form>
	
	<hr>
	
	<h4>총 <%=list.size()%> 개의 데이터가 발견되었습니다</h4>
	
	<!-- 결과 -->
	<%if(list.isEmpty()){ %>
	<h5>검색 결과가 존재하지 않습니다</h5>
	<%}else{ %>
	<table border="1" width="650">
		<thead>
			<tr>
				<th>아이디</th>
				<th>닉네임</th>
				<th>권한</th>
				<th>관리메뉴</th>
			</tr>
		</thead>
		<tbody align="center">
			<%for(MemberDto mdto : list){ %>
			<tr>
				<td><%=mdto.getMember_id()%></td>
				<td><%=mdto.getMember_nick()%></td>
				<td><%=mdto.getMember_auth()%></td>
				<td>
					<a href="detail.jsp?member_id=<%=mdto.getMember_id()%>">상세</a>
					<a href="<%=request.getContextPath()%>/member/check.jsp?go=<%=request.getContextPath()%>/admin/edit.jsp?member_id=<%=mdto.getMember_id()%>">수정</a>
					<a href="<%=request.getContextPath()%>/member/check.jsp?go=<%=request.getContextPath()%>/admin/drop.do?member_id=<%=mdto.getMember_id()%>">탈퇴</a>
				</td>
			</tr>
			<%} %>
		</tbody>
	</table>
	<%} %>
	
</div>

<jsp:include page="/template/footer.jsp"></jsp:include>









