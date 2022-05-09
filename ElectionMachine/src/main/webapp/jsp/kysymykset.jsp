<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Kysymykset</title>
</head>
<body>

<form action='../kysymykset' method='get'>
<c:forEach var="Ehdokkaat" items="${requestScope.kysymyslista}">
	<ol>${Kysymykset.kysymysId}
	<br>${Kysymykset.kysymys}
	</ol>
</c:forEach>
</form>

</body>
</html>