

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/novoContato" var="linkServletNovoContato"/>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form action="${linkServletNovoContato}" method="post">
	
		Nome: <input type="text" name="nome"  />
		Telefone: <input type="text" name="telefone"/>
	    Data: <input type="text" name="data"/>
		
		<input type="submit" value="Enviar"/>
	</form>
	<a href="http://localhost:8181/AgendaJSTL/Menu.html"> <button>Voltar</button> </a>

</body>
</html>