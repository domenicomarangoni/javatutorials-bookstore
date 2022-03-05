<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" errorPage="/WEB-INF/jsp/error.jsp"%>
<%@ page import="java.util.*" %>
<%@ page import="it.corsojava.bookstore.beans.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="/WEB-INF/jsp/header.jsp" %>
	
	<%@include file="/WEB-INF/jsp/navbar.jsp" %> 
		
	<h2 class="text-center">Elenco dei prodotti</h1>
	<br/>
	<div class="container card-deck mb-3 text-center mx-auto" >
	
		<c:forEach items="${elencoprodotti}" var="elenco">
			<div class="row mt-5">
				<c:forEach items="${elenco}" var="prodotto">
					
					<div class="col-4">
						<div class="card">
						
							<img class="card-img-top" src="/bookstore/images/${prodotto.nomeFile}" >
							<div class="card-body">
								<h5 class="card-title">${prodotto.titolo}</h5>
								
								<p class="text-muted">&euro; ${prodotto.prezzo } </h6>
								<p>
								<a href="./prodotto?id=${prodotto.idProdotto}" class="btn btn-primary">Dettagli</a>
								</p>
							</div>
						</div>			
					</div>
				
				</c:forEach>
				
			</div>
			
		</c:forEach>
		
	</div>
 <%@include file="/WEB-INF/jsp/footer.jsp" %>