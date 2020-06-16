<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 
	페이지를 불러오기(include) 위해서는 두 가지 방법이 존재(정적 include, 동적 include)
	- 서버에서 사용자에게 보내기 전에 실행되는 코드이기 때문에 절대경로 작성 시 프로젝트 이름이 생략되어 작성된다 
	- 정적 include란 "해당 파일의 코드를 복사 붙여넣기한 효과"를 주는 코드이다.
		- 장점이자 단점 : 다른 파일에서 작성한 내용도 불러오면 접근이 가능(단점이 더 크게 적용)
	- 동적 include란 "컴파일 이후의 코드를 임의로 합쳐서 적용시키는 효과"를 주는 코드이다.
-->

<%-- <%@ include file="/template/header.jsp" %> --%>
<jsp:include page="/template/header.jsp"></jsp:include>
						
<div align="center">
	<h2>와주셔서 감사합니다!</h2>
	<img alt="환영 이미지" src="https://placehold.it/750x300">
</div>

<%-- <%@ include file="/template/footer.jsp" %> --%>
<jsp:include page="/template/footer.jsp"></jsp:include>






