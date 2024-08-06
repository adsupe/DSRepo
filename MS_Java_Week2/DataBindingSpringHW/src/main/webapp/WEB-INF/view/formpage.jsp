<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Welcome to Home Page</h1>
<form:form action="processwelcome" method = "post" modelAttribute="userInfo">
<div align="center">
<p>
<label for="yn">Your Name</label>
<form:input id="yn" path="userName"/>
</p>
<p>
<label for ="cn">Friend name</label>
<form:input id ="cn" path="friendName"/>



</p>
<input type="submit" value="calculate"/>



</div>


</form:form>
</body>
</html>