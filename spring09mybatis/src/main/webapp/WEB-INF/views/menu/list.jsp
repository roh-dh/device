<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<h1>목록</h1>
<p>
	데이터 개수 : ${list.size()}
</p>
<!--var 변수이름   -->
<c:forEach var="menuDto" items="${list}">
	<h3>${menuDto.name} , ${menuDto.price} 원</h3>
</c:forEach>