<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, Agenda.Contato"%>
<!DOCTYPE html>
<html>
<body>
	<ul>
		<%List<Contato> lista = (List<Contato>)request.getAttribute("contatos"); 
			for (Contato contato : lista) { 
		%>		
		
		<li><%=contato.getNome() %></li>
		
		<a href="http://localhost:8181/AgendaJSTL/apagarContato?nome=<%=contato.getNome()%>&telefone=<%=contato.getTelefone()%>"> 
		<button>Apagar</button> </a>
		
		<%} %>
	</ul>
</body>
</html>
