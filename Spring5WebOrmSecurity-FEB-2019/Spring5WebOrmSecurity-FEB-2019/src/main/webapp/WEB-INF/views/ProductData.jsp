<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="../logout">Logout Here</a>
	<h3>Welcome to Product Data Page!!</h3>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>CODE</th>
			<th>COST</th>
			<th>OPERATION</th>
		</tr>
		<c:forEach items="${list}" var="p">
			<tr>
				<td><c:out value="${p.prodId }" /></td>
				<td><c:out value="${p.prodName }" /></td>
				<td><c:out value="${p.prodCode }" /></td>
				<td><c:out value="${p.prodCost }" /></td>
				<td>
					<a href="delete?id=${p.prodId}">DELETE</a>
				</td>
			</tr>
		</c:forEach>
	</table>
${message}
</body>
</html>


