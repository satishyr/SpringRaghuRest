<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="../logout">Logout Here</a>
<h3>Welcome to Product Register Page!!</h3>
<form:form action="save" method="POST" modelAttribute="product">
<pre>
 NAME : <form:input path="prodName"/>
 <form:errors path="prodName"/>
 CODE : <form:input path="prodCode"/>
 <form:errors path="prodCode"/>
 COST : <form:input path="prodCost"/>
 <form:errors path="prodCost"/>
 <input type="submit" value="Register"/>
</pre>
</form:form>
${message}
</body>
</html>