<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Applying for Protest</title>
</head>
<body>
<form action="Protest.do" method="post">
	<pre>
	Organization: <input type="text" name="organization">
	Reason      : <input type="textArea" name="reason">
	Date        : <input type="text" name="date">
	Location    : <SELECT name="location">
	<option value="Road">road</option>
	<option value="Park">park</option>
	<option value="Mall">mall</option>
	 </SELECT>
	 <input type="submit" value="Apply">
	</pre>
	
</form>
</body>
</html>
