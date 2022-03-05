package it.corsojava.bookstore.controller.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import it.corsojava.bookstore.beans.ElencoProdotti;
import it.corsojava.bookstore.beans.Prodotto;
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

@WebServlet("/store/prodotti")
public class ServletProdotti extends HttpServlet {

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
		
		try {
			List<Prodotto> prodotti = dao.getProdotti();
			// Elaborazione della singola lista in una "lista di liste", ovvero un insieme i cui 
			// elementi sono a loro volta liste di 3 elementi. Questo serve
			// per suddividiere gli articoli in gruppi di 3 da impaginare cosi' in
			// una griglia di 3 elementi per riga
			List<List<Prodotto>> prodList=new ArrayList<List<Prodotto>>();
			
			ElencoProdotti elenco=new ElencoProdotti();
			
			prodotti.forEach(elenco::addProdotto );
			
			req.setAttribute("elencoprodotti", elenco.getRighe());
			RequestDispatcher disp=req.getRequestDispatcher("/WEB-INF/jsp/prodotti.jsp");

			disp.forward(req, resp);
			
		} catch (ProdottoDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
