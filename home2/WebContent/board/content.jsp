<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:include page="/template/header.jsp"></jsp:include>

<div align="center">
	<h2>게시글 상세보기</h2>
	<!--테이블에 글 정보를 출력  -->
	<table border="1" width="60%">
		<tbody>
			<tr>
				<td>[말머리] 제목</td>
			</tr>
			<tr>
				<td>작성자</td>
			</tr>
			<tr>
				<td>YYYY-MM-DD HH:MI:SS</td>
			</tr>
			<tr height="300">
				<td valign="top">
				글 내용을 이곳에 작성합니다.
				</td>
			</tr>
		</tbody>
		<tfoot>
			<tr>
				<td colsapn="2" align="right">
					<input type="button" value="글쓰기">
					<input type="button" value="답글">
					<input type="button" value="수정">
					<input type="button" value="삭제">
					<input type="button" value="목록">
					</td>
			</tr>
		</tfoot>
	</table>
</div>

<jsp:include page="/template/footer.jsp"></jsp:include>