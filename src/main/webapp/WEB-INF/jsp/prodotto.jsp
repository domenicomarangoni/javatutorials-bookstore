<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" errorPage="/WEB-INF/jsp/error.jsp"%>
<%@ page import="java.util.*" %>
<%@ page import="it.corsojava.bookstore.beans.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="/WEB-INF/jsp/header.jsp" %>
 	
 	<%@include file="/WEB-INF/jsp/navbar.jsp" %> 
 	
 	<div class="row">
		<div class="col"><img src="/bookstore/images/${prodotto.nomeFile }" class="img-fluid" alt="Responsive image"></div>
			<div class="col">
				<p  class="mt-5 col text-center">
					<h2>${prodotto.titolo}</h2>
					<h5>${prodotto.sottotitolo}</h5>
				<hr class="my-4">
				<h4>Prezzo</h4>
				<div class="row">
					<div class="col">
						<p class="text-left"><h1 style="margin:0px">&euro;  ${prodotto.prezzo }</h1></p>
					</div>
					<div class="col">
						<p class="mt-4"><input type="number" name="points" min="0" max="100" step="1" value="1">
						<button type="button" class="btn btn-primary">Add</button></p>
					</div>
				</div>
				<div>
				<p class="font-weight-bold">Descrizione:</p>
				<p>${prodotto.descrizione}</p>
			</div>
		</div>
	</div>
 	
 <%@include file="/WEB-INF/jsp/footer.jsp" %>