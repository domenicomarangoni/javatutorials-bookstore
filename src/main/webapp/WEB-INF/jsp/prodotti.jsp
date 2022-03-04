<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" errorPage="/WEB-INF/jsp/error.jsp"%>
<%@ page import="java.util.*" %>
<%@ page import="it.corsojava.bookstore.beans.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="/WEB-INF/jsp/header.jsp" %>
 
	<h1 class="text-center">PRODOTTI</h1>
	<p class="text-center">Elenco dei prodotti</p>
	<br/>
	<div class="container card-deck mb-3 text-center mx-auto" >
	
		<c:forEach items="${prodotti}" var="prodotto">
		
			<div class="row mt-5">
				<div class="col-4">
					<img class="img-fluid" src="/bookstore/images/${prodotto.nomeFile}">			
				</div>
				<div class="col-8">
					<h5 class="">${prodotto.titolo}</h5>
					<p class="">${prodotto.sottotitolo}</p>
					<h6 class="text-muted">&euro; ${prodotto.prezzo } </h6>
					<a href="/prodotto?id=${prodotto.idProdotto}" class="btn btn-primary">Dettagli</a>
				</div>
			</div>
		
		</c:forEach>
		
	</div>
 <%@include file="/WEB-INF/jsp/footer.jsp" %>