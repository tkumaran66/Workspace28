<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
	<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
	<title>First web application</title>
</head>
<body>
<div class="container">
My Name: ${MyName }</br>
<form:form method="post" modelAttribute="todo">
<fieldset class="form-group">
	<form:label path="desc">Description: </form:label>
	<form:input path="desc" type="text" class="form-control" required="required"/>
	<form:errors path="desc" cssClass="text-warning"/>
</fieldset>

<fieldset class="form-group">
	<form:label path="targetDate">Target date: </form:label>
	<form:input path="targetDate" type="text" class="form-control" required="required"/>
	<form:errors path="targetDate" cssClass="text-warning"/>
</fieldset>
<form:input path="done" type="hidden" class="form-control"/>
	<button class="btn btn-success" name="done" type="submit">Add</button>
</form:form>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	<script
		src="webjars/bootstrap-datepicker/1.0.1/js/bootstrap-datepicker.js"></script>
	<script>
		$('#targetDate').datepicker({
			format : 'dd/mm/yyyy'
		});
	</script>
	</div>
</body>
</html>
