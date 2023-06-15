<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1">
  <title>Show Page</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
	
	 <jsp:useBean class="com.usebeandemo.pojo.User" id="u" scope="page"/>
	 <jsp:setProperty property="*" name="u"/>
		
		<h2 style="color:green;text-align:center">User Details are :- </h2>
		<ul style="color:slateblue">
			<li>
				Username : <jsp:getProperty property="username" name="u"/> 
			</li>
			<li>
				Email : <jsp:getProperty property="email" name="u"/> 
			</li>
			<li>
				Contact : <jsp:getProperty property="contact" name="u"/>
			</li>
		</ul>
	</div>
</body>
</html>
