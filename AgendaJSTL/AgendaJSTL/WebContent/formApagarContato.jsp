<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/apagarContato" var="linkServletApagarContato"/>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form action="${linkServletApagarContato}" method="post">
	
		Nome: <input type="text" name="nome"  />
		Telefone: <input type="text" name="telefone"/>
		
		<input type="submit" value="Enviar"/>
	</form>
	<a href="http://localhost:8181/AgendaJSTL/Menu.html"> <button>Voltar</button> </a>

</body>
</html>