<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>날짜 선택창 예시</title>
</head>
<body>
	<form>
		<div>
			<select name="birth_year" required>
				<option value="">연도 선택</option>
				<%for(int i=2020; i >= 1900; i--){ %>
				<option><%=i%></option>
				<%} %>
			</select>
			<select name="birth_month" required>
				<option value="">월 선택</option>
				<%for(int i=1; i <= 12; i++){ %>
				<option><%=i%></option>
				<%} %>
			</select>
			<select name="birth_date" required>
				<option value="">일 선택</option>
				<%for(int i=1; i <=31; i++){ %>
				<option><%=i%></option> 
				<%} %>
			</select>
		</div>
		<input type="submit" value="등록">
	</form>
</body>
</html>

