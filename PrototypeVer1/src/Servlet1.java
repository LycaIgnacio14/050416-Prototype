

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	final PrototypeClass1 person = new PrototypeClass1();
	final static PrototypeClass1 human = new PrototypeClass1();
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
   	private void createPrototypePrivClass(HttpServletRequest request, HttpServletResponse response) {
		human.setMonth(request.getParameter("month"));
   	}
 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");    
	     		 PrintWriter out = response.getWriter();    
	   
	      			String[] feedback = request.getParameterValues("month");  
	        
					int x = 1;
					while (x<12) {
	      				//loop it here using the while and print it   
						
	      					out.println("Month: " + month);
					x++;
		
		
		


	}
		}
   	}
   	

