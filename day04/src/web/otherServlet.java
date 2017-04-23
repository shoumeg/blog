package web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class otherServlet extends HttpServlet{
	public otherServlet(){
			System.out.println("otherServlet constructor...");
		}
	public void service(HttpServletRequest request,
			HttpServletResponse response)
	throws ServletException,IOException{
		System.out.println("service...");
		ServletConfig config=getServletConfig();
		System.out.println(config.getInitParameter("company"));
	}
}
