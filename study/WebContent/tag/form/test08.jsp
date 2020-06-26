<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력창 종류 살펴보기</title>
</head>
<body>

	<!-- 입력창은 총 3종류가 존재 : input , select , textarea -->
	<!-- input : text, number, file, checkbox, radio, search, date, ... -->
	<!-- select : 드롭다운 리스트 -->
	<!-- textarea : 여러줄 입력기(multi-line editor) -->
	<form action="test08.jsp">
		
		<input type="file" name="a">
		<br><br>
		
		<!-- 
			- 전송은 select가 되므로 name은 select에 부여
			- option에 value를 부여할 경우 표시되는 값과 전송되는 값을 다르게 할 수 있다.(부여하지 않으면 동일)
		 -->
		<select name="b">
			<option value="apple">사과</option>
			<option value="banana">바나나</option>
			<option value="strawberry">딸기</option>
		</select>
		
		<br><br>
		
		<!-- 
			주의 : textarea는 value가 없다(여러줄 표현이 어렵기 때문) - 태그 사이에 작성
			주의 : 글자를 표시할 때 공백을 주의
		 -->
		<textarea name="c">hello java</textarea>
		
		<br><br>
		<input type="submit">
			
	</form>

</body>
</html>






