<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor = "pink">
<form method = "post" action = "processOrder">
<div align = "CENTER">
<h1 align = "CENTER">Momo's Cafe</h1>
<label for = "myinput">itemName</label>
<input type="text" name = "itemName" id = "myinput"/>
<input type="submit" name="Order" value="Press Here"/>
</div>
</form>
<h1>My Name is:${myname}</h1>
</body>
</html>