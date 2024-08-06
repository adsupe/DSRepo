<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Registration Page</title>
    <!-- Add Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-5">
        <h2>Registration Form</h2>
        
        <form:form action="create" modelAttribute="employee" method="post" class="mt-3">
            <div class="form-group">
                <label for="name">Name:</label>
                <form:input path="name" class="form-control" id="name" required="true"/>
            </div>

            <div class="form-group">
                <label for="email">Email:</label>
                <form:input path="email" class="form-control" id="email" required="true" type="email"/>
            </div>

            <div class="form-group">
                <label for="role">Role:</label>
                <form:input path="role" class="form-control" id="role" required="true"/>
            </div>

            <div class="form-group">
                <label for="location">Location:</label>
                <form:input path="location" class="form-control" id="location" required="true"/>
            </div>

            <div class="form-group">
                <label for="businessUnit">Business Unit:</label>
                <form:input path="businessUnit" class="form-control" id="businessUnit" required="true"/>
            </div>

            <button type="submit" class="btn btn-primary">Register</button>
        </form:form>
    </div>

    <!-- Add Bootstrap JS (optional, depending on your needs) -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>
</html>
