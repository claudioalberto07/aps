<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<body>
	<h1>Contato apagado na pagina JSP:</h1>

	<c:if test="${not empty contato}">
		<p>Contato ${contato} apagado com sucesso!</p>
	</c:if>
	
	<a href="http://localhost:8181/AgendaJSP/listaContatos"> <button>Lista de Contatos</button> </a>
	<a href="http://localhost:8181/AgendaJSP/Menu.html"> <button>Voltar</button> </a>
</body>
</html>

