<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
 .container
 {
    background-color: pink;
    width: 400px;
    height:300px;
    position:relative;
    margin-left:500px;
    margin-top:100px;
    padding-top:35px;
    border-radius:30px;
 }

</style>

</head>
<body>
  <form action="register" Method="post">
	<div class="container" align="center" >
		<table>
		    <caption><h3>Student Registraion Form</h3>	</caption>
			<tr>
				<td><label>Name</label></td>
				<td><input type="text" name="studentName" /></td>
			</tr>
			<tr>
				<td><label>Gender</label></td>
				<td><input type="radio" name="gender" value="Male" /> Male
				<input type="radio" name="gender" value="Female" /> Female
				</td>
			</tr>
			<tr>
				<td><label>DOB</label></td>
				<td><input type="date" name="dob" /></td>
			</tr>
			<tr>
				<td><label>Address</label></td>
				<td><input type="text" name="address" /></td>
			</tr>
			<tr>
				<td><label>Email</label></td>
				<td><input type="email" name="email" /></td>
			</tr>
			<tr>
				<td><label>Contact no</label></td>
				<td><input type="number" name="phoneno" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Register" /> <input
					type="reset" value="clear" /></td>
			</tr>
		</table>

	</div>
    </form>
</body>
</html>