<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="Header.jsp" %>
<form action="">
<div align="center">
<h1><font color="red">WELCOME TO SPRING MVC..!!!!!!</font></h1>
 <br>
 <br>
 <br>
 <br>
 <br>
 <br>
 <h3 align="center">
		 <a
			href="<c:url value="/Emp"/>"> Add Employee</a></font> | 
			<a
			href="<c:url value="/Emp/search"/>"> Employee List</a> |
			
			
	</h3>
	
</div>
</form>
<%@ include file="Footer.jsp" %>
</body>

</html>