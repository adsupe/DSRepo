<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
    <link href="webjars/bootstrap/5.1.0/css/bootstrap.min.css" rel="stylesheet">
    <script src="webjars/bootstrap/5.1.0/js/bootstrap.min.js"></script>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>
    <h2>Registration successfully completed</h2>
    
    <h3>List of Students:</h3>
    <table class="table table-striped">
        <thead>
            <tr>
                <th>Name</th>
                <th>Gender</th>
                <th>DOB</th>
                <th>Address</th>
                <th>Email</th>
                <th>Contact No</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="student" items="${students}">
                <tr>
                    <td>${student.studentName}</td>
                    <td>${student.gender}</td>
                    <td>${student.dob}</td>
                    <td>${student.address}</td>
                    <td>${student.email}</td>
                    <td>${student.phoneno}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>