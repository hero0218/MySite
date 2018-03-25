<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

			<h1>GUESTBOOKLIST</h1>
	
		<h3> PARK 님 환영합니다</h3>      
		
		<form action ="${pageContext.servletContext.contextPath}/guestbook/list" type="post">
		id : <input type= "text" name="id" > <br>
		pw : <input type= "text" name="pw" > <br>
		content : <textarea rows="50" cols="100"/> <br> 
		<inout type="submit" value="write">
		
		
		</form>
		<input type= "button" value="modify" onclick="location.href='/app/guestbook/modify/${id}'">
		<input type= "button" value="delete" onclick="location.href='/app/guestbook/delete/${id}'">
		
		<c:forEach items="${guestbooklist}" var="vo" >
		<table width=510 border=1 >
			<tr>
				<td>${vo.no}</td>
				<td>${vo.id}</td>
				<td>${vo.content}</td>
		
			</tr>
		</table>
		</c:forEach>	

</body>
</html>