package Agenda;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/removeContato")
public class RemoveContatoServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("Remove Contato");
		
		//response.getWriter().append("Server at: ").append(request.getContextPath());
		
		String paramID =  request.getParameter("id");
		Integer id = Integer.valueOf(paramID);
		
		System.out.println(id);
		
		Agenda agenda = new Agenda();
		agenda.removeContato(id);
		
		response.sendRedirect("listaContatos");
}
}
