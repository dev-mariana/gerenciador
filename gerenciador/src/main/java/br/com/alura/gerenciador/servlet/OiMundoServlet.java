package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//anotação de webservlet e chama essa servlet quando coloca /oi na url
//@WebServlet(urlPatterns="/oi")
public class OiMundoServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("oi mundo!");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("O servlet OiMundoServlet foi chamado!");
	} 
}
