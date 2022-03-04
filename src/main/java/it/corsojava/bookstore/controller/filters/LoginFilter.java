package it.corsojava.bookstore.controller.filters;

import java.io.IOException;

import it.corsojava.bookstore.beans.Utente;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebFilter(urlPatterns = {"/store/*"})
public class LoginFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse resp=(HttpServletResponse)response;		
		
		Utente user= (Utente)req.getSession().getAttribute("user");
		
		if(user!=null) {
			chain.doFilter(request, response);
		}else {
			String appPath=req.getContextPath();
			resp.sendRedirect(appPath+"/index.html");
			
		}
		
	}

	
	
}
