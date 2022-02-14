<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulário</title>
</head>
<%
Cookie[] cookies = request.getCookies();
String nome = "";
if (cookies != null) {
	for (Cookie cookie : cookies) {
		if (cookie.getName().equals("nomeusu")) {
	nome = cookie.getValue();
	break;
		}
	}
}
%>
<body>
	<form action="Salvar" method="get">

		Nome do usuário: 
		<INPUT type="text" name="nome" value="<%=nome%>"><BR>
	    <INPUT type="submit" value="Processar">

	</form>

</body>
</html>