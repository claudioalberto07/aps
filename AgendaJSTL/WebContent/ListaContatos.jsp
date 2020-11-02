<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, Agenda.Contato"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<body>
	 
	<c:if test="${not empty contato}">
		contato ${ contato } cadastrado com sucesso!
	</c:if>
	
	<h1> Lista Contatos: </h1>
	
	<ul>
		<c:forEach items="${contatos}" var="contato">
			<li>${contato.nome}  - ${contato.telefone} -  ${contato.data}</li>
			<a href="/AgendaJSTL/mostraContato?id=${contato.id}"> Editar</a>
		    <a href="/AgendaJSTL/removeContato?id=${contato.id}"> Remover</a>				
		</c:forEach>
	</ul>		
	<a href="http://localhost:8181/AgendaJSTL/Menu.html"> <button>Voltar</button> </a>
	
</body>
</html>
