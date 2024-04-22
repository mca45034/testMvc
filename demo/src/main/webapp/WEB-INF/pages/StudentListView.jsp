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
<h1 align="center"><font color="blue"><u>Student List</u></font></h1>
	<sf:form method="post" modelAttribute="form">

	<div align="center"><h2><font color="red">${msgs}</font></h2></div>	
	<table align="center"><tr></tr><td><input type="reset" name="operation" value="Reset"></td></table>
		<table border="1" width="100%" align="center" cellpadding=6px cellspacing=".2">
			<tr>
				<th>Select</th>
				<th>ID</th>
				<th>Student FName</th>
				<th>Student FName</th>
				<th>Course</th>
			<th>Duration</th>
				<th>Edit</th>
			</tr>
			<c:forEach items="${list}" var="Stu">
				<tr>
					<td><sf:checkbox path="ids" value="${Stu.id}" /></td>
					<td><c:out value="${Stu.id }"></c:out></td>
					<td><c:out value="${Stu.fName }"></c:out></td>
					<td><c:out value="${Stu.lName }"></c:out></td>
					<td><c:out value="${Stu.course }"></c:out></td>
					<td><c:out value="${Stu.duration}"></c:out></td>
					<td><a href="<c:url value="/Stu?id=${Stu.id}" />">edit</a></td>
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