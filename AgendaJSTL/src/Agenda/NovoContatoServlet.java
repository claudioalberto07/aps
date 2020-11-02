package Agenda;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = "/novoContato")

public class NovoContatoServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("Cadastrando novo contato: ");

		String nome = request.getParameter("nome");
		String telefone = request.getParameter("telefone");
		String data = request.getParameter("data");
		Contato contato = new Contato();
		Agenda agenda = new Agenda();
		
		contato.setNome(nome);
		contato.setTelefone(telefone);
		contato.setData(data);

		agenda.adicionaContato(contato);
		
		RequestDispatcher rd = request.getRequestDispatcher("/listaContatos");
		request.setAttribute("nome", contato.getNome());
		rd.forward(request, response);
		
		
		
	}
}
