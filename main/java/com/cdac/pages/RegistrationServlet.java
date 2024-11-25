package com.cdac.pages;

import static com.cdac.util.DBUtils.openConnection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.dao.UserDao;
import com.cdac.dao.UserDaoImpl;
import com.cdac.pojo.User;


/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/register_user")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;  
    private UserDao dao;
	
    @Override
    public void init() throws ServletException {
    	try {
			openConnection();
			dao = new UserDaoImpl();
    	} catch (SQLException e) {
			throw new ServletException("Error in "+getClass(),e);
		}
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		try(PrintWriter pw = response.getWriter()) {
			String res = dao.addUser(new User(Integer.parseInt(request.getParameter("id")),
					request.getParameter("first_name"),
					request.getParameter("last_name"),
					request.getParameter("email"),
					request.getParameter("password"),
					request.getParameter("city"),
					request.getParameter("role")
					));
			pw.print("<h4>"+res+"</h4>");
			
		} catch (Exception e) {
			throw new ServletException("Error in "+getClass(),e);
		}
		
	}

}
