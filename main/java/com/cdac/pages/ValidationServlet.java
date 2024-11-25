package com.cdac.pages;

import static com.cdac.util.DBUtils.closeConnection;
import static com.cdac.util.DBUtils.openConnection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.dao.UserDaoImpl;
import com.cdac.pojo.User;

@WebServlet(value ="/valid" ,loadOnStartup = 1 )
public class ValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDaoImpl dao;
	
    public ValidationServlet() throws SQLException {
        System.out.println("In default ctor of validation servlet");
    }
    
    @Override
    public void init() throws ServletException {
    	try {
			openConnection();
			dao = new UserDaoImpl();
		} catch (Exception e) {
			throw new ServletException("error in init"+getClass(),e);
		}
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		System.out.println("Email : "+email);
		System.out.println("Password : "+password);
		
		try(PrintWriter pw = response.getWriter()) {
			User user = dao.validateUser(email, password);
			
			if(user == null) {
				pw.print("<h4> Invalid user </h4>");
			}else {
				pw.print("<h4> Welcome "+ user.getFirstName()+"</h4>");
			}
			
		} catch (Exception e) {
			throw new ServletException("validataion servlet : "+getClass(),e);
		}
	}
	
	@Override
	public void destroy(){
		try {
			closeConnection();
		} catch (Exception e) {
			throw new RuntimeException("error in init"+getClass(),e);
		}	
	}
}
