<%@page import="home.beans.dto.MemberDto"%>
<%@page import="home.beans.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 
	edit.jsp : 회원정보 수정 페이지
	 - 자신의 정보를 수정하는 것이 아니므로 수정할 회원의 기본키(member_id)가 필요하다.
 -->
<%
	String member_id = request.getParameter("member_id");

	MemberDao mdao = new MemberDao();
	MemberDto mdto = mdao.get(member_id);
%>
 
<jsp:include page="/template/header.jsp"></jsp:include>

<div align="center">
	<h2>회원 정보 수정</h2>
	
	<form action="edit.do" method="post">
		<table border="1">
			<tbody>
				<tr>
					<th>아이디</th>
					<td>
						<%=mdto.getMember_id()%>
						
						<!-- 수정하려면 회원의 아이디도 알아야 하므로 hidden으로 전송한다 -->
						<input type="hidden" name="member_id" value="<%=mdto.getMember_id()%>">
					</td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td>
						<input type="password" name="member_pw" required>
					</td>
				</tr>
				<tr>
					<th>닉네임</th>
					<td>
						<input type="text" name="member_nick" value="<%=mdto.getMember_nick()%>" required>
					</td>	
				</tr>
				<tr>
					<th rowspan="3">주소</th>
					<td>
						<input type="text" name="post" size="6" maxlength="6" placeholder="우편번호" value="<%=mdto.getPost()%>">
						<input type="button" value="우편번호 찾기">
					</td>
				</tr>
				<tr>
					<td>
						<input type="text" name="base_addr" size="50" placeholder="기본주소" value="<%=mdto.getBase_addr()%>">
					</td>
				</tr>
				<tr>
					<td>
						<input type="text" name="extra_addr" size="50" placeholder="상세주소" value="<%=mdto.getExtra_addr()%>">
					</td>
				</tr>
				<tr>
					<th>생년월일</th>
					<td>
						<input type="date" name="member_birth" value="<%=mdto.getMember_birthday()%>" required>
					</td>
				</tr>
				<tr>
					<th>전화번호</th>
					<td>
						<input type="text" name="member_phone" value="<%=mdto.getMember_phone()%>" required>
					</td>
				</tr>
				<tr>
					<th>자기소개</th>
					<td>
						<textarea name="member_intro" rows="7" cols="55"><%=mdto.getMember_intro()%></textarea>
					</td>
				</tr>
				<tr>
					<th>권한</th>
					<td>
<%-- 						<input type="text" name="member_auth" value="<%=mdto.getMember_auth()%>" required> --%>
						<select name="member_auth">
							<option>일반</option>
							<option>VIP</option>
							<option>관리자</option>
						</select>
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






