<!DOCTYPE html>
<html>
<head>
	<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
	<title>First web application</title>
</head>
<body>
<div class="container">
My Name: ${MyName }</br>
<form method="post">
<fieldset class="form-group">
	<label>Description: </label>
	<input name="desc" type="text" class="form-control" required="required"/>
</fieldset>
	<button class="btn btn-success" name="done" type="submit">Add</button>
</form>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	</div>
</body>
</html>
