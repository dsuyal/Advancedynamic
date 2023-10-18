<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<%
		String name = "Dinesh..!!";
		for(int i = 1; i<=5; i++){
		%>
		<h>
		How are you
		<%=name %>
		
		?
		</h>
		
		<%
		}
		%>

</body>
</html>