<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/template/header.jsp"></jsp:include>

	<form action="join.do" method="post">
	<article class="w-60">
	<!--제목 -->
	<div class="row">
		<h2>회원 가입</h2>
	</div>	
	<!--아이디 입력창 -->
	<div class="row"></div>
		<input class="form-input" type="text" name="member_id" required placeholder="5~20자 영문 또는 숫자">
	<!--비밀번호  -->
	<div class="row"></div>
	<!--닉네임  -->
	<div class="row"></div>
	<!--우편번호 및 찾기버튼  -->
	<div class="row"></div>
	<!--기본주소 -->
	<div class="row"></div>
	<!--상세주소  -->
	<div class="row"></div>

	<div class="row"></div>
	<div class="row"></div>
	<div class="row"></div>
	<div class="row"></div>
	<div class="row"></div>
	<div class="row"></div>
	<div class="row"></div>
	<div class="row"></div>
</article>
<div align="center">
	
	<h2>회원가입</h2>
	

	<form action="join.do" method="post">
		<table border="0">
			<tbody>
				<tr>
					<th>아이디</th>
					<td>
						<input type="text" name="member_id" required placeholder="5~20자 영문 또는 숫자">
					</td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td>
						<input type="password" name="member_pw" required placeholder="8~16자 영문 또는 숫자">
					</td>
				</tr>
				<tr>
					<th>닉네임</th>
					<td>
						<input type="text" name="member_nick" required placeholder="한글 8자 이내">
					</td>
				</tr>
				<tr>
					<th rowspan="3">주소</th>
					<td>
						<!-- 우편번호는 6자정도 크기에 6자까지만 입력하도록 설정 -->
						<input type="text" name="post" size="6" maxlength="6" placeholder="우편번호">
						
						<!-- 버튼은 눌러도 지금 당장은 효과가 없다(자바스크립트 배워야 함) -->
						<input type="button" value="우편번호 찾기">
					</td>
				</tr>
				<tr>
					<td>
						<input type="text" name="base_addr" size="50" placeholder="기본주소">
					</td>
				</tr>
				<tr>
					<td>
						<input type="text" name="extra_addr" size="50" placeholder="상세주소">
					</td>
				</tr>
				<tr>
					<th>전화번호</th>
					<td>
						<input type="text" name="member_phone" required placeholder="- 제외">
					</td>
				</tr>
				<tr>
					<th>생년월일</th>
					<td>
						<input type="date" name="member_birth" required>
					</td>
				</tr>
				<tr>
					<th>자기소개</th>
					<td>
						<!-- rows는 표시할 최소 줄 수, cols는 표시할 최소 칸 수 -->
						<textarea name="member_intro" rows="7" cols="50" placeholder="욕설 등은 자제하세요!"></textarea>
					</td>
				</tr>
			</tbody>
			<tfoot>
				<tr>
					<th colspan="2">
						<input type="submit" value="가입">
					</th>
				</tr>
			</tfoot>
		</table>
	</form>

</div>

<jsp:include page="/template/footer.jsp"></jsp:include>


