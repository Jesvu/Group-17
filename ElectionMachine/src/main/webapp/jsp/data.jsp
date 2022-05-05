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
<link rel="stylesheet" href="css.css">
<title>pliiploo</title>
</head>

<body>
<section>

	<article> 
	<p>
		<div class="tiedot">
<h2>Vastaa kysymyksiin</h2>
<br>
<br>
<form method="post" action="/bestcandidates">
	<c:forEach var="Kysymykset" items="${requestScope.questionlist}">
		<b>${Kysymykset.kysymysId}: </b>${Kysymykset.kysymys} <br>
		<br>
		<input type="radio" id="${Kysymykset.kysymysId}1"
			name="${Kysymykset.kysymysId}" value="1">
		<label for="${Kysymykset.kysymysId}1"> 1. Täysin eri mieltä</label>
		<br>
		<input type="radio" id="${Kysymykset.kysymysId}2"
			name="${Kysymykset.kysymysId}" value="2">
		<label for="${Kysymykset.kysymysId}2"> 2. Jokseenkin eri
			mieltä</label>
		<br>
		<input type="radio" id="${Kysymykset.kysymysId}3"
			name="${Kysymykset.kysymysId}" value="3">
		<label for="${Kysymykset.kysymysId}3">3. En osaa sanoa</label>
		<br>
		<input type="radio" id="${Kysymykset.kysymysId}4"
			name="${Kysymykset.kysymysId}" value="4">
		<label for="${Kysymykset.kysymysId}4">4. Jokseenkin samaa
			mieltä</label>
		<br>
		<input type="radio" id="${Kysymykset.kysymysId}5"
			name="${Kysymykset.kysymysId}" value="5">
		<label for="${Kysymykset.kysymysId}5"> 5. Täysin samaa mieltä</label>
		<br>
		<br>
	</c:forEach>

	<input type="submit" value="Save" class="button">
</form>
				</div>
					
			</article>
	
	</section>
	</body>
</html>
