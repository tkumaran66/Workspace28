<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<div class="container">
<font color="red">${errMess}</font>
<form method="post">
 Name: <input type="text" name="name"/>
 Password:<input type="password" name="pwd"/>
 <input type="submit">
</form>
</div>
<%@ include file="common/footer.jspf" %>