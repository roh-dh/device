<%@page import="java.util.HashSet"%>
<%@page import="java.util.Set"%>
<%@page import="home.beans.dto.MemberDto"%>
<%@page import="home.beans.dao.MemberDao"%>
<%@page import="home.beans.dto.BoardDto"%>
<%@page import="home.beans.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//상세조회 페이지를 구현하기 위해서는
	//1. 준비 : P.K(기본키)가 필요. 게시판에서는 board_no
	//2. 처리 : 기본키를 이용한 단일조회 수행
	//3. 결과 : 단일 조회 결과(게시글 , BoardDto)
	
	int board_no = Integer.parseInt(request.getParameter("board_no"));
	///////////////////////////////////////////////////////////////
	// 게시글 조회수 중복방지를 위한 저장소 처리 코드 구현
	///////////////////////////////////////////////////////////////
	// 1. memory 라는 이름으로 세션에 Set을 저장
	
	// - 세션에 memory라는 저장소 정보를 추출한다(없을 수도 있다)
	Set<Integer> memory = (Set<Integer>)session.getAttribute("memory");
	
	// - memory가 없을 경우에는 "게시글을 아예 처음 읽는 경우"이므로 저장소 생성
	if(memory == null){
		memory = new HashSet<>();
	}
	
	//- memory에 현재 글 번호를 저장
	boolean isFirst = memory.add(board_no);
	
	session.setAttribute("memory", memory);
	
	
	BoardDao bdao = new BoardDao();
	
	//board_no를 이용하여 조회수를 증가시킨다
	// - 내 글인 경우에는 조회수가 늘어나면 안되기 때문에 현재 사용자의 ID를 같이 전달
	MemberDto user = (MemberDto) session.getAttribute("userinfo");
	
	//isFirst가 true인 경우만(즉 처음 읽은 경우만) 조회수를 증가 시켜주세요
	if(isFirst){
		bdao.plusReadcount(board_no, user.getMember_id());
	}
	
	//board_no를 이용하여 BoardDto를 얻어낸다
	BoardDto bdto = bdao.get(board_no);
	
	//추가 : 만약 회원의 "권한"을 추가적으로 표시하고 싶다면 작성자 회원정보가 필요
	MemberDao mdao = new MemberDao();
	MemberDto mdto = mdao.get(bdto.getBoard_writer());//작성자로 회원조회
	
	//내글인지 또는 관리자인지를 파악하여 이후의 작업에 적용
	// - 관리자 : 세션에 있는 userinfo 데이터의 권한 정보
	boolean isAdmin = user.getMember_auth().equals("관리자");
	
	// - 내글 : 게시글(bdto)의 작성자와 로그인 된 사용자(user)의 아이디가 같아야 함
	boolean isMine = user.getMember_id().equals(bdto.getBoard_writer());
%>     

<jsp:include page="/template/header.jsp"></jsp:include>

<div align="center">
	<h2>게시글 상세보기</h2>

	<!-- 테이블에 글 정보를 출력 -->
	<table border="1" width="60%">
		<tbody>
			<tr>
				<td>
					<font size="6">
					<%if(bdto.getBoard_head() != null){ %>
						<!-- 말머리는 있을 경우만 출력 -->
						[<%=bdto.getBoard_head()%>]
					<%} %>
					
					<%=bdto.getBoard_title()%>
					</font>
				</td>
			</tr>
			<tr>
				<td>
					<!-- 작성자 -->
					<%if(bdto.getBoard_writer() != null){ %>
						<%=bdto.getBoard_writer()%>
					<%} else { %>
						<font color="gray">탈퇴한 사용자</font>
					<%} %>
					
					<%if(mdto != null){ %>
					<!-- 작성자 권한은 사용자가 탈퇴한 경우에는 출력하지 않는다 -->
					<font color="gray">
					<%=mdto.getMember_auth()%>
					</font>
					<%} %>
				</td>
			</tr>
			<tr>
				<td>
					<%=bdto.getBoard_date()%>
					조회 <%=bdto.getBoard_read()%>
				</td>
			</tr>
			<tr height="300">
				<td valign="top">
					<%=bdto.getBoard_content()%>
				</td>  
			</tr>
			
			<!-- 댓글 목록 영역 -->
			<tr>
				<td>
					
					<table width="99%">
						<tbody>
							<tr>
								<td>
									<div>작성자</div>
									<div>내용</div>
									<div>작성일시</div>
								</td>
								<td width="15%">
									수정 | 삭제
								</td>
							</tr>
						</tbody>
					</table>
					
				</td>
			</tr>
			
			<!-- 댓글 작성 영역 -->
			<tr>
				<td align="right">
					<form action="/board/reply_insert.do" method="post">
						<textarea name="?" rows="4" cols="80" placeholder="댓글 작성"></textarea>
						<br>
						<input type="submit" value="등록">
					</form>
				</td>
			</tr>
			
		</tbody>
		<!-- 각종 버튼들 구현 -->
		<tfoot>
			<tr>
				<td colspan="2" align="right">
					<a href="write.jsp">
					<input type="button" value="글쓰기">
					</a>
					
					<input type="button" value="답글">
					
					<%if(isAdmin || isMine){ %>
					<!-- 관리자이거나 내 글인 경우만 수정/삭제 버튼을 표시 -->
					
					<a href="edit.jsp?board_no=<%=board_no%>">
					<input type="button" value="수정">
					</a>
					
					<a href="<%=request.getContextPath()%>/member/check.jsp?go=<%=request.getContextPath()%>/board/delete.do?board_no=<%=board_no%>">
					<input type="button" value="삭제">
					</a>
					<%} %>
					
					<a href="list.jsp">
					<input type="button" value="목록">
					</a>
				</td>
			</tr>
		</tfoot>
	</table>
</div>

<jsp:include page="/template/footer.jsp"></jsp:include>
