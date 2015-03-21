package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.AsyncContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
name = "myServlet",
urlPatterns = {"/myservlet"},
asyncSupported = true
)
public class MyServlet extends HttpServlet{

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.service(request, response);
		
		String sessionid = request.getSession().getId();
		System.out.println("myservlet session id: "+sessionid);
		
//		response.setHeader("content-type", "text/html");
		response.setContentType("text/html; charset=UTF-8");
		//response.setCharacterEncoding("EUC-JP");
		
		PrintWriter out = response.getWriter();
		out.println("哈哈"+"<br>");
		
		System.out.println("myServlet");
				
		  out.write("<form action=\"test1.jsp\" method=\"post\">\n");
		  out.write("  <p>First name: <input type=\"text\" name=\"name\" /></p>\n");
		  out.write("  <p>Last name: <input type=\"text\" name=\"name2\" /></p>\n");
		  out.write("  <input type=\"submit\" value=\"Submit\" />\n");
		  out.write("</form>\n");
		  out.write("\n");
		  out.write("  \n");
		  out.write(" \n");
	      
	      
	      
				
		final AsyncContext ac = request.startAsync();
		System.out.println(request.isAsyncSupported());
		ac.setTimeout(2000);
		ac.start(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(2000);
					ac.dispatch("/JSP/test1.jsp");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		
		out.flush();

	}


}


