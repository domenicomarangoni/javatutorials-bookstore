package it.corsojava.bookstore.controller.servlets;

import java.io.IOException;

import it.corsojava.bookstore.beans.Utente;
import it.corsojava.bookstore.exceptions.UtenteDaoException;
import it.corsojava.bookstore.persistence.DbTools;
import it.corsojava.bookstore.persistence.dao.DaoFactory;
import it.corsojava.bookstore.persistence.dao.UtenteDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/registrazione")
public class ServletRegistrazione extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Utente u = new Utente();
		u.setCognome(req.getParameter("cognome"));
		u.setNome(req.getParameter("nome"));
		u.setCodiceFiscale(req.getParameter("codiceFiscale"));
		u.setPartitaIva(req.getParameter("partitaIva"));
		u.setIndirizzo(req.getParameter("indirizzo"));
		u.setCap(req.getParameter("cap"));
		u.setCitta(req.getParameter("citta"));
		u.setProvincia(req.getParameter("provincia"));
		u.setNazione(req.getParameter("nazione"));
		u.setMail(req.getParameter("email"));
		u.setTelefono(req.getParameter("telefono"));
		String priv=req.getParameter("privacy");
		if(priv!=null && priv.equalsIgnoreCase("on"))
			u.setPrivacy(1);
		u.setUsername(req.getParameter("username"));
		u.setUserPass(req.getParameter("userpass"));
		
		DaoFactory factory=DbTools.getDaoFactory(req);
		UtenteDao dao = factory.createUtenteDao();
		
		try {
			dao.addUtente(u);
			req.setAttribute("user", u);
		} catch (UtenteDaoException e) {
			req.setAttribute("error", e);
		}
		
		req.getRequestDispatcher("/WEB-INF/jsp/regConferma.jsp").forward(req, resp);
		
		
	}
	
}
