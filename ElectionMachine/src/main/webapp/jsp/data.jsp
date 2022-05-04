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
		<b>${Questions.questionsId}: </b>${Questions.questions} <br>
		<br>
		<input type="radio" id="${Questions.questionsId}1"
			name="${Questions.questionsId}" value="1">
		<label for="${Questions.questionsId}1"> 1. Täysin eri mieltä</label>
		<br>
		<input type="radio" id="${Questions.questionsId}2"
			name="${Questions.questionsId}" value="2">
		<label for="${Questions.questionsId}2"> 2. Jokseenkin eri
			mieltä</label>
		<br>
		<input type="radio" id="${Questions.questionsId}3"
			name="${Questions.questionsId}" value="3">
		<label for="${Questions.questionsId}3">3. En osaa sanoa</label>
		<br>
		<input type="radio" id="${Questions.questionsId}4"
			name="${Questions.questionsId}" value="4">
		<label for="${Questions.questionsId}4">4. Jokseenkin samaa
			mieltä</label>
		<br>
		<input type="radio" id="${Questions.questionsId}5"
			name="${Questions.questionsId}" value="5">
		<label for="${Questions.questionsId}5"> 5. Täysin samaa mieltä</label>
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
