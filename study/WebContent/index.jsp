<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내가 만든 홈페이지</title>
</head>
<body>

	<!-- 화면배치는 테이블로 하면 안되지만 빠른 구현을 위해 테이블로 하고 추후에 div로 교체 -->
	<div align="center">
		<table border="1" width="1000">
			<tbody>
				<!-- 상단(header) 영역 -->
				<tr height="100">
					<td align="center">
						<h1>JSP 2주만에 뽀개기</h1>
					</td>
				</tr>
				<!-- 메뉴(navigation) 영역 -->
				<tr>
					<td>
						<a href="#">홈으로</a>
						<a href="#">회원가입</a>
						<a href="#">로그인</a>
						<a href="#">로그아웃</a>
						<a href="#">내정보</a>
						<a href="#">정보수정</a>
						<a href="#">회원탈퇴</a>
						<a href="#">관리메뉴</a>
						<a href="#">게시판</a>
					</td>
				</tr>
				<!-- 본문(section) 영역 -->
				<tr height="350">
					<td valign="top">

						<div align="center">
							<h2>와주셔서 감사합니다!</h2>
							<img alt="환영 이미지" src="https://placehold.it/750x300">
						</div>

					</td>
				</tr>
				<!-- 하단(footer) 영역 -->
				<tr height="100">
					<td align="center">

						<h5>
							<i>KH 정보교육원 디바이스/웹 콘텐츠 융합 디지털 컨버전스 양성과정</i>
						</h5>

					</td>
				</tr>
			</tbody>
		</table>
	</div>

</body>
</html>