<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 
	/board/list.jsp : 게시판 목록 페이지
 -->
 
<jsp:include page="/template/header.jsp"></jsp:include>

<div align="center">
	
	<!-- 제목 -->
	<h2>자유 게시판</h2>
	
	<!-- 테이블 -->
	<table border="1" width="90%">
		<thead>
			<tr>
				<th>번호</th>
				<th width="50%">제목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>조회수</th>
			</tr>
		</thead>
		<tbody align="center">
			<tr>
				<td>1</td>
				<td align="left">
					<a href="content.jsp?board_no=1">
						공지사항
					</a>
				</td>
				<td>운영자</td>
				<td>2020-05-15</td>
				<td>12</td>
			</tr>
		</tbody>
		
		<tfoot>
			<tr>
				<td colspan="5" align="right">
					<a href="write.jsp">
						<input type="button" value="글쓰기">
					</a>
				</td>
			</tr>
		</tfoot>
	</table>
	
	<!-- 네비게이터 -->
	<h6>
	[이전]
	1 2 3 4 5 6 7 8 9 10
	[다음]
	</h6>
	
	<!-- 검색창 -->
	<form action="list.jsp" method="get">
		<!-- 검색분류 -->
		<select name="type">
			<option value="board_title">제목만</option>
			<option value="board_writer">글작성자</option>
		</select>
		
		<!-- 검색어 -->
		<input type="text" name="keyword" required>
		 
		<!-- 전송버튼 -->
		<input type="submit" value="검색">
	</form>
</div>

<jsp:include page="/template/footer.jsp"></jsp:include>
