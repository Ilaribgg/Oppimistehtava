<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>


</head>
<body>

	<form method="get" action="search">
		<input type="text" name="keyword" /> <input type="submit"
			value="Search" />
	</form>
	<ul>
		<c:forEach var="album" items="$ {albums }">
			<li><c:out value="${album.getTitle() }" /></li>
		</c:forEach>

	</ul>
</body>
</html>