
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="Header.jsp" %>
<%@ include file="Footer.jsp" %>
<h1 align="center"><font color="blue"><u>Employee List</u></font></h1>
	<sf:form method="post" modelAttribute="form">
	
		
	
		<table border="1" width="100%" align="center" cellpadding=6px cellspacing=".2">
			<tr>
				<th>Select</th>
				<th>ID</th>
				<th>Employe Name</th>
				<th>Department</th>
				<th>Login</th>
				<th>Password</th>
				<th>Address</th>
				<th>Edit</th>
			</tr>
			<c:forEach items="${list}" var="Emp">
				<tr>
					<td><sf:checkbox path="ids" value="${Emp.id}" /></td>
					<td><c:out value="${Emp.id }"></c:out></td>
					<td><c:out value="${Emp.name }"></c:out></td>
					<td><c:out value="${Emp.department }"></c:out></td>
					<td><c:out value="${Emp.login }"></c:out></td>
					<td><c:out value="${Emp.password }"></c:out></td>
					<td><c:out value="${Emp.address }"></c:out></td>
					<td><a href="<c:url value="/Emp?id=${Emp.id}" />">edit</a></td>
				</tr>
			</c:forEach>
		</table>
		<table>
			<tr>
				<td><input type="submit" name="operation" value="delete"></td>
				</td>
			</tr>
		</table>
	</sf:form>
	
</body>
</html>
