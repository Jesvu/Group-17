<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 



<h1>Login</h1>
<form action="/rest/restlogin/login" method="POST">
<label>Käyttäjätunnus:</label> <br>
<input type="text" placeholder="Käyttäjätunnus" name="username"> <br>
<label>Salasana:</label> <br>
<input type="password" placeholder="Salasana" name="password"> <br>
<button type="submit">Submit</button>
</form>


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
