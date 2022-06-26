<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Simple Interest</title>
</head>
<body>
<form action="/simpleinterest" method="POST">
<div>
		<label>Amount</label>
		<input type="text" placeholder="Enter the amount" name="principle">
	</div>
	<div>
		<label>Interest</label>
		<input type="text" placeholder="Enter the rate of interest" name="interest">
	</div>
	<div>
		<label>Time</label>
		<input type="text" placeholder="Enter time period" name="time">
	</div>

	<input type="submit"/>
</form>
</body>
</html>