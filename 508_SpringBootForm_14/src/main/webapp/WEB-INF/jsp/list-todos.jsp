<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Todo's for ${MyName }</title>
</head>
<body>
<h1>Your Todo's</h1>
<table>
<caption>Your todo's are</caption>
<thead>
<tr>
<th>Id</th>
<th>User name</th>
<th>Description</th>
<th>Target Date</th>
<th>Is it done?</th>
</tr>
</thead>
<tbody>
<c:forEach items="${todos}" var="todo">
	<tr>
		<td>${todo.id}</td>
		<td>${todo.user}</td>
		<td>${todo.desc}</td>
		<td>${todo.targetDate}</td>
		<td>${todo.done}</td>
	</tr>
</c:forEach>
</tbody>
</table>
<a href="/add-todos">Click here to add more</a>
</body>
</html>
