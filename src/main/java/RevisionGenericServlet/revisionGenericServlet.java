package RevisionGenericServlet;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.catalina.tribes.group.Response;

/**
 * Servlet implementation class revisionGenericServlet
 */
@WebServlet("/test")
public class revisionGenericServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

   
    public revisionGenericServlet() { 
        // TODO Auto-generated constructor stub
    }

	
	public void init(ServletConfig config) throws ServletException {

	
	}

	
	public void destroy() {

	
	}

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		PrintWriter printWriter=response.getWriter();
		printWriter.println("Hello word");
		printWriter.close();
		
	}

}
