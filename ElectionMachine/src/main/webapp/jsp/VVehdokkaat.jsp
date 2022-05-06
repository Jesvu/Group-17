<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.util.ArrayList"%>
<%@ page import="model.*"%>
<%@ page import="services.AnswerService"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<h2> jokpojp:</h2> <br><br>


<c:forEach var="VVehdokkaat"
	items="${requestScope.VVehdokkaat}">
</c:forEach>
	