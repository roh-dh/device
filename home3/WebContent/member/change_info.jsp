<%@page import="home.beans.dao.MemberDao"%>
<%@page import="home.beans.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 
	change_info.jsp : 
	- 데이터 수정을 할 수 있도록 입력창에 데이터를 설정해주는 것이 중요!
	- 회원 가입 페이지와 항목은 다르지만 유사할 것으로 보임
 -->

<%
	//session의 userinfo 데이터를 불러온다!
	MemberDto mdto = (MemberDto)session.getAttribute("userinfo");

	//session에 들어있는 정보는 최신 정보가 아니므로 DB에서 다시 조회한 다음 출력하는 것으로 변경!
	String member_id = mdto.getMember_id();
	MemberDao mdao = new MemberDao(); 
	MemberDto user = mdao.get(member_id);//member_id(P.K)를 이용한 단일조회 수행
%>
 
 
<jsp:include page="/template/header.jsp"></jsp:include>
 
<div align="center">
 	<h2>회원 정보 수정</h2>
 	
 	<form action="change_info.do" method="post">
 		<!-- 준비해야 할 항목 : 닉네임, 주소, 전화번호, 자기소개 -->
 		<table>
 			<tbody>
 				<tr>
 					<th>닉네임</th>
 					<td>
 						<input type="text" name="member_nick" value="<%=user.getMember_nick()%>" required>
 					</td>
 				</tr>
 				<tr>
 					<th rowspan="3">주소</th>
 					<td>
 						<input type="text" name="post" size="6" maxlength="6" value="<%=user.getPost()%>" placeholder="우편번호">
 						<input type="button" value="우편번호 찾기">
 					</td>
 				</tr>
 				<tr>
 					<td>
						<input type="text" name="base_addr" size="50" value="<%=user.getBase_addr()%>" placeholder="기본주소"> 					
 					</td>
 				</tr>
 				<tr>
 					<td>
						<input type="text" name="extra_addr" size="50" value="<%=user.getExtra_addr()%>" placeholder="상세주소"> 					
 					</td>
 				</tr>
 				<tr>
 					<th>전화번호</th>
 					<td>
 						<input type="text" name="member_phone" required value="<%=user.getMember_phone()%>">
 					</td>
 				</tr>
 				<tr>
 					<th>자기소개</th>
 					<td>
 						<textarea name="member_intro" rows="7" cols="50"><%=user.getMember_intro()%></textarea>
 					</td>
 				</tr>
 			</tbody>
 			<tfoot>
 				<tr>
 					<td colspan="2" align="center">
 						<input type="submit" value="수정하기">
 					</td>
 				</tr>
 			</tfoot>
 		</table>
 	</form>
 </div>
 
 <jsp:include page="/template/footer.jsp"></jsp:include>
 
 
 
 
 
 
 