package Agenda;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = "/alteraContato")

public class AlteraContatoServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("Alterando contato: ");

		String nome = request.getParameter("nome");
		String telefone = request.getParameter("telefone");
		String data = request.getParameter("data");
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Agenda agenda = new Agenda();
		Contato contato = agenda.buscaContatoId(id);
		
		
		contato.setNome(nome);
		contato.setTelefone(telefone);
		contato.setData(data);

		System.out.println("EDITADO");
		
		response.sendRedirect("listaContatos");
		
		
	}
}
