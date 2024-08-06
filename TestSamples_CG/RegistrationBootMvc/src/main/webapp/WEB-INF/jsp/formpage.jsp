<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
</head>
<body>
<h1 align="center">Welcome to Registration Page</h1>
<form:form action="showreg" method = "post" modelAttribute="regBootMvcDto">
<div align="center">
<p>
<label for="fn">First Name</label>
<form:input id="fn" path="firstName"/>
</p>

<p>
<label for ="ln">Last name</label>
<form:input id ="ln" path="lastName"/>
</p>

<p>
<label for ="ag">Age</label>
<form:input id ="ag" path="age"/>
</p>

<p>
<label for ="gen">Gender</label>
<form:input id ="gen" path="gender"/>
</p>

<input type="submit" value="submit"/>



</div>


</form:form>
</body>
</html>