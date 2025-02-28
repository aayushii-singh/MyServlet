package com.firstservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("<head><title>First Servlet</title></head>");
        out.println("<body>");
        out.println("<h3>Hello World! Welcome to Servlet Programming!</h3>");
        out.println("<p>Welcome to my First Servlet.</p>");
        out.println("</body>");
        out.println("</html>");

        out.close();
    }
}
