<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <h1>회원 목록 </h1>



	<c:forEach var="memberDto" items="${list}">
    ${memberDto.member_id}
    ${memberDto.member_nick}
    ${memberDto.member_auth}
    
    </c:forEach>