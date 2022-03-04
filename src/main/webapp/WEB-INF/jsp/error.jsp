<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isErrorPage="true" %>
 <html>
 	<head>
 		<title>Web UI - Frontend</title>

		<meta charset="utf-8">
    	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
 		
 		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
		<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
 		
 	</head>
 	<body>
 		<header class="jumbotron  bg-dark text-white " style="margin-bottom:0px; padding:32px;" >
 			<h1><img src="./images/logoBooks.png" style="width:50px;margin-top:-5px;" /> BOOKSTORE</h1> 		
 		</header>
 		
 		<main class="container">
 		
 		<h2 class="text-danger">Si e' verificato un problema</h2>
 		
 		<h3 class="alert alert-warning">${exception.message}</h3>
 		 		
 		<br /><br />
 		
 		<div class=text-center">		
			<a href="javascript:history.back()" class="btn btn-info">Indietro</a>
		</div>
		
 		<br /><br />
 		
 		</main>
 		<footer class="jumbotron bg-dark text-white">
 		
 			<span class="">
	 		Acme Spa <br />
			Viale Italia, 69 -	00000 Noplace (XX) ITALY - Phone +39 02 00000000<br />  
			P.I. Reg. Imprese Cod. Fisc. IT 000000000 - R.E.A. XX 00000 - Cap. Soc. Euro 1.000.000,00 i.v.
			</span>
		 
 			
	 	</footer>
 	</body>
 </html>