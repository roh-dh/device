<%@page import="home.beans.dto.MemberDto"%>
<%@page import="java.util.List"%>
<%@page import="home.beans.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 
	(Q) 회원 검색 화면을 구현하시오.
	- 전체 목록은 나올 필요가 없고 처음 화면에는 검색창만 나오면 됨
	- 검색어의 파라미터명은 member_id로 처리
	- 검색어와 유사한 아이디를 가지는 회원의 목록을 구하여 화면에 표 형태로 출력
		- 아이디 , 닉네임 , 권한 만 출력
		- 우측에 관리메뉴라는 칸을 추가하여 둘 것
	- 검색결과가 없을 경우 "검색 결과가 존재하지 않습니다" 출력 
 -->
<%//scriptlet

	//member_id라는 이름의 검색어를 받아라
	String member_id = request.getParameter("member_id");

	//위에서 받은 검색어를 이용하여 "회원 목록"을 구해와라
	MemberDao mdao = new MemberDao();
	List<MemberDto> list = mdao.search(member_id); 
%>
 
<jsp:include page="/template/header.jsp"></jsp:include>

<div align="center">
	<!-- 제목 -->
	<h2>회원 검색</h2>
	
	<!-- 검색창 -->	
	<form action="list.jsp" method="get">
		<%if(member_id == null){ %>
		<input type="text" name="member_id" required>
		<%}else{ %>
		<input type="text" name="member_id" required value="<%=member_id%>">
		<%} %>
		<input type="submit" value="검색">
	</form>
	
	<br><br>
	
	<%if(member_id != null){ %>
	
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
						<a href="#">상세</a>
						<a href="#">수정</a>
						<a href="#">탈퇴</a>
					</td>
				</tr>
				<%} %>
			</tbody>
		</table>
		<%} %>
		
	<%} %>
</div>

<jsp:include page="/template/footer.jsp"></jsp:include>









