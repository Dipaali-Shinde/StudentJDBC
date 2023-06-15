<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>Input Page</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<form class="form" action="show.jsp" method="get">
			
			<div class="form-group">
				<label>Enter User Name</label>
				<input type="text" class="form-control"
				placeholder="User Name" name="username">	
			</div>
			
			<div class="form-group">
				<label>Enter User Email</label>
				<input type="email" class="form-control"
				placeholder="User Email" name="email">	
			</div>
			
			<div class="form-group">
				<label>Enter User Contact Number</label>
				<input type="text" class="form-control"
				placeholder="User Contact" name="contact">	
			</div>
			
			<input type="submit" class="btn btn-block btn-success"
			value="CLICK TO SEND" name="btnSend">
		</form>
	</div>
</body>
</html>