<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<div class="container">
<table class="table table-striped">
<caption>Your todo's are</caption>
	<thead>
	<tr>
	<th>Id</th>
	<th>User name</th>
	<th>Description</th>
	<th>Target Date</th>
	<th>Is it done?</th>
	<th>Update</th>
	<th>Delete</th>
	</tr>
	</thead>
	<tbody>
			<c:forEach items="${todos}" var="todo">
				<tr>
					<td>${todo.id}</td>
					<td>${todo.user}</td>
					<td>${todo.desc}</td>
					<td><fmt:formatDate value="${todo.targetDate}" pattern="dd/MM/yyyy"></fmt:formatDate></td>
					<td>${todo.done}</td>
					<td><a type="button" class="btn btn-warning" href="/update-todo?id=${todo.id}">Update</a></td>
					<td><a type="button" class="btn btn-warning" href="/delete-todo?id=${todo.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</tbody>
</table>
<div class="button"><a href="/add-todos">Click here to add more</a></div>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<%@ include file="common/footer.jspf" %>