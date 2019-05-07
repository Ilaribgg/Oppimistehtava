<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>


</head>
<body>
<!-- Reads the parameter "firstname" and displays -->
	<h1>Hello<c:out value="${param.firstname}"/></h1>
	
	
	<%--Calculates the sum and displays the result: --%>
	<h2>${1 + 2 +3 +4 }</h2>
</body>
</html>