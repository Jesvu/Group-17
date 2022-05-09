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
<meta charset="ISO-8859-1">
<title>Kysymykset</title>
</head>
<body>

<form action='../kysymykset' method='get'>
<c:forEach var="Kysymykset" items="${requestScope.kysymyslista}">
	<ol>${Kysymykset.kysymysId}
	<br>${Kysymykset.kysymys}
	</ol>
</c:forEach>
</form>

</body>
</html>