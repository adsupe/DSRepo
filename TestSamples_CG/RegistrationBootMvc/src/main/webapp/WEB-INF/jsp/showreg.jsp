<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Details</title>
</head>
<body>
<h1>Registration details</h1>
<p>First Name :${regBootMvcDto.firstName}</p>
<p>Last Name  :${regBootMvcDto.lastName}</p>
<p>Age :${ regBootMvcDto.age}</p>
<p>Gender  :${regBootMvcDto.gender}</p>
<a href="http://localhost:8085/formpage">Go Back to Reg Page</a><br>
</body>
</html>