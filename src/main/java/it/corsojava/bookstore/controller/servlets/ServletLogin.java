package it.corsojava.bookstore.controller.servlets;

import java.io.IOException;

import it.corsojava.bookstore.beans.Utente;
import it.corsojava.bookstore.exceptions.UtenteDaoException;
import it.corsojava.bookstore.persistence.DbTools;
import it.corsojava.bookstore.persistence.dao.DaoFactory;
import it.corsojava.bookstore.persistence.dao.UtenteDao;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class ServletLogin extends HttpServlet {

	private static final long serialVersionUID = 3718616020094211633L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String userName=req.getParameter("username");
		String userPass=req.getParameter("userpass");
		
		DaoFactory factory=DbTools.getDaoFactory(req);
		UtenteDao dao = factory.createUtenteDao();
		
		try {
			Utente user = dao.getByLogin(userName, userPass);
			if(user==null) {
				resp.sendRedirect("./");
			}else {
				HttpSession session= req.getSession();
				session.setAttribute("user", user);
				
				ServletContext application = req.getServletContext();
				
				resp.sendRedirect("./store/prodotti");
			}
		} catch (UtenteDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
