<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Country.do" method="post">
	<pre>
	CountryName  : <input type="text" name="countryName">
	CapitalCity  : <input type="text" name="capitalCity">
	Continent    : <SELECT name="continent">
	<option value="asia">asia</option>
	<option value="amerika">amerika</option>
	<option value="afrika">afrika</option>
	 </SELECT>
	 <input type="submit" value="Save">
	</pre>
	
</form>
</body>
</html>
