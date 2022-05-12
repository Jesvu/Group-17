<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.ArrayList"%>
    <%@ page import="data.*"%>
    <%@ page import="model.*"%>
<%@ page import="services.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css"
	href="/jsp/css.css" />
<meta charset="ISO-8859-1">
<title>Ehdokkaat</title>
</head>
<body>
	<header>
		<h1><a href="/index.html">Electionmachine</a></h1>
	</header>
		<section>
			<div class="page">
				<div class="sidebar">
					<div>
						<a href='/rest/electionmachine/read'>Ehdokkaat</a>
					</div>
					&nbsp;
					<div>
						<a href='/rest/electionmachine/questions'>Kysymykset</a>
					</div>
					&nbsp;
					<div>
					 	<a href="/rest/restquest/getallquestions">Vastaa kysymyksiin</a>
					</div>
					&nbsp;
					<div>
					<a href="/rest/restlogin/loginpage">Kirjautuminen</a>
					</div>
				</div>
			</div>
	<article>	
		<form action='../read' method='get'>

			<div class="tiedot">

				<c:forEach var="Ehdokkaat" items="${requestScope.ehdokaslista}">
					<ol>${Ehdokkaat.ehdokasId} ${Ehdokkaat.etunimi} ${Ehdokkaat.sukunimi} ${Ehdokkaat.puolue}
					<br><b>Miksi eduskuntaan? </b>
					<br>${Ehdokkaat.miksiEduskuntaan}
					<br><b>Mitä asioita haluat edistää?</b>
					<br>${Ehdokkaat.mitaAsioitaHaluatEdistaa}
					</ol>
				</c:forEach>
			</div>

		</form>
	</article>
</section>

<footer>
	<h1>Jussi Rinta-Kiikka, Jesse Vuorela, Tanika Syrjälä</h1>
</footer>
</body>
</html>