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
<div align="center">

	<sf:form method="post" modelAttribute="form">
	
	<c:if test="${form.id>0 }" ><h1><font color="blue">update Student</font></h1></c:if>
	<c:if test="${form.id==0 }"><h1><font color="blue">add Student</font></h1></c:if>
     <H3 align="center">
				
				<h3><font color="green">${msg}</font></h3>
			</H3>
		<table>
			<tr>
				<th>Student Fname:</th>
				<td><sf:input path="fName" /></td>
				<td><font color="red"><sf:errors path="fName"></sf:errors></font></td>
			</tr>
            <tr>
            <th>Student Lname:</th>
            <td><sf:input path="lName" /></td>
            <td><sf:errors path="lName"></sf:errors></td>
            </tr>
            
            <tr>
            <th>Course:</th>
            <td><sf:input path="course" /></td>
            <td><sf:errors path="course"></sf:errors></td>
            </tr>
            
             <tr>
            <th>Duration:</th>
            <td><sf:input path="duration" /></td>
            <td><sf:errors path="duration"></sf:errors></td>
            </tr>
               <tr>
            <th></th>
            <c:if test="${form.id==0 }">
            <td><input type="submit" name="opretion" value="save"><input type="reset" name="opretion" value="reset"></td>
            </c:if>
             <c:if test="${form.id>0 }">
            <td><input type="submit" name="opretion" value="update">
            <a href="<c:url value="/Stu/search"/>">cancle</a></td>
            </c:if>
            
            </tr>

		</table>


	</sf:form>
	</div>

</body>
</html>