<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Autenticación de Usuario</title>
</head>

<body>
	<h1>Autenticate...</h1>
	
	<%
		String error = (String) request.getAttribute("error");
		if (error != null && error.equals("true")){
			out.println("<h3>ERROR DE AUTENTICACIÓN<h3>");
		}
	%>
	<form action="${pageContext.request.contextPath}/login" name="loginForm" method="post">
		<table>
			<tr>
				<td>Usuario:</td>
				<td><input type="text" name="username" id="username"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" id="password"></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" id="submit" value="Ingresar"></td>
				<td><input type="reset" name="reset" id="reset" value="Limpiar"></td>
				
		</table>
	</form>
</body>
</html>