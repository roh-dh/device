<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 
	목표 : ClientRegistServlet과 연동되는 입력 페이지 작성
	주소 : http://localhost:8080/study/client/regist.do
 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2>회원 등록</h2>
		
		<!-- 주의사항 : form은 table 바깥이나 th/td 안에만 만들 수 있다(다른 태그도 마찬가지) -->
		<form action="/study/client/regist.do">
		<table border="0">
			<tbody>
				<tr>
					<th>아이디</th>
					<td>
						<input type="text" name="client_id" placeholder="5~20자의 영문+숫자" required>
					</td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td>
						<input type="password" name="client_pw" placeholder="8~16자의 영문+숫자+특수문자" required>
					</td>
				</tr>
				<tr>
					<th colspan="2">
						<input type="submit" value="가입">
					</th>
				</tr>
			</tbody>
		</table>
		</form>
	</div>
</body>
</html>




