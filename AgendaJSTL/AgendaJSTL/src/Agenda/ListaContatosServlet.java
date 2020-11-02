package Agenda;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/listaContatos")
public class ListaContatosServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("Lista de Contatos");


		Agenda agenda = new Agenda();
		List<Contato> lista = agenda.getContatos();
				
		
		//RequestDispatcher rd  = request.getRequestDispatcher("/ListaContatos.jsp");
		//request.setAttribute("contatos", lista);
		//rd.forward(request, response);
		response.sendRedirect("listaContatos");
}
}
