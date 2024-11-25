<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome User</h1>
	<form action="valid" method="post" >
		<table style="margin:auto">
			<tr> 
				<td>Enter Email</td> 
				<td><input type="email" name="email" > </td> 
			</tr>
			<tr> 
				<td>Enter Password</td> 
				<td><input type="password" name="password" > </td> 
			</tr>
			<tr> 
				<td> <input type="submit" value="Login" /> </td> 
				<td> <a href="registration.jsp">Register User</a> </td> 
			</tr>			
		</table>
	</form>
</body>
</html>