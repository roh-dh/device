<%@page import="home.beans.dto.BoardDto"%>
<%@page import="java.util.List"%>
<%@page import="home.beans.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 
	/board/list.jsp : 게시판 목록 겸 검색 페이지
 -->

<%
	//이 페이지를 출력하기 위한 프로그래밍 처리
	//1. 준비물(입력) : 검색창의 입력값 - type, keyword (둘다 있으면 검색)
	//2. 처리
	//		- isSearch라는 변수에 검색인지 아닌지 판정하여 저장
	//		- isSearch의 값에 따라 "목록" 또는 "검색" 결과를 저장
	//3. 결과물(출력) : 게시글 리스트 - List<BoardDto>
	
	String type = request.getParameter("type");
	String keyword = request.getParameter("keyword");
	
	boolean isSearch = type != null && keyword != null;
	
	BoardDao bdao = new BoardDao();
// 	List<BoardDto> list = 목록 or 검색;
	List<BoardDto> list;
	if(isSearch){
		list = bdao.search(type, keyword); 
	}
	else{
		list = bdao.getList();
	}
%> 
 
 
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
			<%-- list의 데이터를 하나하나 bdto라는 이름으로 접근하여 출력 --%>
			<%for(BoardDto bdto : list){ %>
			<tr>
				<td><%=bdto.getBoard_no()%></td>
				<td align="left">
					<a href="content.jsp?board_no=<%=bdto.getBoard_no()%>">
						<%=bdto.getBoard_title()%>
					</a>
				</td>
				<td>
					<%if(bdto.getBoard_writer() != null){ %>
						<%=bdto.getBoard_writer()%>
					<%} else { %>
						<font color="gray">탈퇴한 사용자</font>
					<%} %>
				</td>
				<td><%=bdto.getBoard_date()%></td>
				<td><%=bdto.getBoard_read()%></td>
			</tr>
			<%} %>
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






