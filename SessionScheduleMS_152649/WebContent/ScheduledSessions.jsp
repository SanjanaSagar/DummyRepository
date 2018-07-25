<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="a" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Scheduled Sessions</h2></br>
<table border="1px">
<tr>
<th>SessionName</th>
<th>Duration(Days)</th>
<th>Faculty</th>
<th >Mode</th>
</tr>
<a:forEach items="${sess}" var="sess" >
<tr>
<td>${sess.name}</td>
<td>${sess.duration}</td>
<td>${sess.faculty}</td>
<td>${sess.mode}</td>
<td><a href="success/${sess.id}">EnrollMe</a>
</tr>
</a:forEach>
</table>



</body>
</html>