<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.util.ArrayList"%>
<%@ page import="model.*"%>
<%@ page import="data.*"%>
<%@ page import="services.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/css.css" /> 
<title>Electionmachine</title>
</head>
<body>
	<header>
		<h1><a href="/index.html">Electionmachine</a></h1>
	</header>
<section>
	<div class="page">
	<div class="sidebar">
				<div>
					<a href='/ehdokkaat'>Ehdokkaat</a>
				</div>
				&nbsp;
				<div>
					<a href='/showkysymykset'>Kysymykset</a>
				</div>
			</div>
		</div>
	<article>


			<h2>Sopivat ehdokkaat</h2>
			<c:forEach var="VVehdokkaat" items="${requestScope.VVehdokkaat}">
				<div class="tiedot">
					<p>
						<b>${VVehdokkaat.ehdokas_id} ${VVehdokkaat.ehdokasEtunimi}
							 ${VVehdokkaat.ehdokasSukunimi} </b>
</p>

				</div>
			</c:forEach>

		</article>
		
			</section>
	<footer>
		<h1>Jussi Rinta-Kiikka, Jesse Vuorela, Tanika Syrjälä</h1>
	</footer>

	</body>
</html>
	