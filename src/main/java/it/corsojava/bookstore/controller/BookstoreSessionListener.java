package it.corsojava.bookstore.controller;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class BookstoreSessionListener implements HttpSessionListener {
	
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("NUOVA SESSIONE AVVIATA: id "+se.getSession().getId());
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("TERMINATA SESSIONE CON ID "+se.getSession().getId());
	}
	
}
