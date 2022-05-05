<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.ArrayList"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:forEach var="kysymys" items="${requestScope.ehdokas.kysymykset}">
${vastaus.Kysymykset.kysymysId}: ${answer.Kysymykset.kysymys} -

	<c:choose>
		<c:when test="${kysymys.kysymykset == 1}">
			<b>Täysin eri mieltä</b>
		</c:when>
		<c:when test="${kysymys.kysymykset == 2}">
			<b>Jokseenkin eri mieltä</b>
		</c:when>
		<c:when test="${kysymys.kysymykset == 3}">
			<b>En osaa sanoa</b>
		</c:when>
		<c:when test="${kysymys.kysymykset == 4}">
			<b>Jokseenkin samaa mieltä</b>
		</c:when>
		<c:when test="${kysymys.kysymykset == 5}">
			<b>Täysin samaa mieltä</b>
		</c:when>
		<c:otherwise>
			<b>Ei vastausta</b>
		</c:otherwise>
	</c:choose>
	<br>
</c:forEach>
</body>
</html>