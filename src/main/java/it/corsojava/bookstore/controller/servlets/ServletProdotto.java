package it.corsojava.bookstore.controller.servlets;

import java.io.IOException;
import java.util.List;

import it.corsojava.bookstore.beans.Prodotto;
import it.corsojava.bookstore.beans.Utente;
import it.corsojava.bookstore.exceptions.ProdottoDaoException;
import it.corsojava.bookstore.persistence.DbTools;
import it.corsojava.bookstore.persistence.dao.DaoFactory;
import it.corsojava.bookstore.persistence.dao.ProdottoDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/store/prodotto")
public class ServletProdotto extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doAny(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doAny(req, resp);
	}
	
	protected void doAny(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		DaoFactory factory=DbTools.getDaoFactory(req);
		ProdottoDao dao=factory.createProdottoDao();
		

		String idProdottoStr = req.getParameter("id");
		int idProdotto = 0;
		
		try {
			idProdotto=Integer.parseInt(idProdottoStr);
		} catch (NumberFormatException e) {
			// Nel caso manchi idProdotto si torna a elenco prodotti
			e.printStackTrace();
			//resp.sendRedirect("./store/prodotti");
		}
		
		try {
			Prodotto prodotto = dao.getProdottoById(idProdotto);
			req.setAttribute("prodotto", prodotto);
			RequestDispatcher disp=req.getRequestDispatcher("/WEB-INF/jsp/prodotto.jsp");

			disp.forward(req, resp);
			
		} catch (ProdottoDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
