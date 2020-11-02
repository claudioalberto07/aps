<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<c:url value="/alteraContato" var="linkServletAlteraContato"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/AgendaJSTL/alteraContato" method="post">
	
		Nome: <input type="text" name="nome" value="${contato.nome}" />
		Telefone: <input type="text" name="telefone" value="${contato.telefone}" />
		Data: <input type="text" name="data" value="${contato.data}" />
		<input type="hidden" name="id" value="${contato.id}" />

		<input type="submit"/>
	</form>

</body>
</html>