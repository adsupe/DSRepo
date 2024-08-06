<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Employee Details</title>
    <!-- Add Bootstrap CSS link -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-5">
        <div class="card">
            <div class="card-header">
                <h2>Employee Details</h2>
            </div>
            <div class="card-body">
                <ul class="list-group">
                    <li class="list-group-item"><strong>Name:</strong> ${employee.name}</li>
                    <li class="list-group-item"><strong>Email:</strong> ${employee.email}</li>
                    <li class="list-group-item"><strong>Role:</strong> ${employee.role}</li>
                    <li class="list-group-item"><strong>Location:</strong> ${employee.location}</li>
                    <li class="list-group-item"><strong>Business Unit:</strong> ${employee.businessUnit}</li>
                </ul>
            </div>
        </div>
    </div>

    <!-- Add Bootstrap JS and Popper.js (optional, depending on your needs) -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>
</html>
