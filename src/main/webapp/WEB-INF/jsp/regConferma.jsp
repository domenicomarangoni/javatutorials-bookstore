<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" errorPage="/WEB-INF/jsp/error.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="/WEB-INF/jsp/header.jsp" %>

	<c:if test="${user != null}">
		<div class="alert alert-success text-center">
			<h3>Buongiorno ${user.nome}  ${user.cognome}</h3>
			<h5>Grazie per esserti registrato.</h5>
			<br /><br />
			<a class="btn btn-success" href="./index.html">Effettua il login per accedere</a>
		</div>
 	</c:if>
 	
 	<c:if test="${error!=null}" >
		<div class="alert alert-danger">
		${error.message}
		<a href="javascript:history.back()" class="btn btn-danger">Indietro</a>
		</div>
 	</c:if>

<%@include file="/WEB-INF/jsp/footer.jsp" %>