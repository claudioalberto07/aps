package Agenda;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/apagarContato")
public class ApagarContatoServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("Apagar Contato");

		Agenda agenda = new Agenda();
		List<Contato> lista = agenda.getContatos();
		
		Contato contato = new Contato();
		contato.setNome(request.getParameter("nome"));
		contato.setTelefone(request.getParameter("telefone"));
		
		
		
		RequestDispatcher rd  = request.getRequestDispatcher("/ContatoApagado.jsp");
		request.setAttribute("contatos", contato.getNome());
		rd.forward(request, response);
}
}
