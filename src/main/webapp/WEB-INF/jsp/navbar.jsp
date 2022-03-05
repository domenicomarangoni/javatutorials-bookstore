<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<nav class="navbar navbar-expand-lg navbar-light bg-light">  
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" 
          aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav  mr-auto mt-2 mt-lg-0">
      <li class="nav-item active">
        <a class="nav-link" href="${pageContext.request.contextPath}/store/prodotti">Prodotti</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="${pageContext.request.contextPath}/store/carrello">Carrello</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="${pageContext.request.contextPath}/store/ordini">Ordini</a>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled" href="${pageContext.request.contextPath}/store/profilo">Profilo</a>
      </li>
      
    </ul>
     <form class="form-inline my-2 my-lg-0">
    	<a class="btn btn-outline-secondary my-2 my-sm-0" type="submit" href="${pageContext.request.contextPath}/store/logout">
    		<span>Esci</span>
		</a>
    </form>
  </div>
</nav>
