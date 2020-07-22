<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/template/header.jsp"></jsp:include>

<div align="center">
	
	<h6>아이디 비밀번호를 입력하신 후, 로그인 버튼을 클릭해 주세요.</h6>
	
	<form action="login.do" method="post">
		<table border="0">
			<tbody>
				<tr>
					<th></th>
					<td>
						<input type="text" name="member_id" required>
					</td>
				</tr>
				<tr>
					<th></th>
					<td>
						<input type="password" name="member_pw" required>
					</td>
				</tr>
			</tbody>
			<tfoot>
				<tr align="center">
					<td colspan="3">
						<input type="submit" value="Login">
					</td>
				</tr>
				<tr align="center">				
					<td colspan="3">
						<input type= "checkbox">아이디 저장
						<a href="find_id.jsp">아이디 찾기</a>
						<a href="#">비밀번호 찾기</a>
					</td>
				</tr>

			</tfoot>
		</table>
	</form>	
	
	<%if(request.getParameter("error") != null){%>
		<!-- 오류 메시지는 페이지에 error라는 파라미터가 있을 경우만 출력 -->
		<h6><font color="#FF0000">입력하신 로그인 정보가 맞지 않습니다</font></h6>
	<%} %>
	
</div>

<jsp:include page="/template/footer.jsp"></jsp:include>






