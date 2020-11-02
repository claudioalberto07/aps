
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/listaContatos" var="listaContatosServlet"/>

<html>
<body>
	<h1>Cadastro de empresa na pagina JSP:</h1>

	<c:if test="${not empty contato}">
		<p>Contato ${contato} cadastrada com sucesso!</p>
	</c:if>
	
	<a href="http://localhost:8181/AgendaJSTL/listaContatos"> <button>Lista de Contatos</button> </a>
	<a href="http://localhost:8181/AgendaJSTL/Menu.html"> <button>Voltar</button> </a>
</body>
</html>

