<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> -->
<html>
<head>
	<meta charset="utf-8">

</head>
<body>
	<h1>Crear contacto:</h1>
	
	<form method="POST" action="/delete">
		<table>

			<tr>
				<td><label name="id">id</form:label></td>
				<td><input name="id" /></td>
			</tr>
			<tr>
				<td colspan="2">
				    	<input type="submit" value="Submit"/>
				</td>
				<td colspan="2">
					<input type="submit" id="cancel" value="Cancelar"/>
				</td>
			</tr>
	</form>
</body>
</html> 
