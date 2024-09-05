<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<form action="listAll" method="get">
<body>
<button type="submit"> move to board </button>
<h1>
	Simple Homepage! 
	
</h1>

<P>  The time on the server is ${serverTime}. </P>
</body>
</form>
</html>
