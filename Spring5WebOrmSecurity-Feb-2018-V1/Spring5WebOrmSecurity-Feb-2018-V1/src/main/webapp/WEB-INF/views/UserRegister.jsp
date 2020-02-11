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
<h3>Welcome to User Register Page!!</h3>
<form:form action="save" method="POST" modelAttribute="user">
<pre>
 NAME : <form:input path="userName"/>
 EMAIL: <form:input path="userEmail"/>
 PWD  : <form:password path="userPwd"/>
 ROLES: 
       <form:checkbox path="userRoles" value="EMPLOYEE"/> EMPLOYEE
       <form:checkbox path="userRoles" value="ADMIN"/> ADMIN
	<input type="submit" value="Register"/>       
</pre> 
</form:form>
${message}
</body>
</html>