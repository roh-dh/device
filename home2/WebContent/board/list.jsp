<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="/template/header.jsp"></jsp:include>
<div align="center">
<!--제목 -->
<!--테이블  -->

		<table border="1" width="90%">
			<thead>
				<tr>
					<th>번호</th>
					<th width="50%">제목</th>
					<th>작성자</th>
					<th>작성일</th>
					<th>조회</th>
				</tr>

			</thead>
			<tbody align ="center">
				<tr>
					<td width="700"><a href="board_title">1</a></td>
					<td align="left"><a href="board_writer">공지사항</a></td>
					<td><a href="board_date">2020-05-15</a></td>
					<td><a href="board_read">12</a></td>
				</tr>
			</tbody>
			<tfoot>
				<tr align="right">
					<td colspan="4"><input type="search" name="board_" required placeholder="검색어를 입력해주세요"> <input type="button" value="검색"></td>
				</tr>
			</tfoot>
			</form>
		</table>
<!--네비게이터  -->
<h6>
[이전]
1 2 3 4 5 6 7 8 9 10
[다음]
</h6>

<!--검색창  -->
	<form action="list.do" , method="get">
	</form>
</div>
<jsp:include page="/template/footer.jsp"></jsp:include>