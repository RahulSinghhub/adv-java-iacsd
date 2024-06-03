package webpages;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
//@WebServlet("/hello2")



//mapping b/w url and key
/*
*run time annotation , class level , mandatory annotation mesnt for web container 
*when web app deployed wc creates a map
*key -- url pattern (/hello)
*value -- fq servlet class name (web pages.TestServlet)
*url -- https://localhost:8080/day_1l/hello
*http - app layer protocol(scheme)
*host - dns qualified host name (www.abs.com  or ip
*port tcp port no def port 8080
*uri /day_1l/hello
* /day_1l - context = wweb app root
*/
public class TestServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("is init from " + getClass() );
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		
		System.out.println("is destroyed");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//1 set response content type 
		System.out.println("do get "+ getClass());
		response.setContentType("text/html");
		//2. get the prointwriter from http servlet response to send buffer text contents to the client
		try(PrintWriter pw= response.getWriter()){
			//add fynamic contents of pw buffer
			pw.print("<h4>hello from servlets  ...  ha hahahahhahah "+ LocalDateTime.now() );
			
		}
	}

}
