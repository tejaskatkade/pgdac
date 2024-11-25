<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<form action="register_user" method="post">
			<table style="margin:auto;">
			<tr>
				<td>Enter Id</td>
				<td><input type="number" name="id"/></td>
			</tr>
			
			<tr>
				<td>Enter Role</td>
				<td><input type="text" name="role"/></td>
			</tr>
			
			<tr>
				<td>Enter First Name</td>
				<td><input type="text" name="first_name"/>	</td>
			</tr>
			
			<tr>
				<td>Enter Last Name</td>
				<td><input type="text" name="last_name"/>		</td>
			</tr>
		
			<tr>
				<td>Enter Email</td>
				<td><input type="email" name="email"/>	</td>
			</tr>	
			<tr>
				<td>Enter Password</td>
				<td><input type="password" name="password"/></td>
			</tr>	
			<tr>
				<td>Enter City</td>
				<td><input type="text" name="city"/>	</td>
			</tr>	
			<tr>
				<td><input type="submit" />	</td>
			</tr>	
	
			</table>
		</form>		
	
</body>
</html>