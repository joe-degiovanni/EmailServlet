package degiovanni.utils;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class EmailServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		    throws IOException, ServletException
		    {
		        response.setContentType("text/html");
		        PrintWriter out = response.getWriter();
		        out.println("<html>");
		        out.println("<head>");
		        out.println("<title>Email Servlet</title>");
		        out.println("</head>");
		        out.println("<body>");
		        out.println("<h1>Email Servlet</h1>");
		        out.println("get request: "+request.getParameter("test"));
		        out.println("</body>");
		        out.println("</html>");
		    }
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		    throws IOException, ServletException
		    {
				
		        response.setContentType("text/html");
		        PrintWriter out = response.getWriter();
		        out.println("<html>");
		        out.println("<head>");
		        out.println("<title>Email Servlet</title>");
		        out.println("</head>");
		        out.println("<body>");
		        out.println("<h1>Email Servlet</h1>");
		        out.println("post request: "+request.getParameter("test"));
		        out.println("</body>");
		        out.println("</html>");
		    }

}
