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
<title>Insert title here</title>
</head>
<body>

<form action='../read' method='get'>
<c:forEach var="Ehdokkaat" items="${requestScope.ehdokaslista}">
	<ol>${Ehdokkaat.ehdokasId} ${Ehdokkaat.etunimi} ${Ehdokkaat.sukunimi} ${Ehdokkaat.puolue}
	<br><b>Miksi eduskuntaan? </b>
	<br>${Ehdokkaat.miksiEduskuntaan}
	<br><b>Mita asioita haluat edistää?</b>
	<br>${Ehdokkaat.mitaAsioitaHaluatEdistaa}
	</ol>
</c:forEach>
</form>
</body>
</html>