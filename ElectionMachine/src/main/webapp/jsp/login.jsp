<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="data.*"%>
<%@ page import="services.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html> 
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/jsp/css.css" />
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
	
	<div class="tiedot">

<h1>Login</h1>
<form action="/rest/restlogin/login" method="POST">
<label>Käyttäjätunnus:</label> <br>
<input type="text" placeholder="Käyttäjätunnus" name="username"> <br>
<label>Salasana:</label> <br>
<input type="password" placeholder="Salasana" name="password"> <br>
<button type="submit">Submit</button>
</form>

	</div>

<%
String userProvidedUsername = (String)request.getAttribute("userProvidedUsername");
String username = (String)request.getAttribute("username");
String password = (String)request.getAttribute("password");
String MD5Password = (String)request.getAttribute("MD5Password");
%>



<%
if(data.Login.CheckPasswords(MD5Password, password)==true && userProvidedUsername.equals(username)){
	response.sendRedirect("/rest/restquest/getallquestions");
} else if (data.Login.CheckPasswords(MD5Password, password)==false || userProvidedUsername!=username){
}
%>

		</article>


	</section>
	<footer>
		<h1>Jussi Rinta-Kiikka, Jesse Vuorela, Tanika Syrjälä</h1>
	</footer>
</body>
</html>