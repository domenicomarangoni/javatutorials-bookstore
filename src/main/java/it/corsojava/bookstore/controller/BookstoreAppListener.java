package it.corsojava.bookstore.controller;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class BookstoreAppListener implements ServletContextListener{
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("====================================");
		System.out.println("   APPLICAZIONE BOOKSTORE AVVIATA   ");
		System.out.println("====================================");
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("====================================");
		System.out.println("  APPLICAZIONE BOOKSTORE TERMINATA  ");
		System.out.println("====================================");
	}

}
