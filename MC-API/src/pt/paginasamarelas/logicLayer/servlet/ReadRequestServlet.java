package pt.paginasamarelas.logicLayer.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ReadRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ReadRequestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String message = "Isto foi um GET request";
	    request.setAttribute("message", message);
	    request.getRequestDispatcher("pagina.jsp").forward(request,response);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub~
		
		
		
	}

}
