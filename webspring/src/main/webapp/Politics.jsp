<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Politics.do" method="post">
	<pre>
	NoOfCandidate : <input type="text" name="noOfCandidate">
	ElectionDate     : <input type="text" name="electionDate">
	PartyName    : <SELECT type="partyName">
	<option value="congress">congress</option>
	<option value="ysr">ysr</option>
	<option value="bjp">bjp</option>
	 </SELECT>
	 <input type="submit" value="Clickme">
	</pre>
	
</form>

</body>
</html>