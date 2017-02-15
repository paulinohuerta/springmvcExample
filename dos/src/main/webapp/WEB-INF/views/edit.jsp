<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
	<meta charset="utf-8">
	
</head>
<body>
	<h1>Editar contacto:</h1>
	
	<form:form method="POST" action="/editar/" modelAttribute="contactEdit">
		<table>
			<tr>
				<td style="border: solid 1px"><input hidden name="id" value="${contact.id}">
				</input></td>
				<td style="border: solid 1px"><input name="name">
				</input></td>
				<td style="border: solid 1px"><input name="address">
				</input></td>
				<td style="border: solid 1px"><input name="email">
				</input></td>
				<td style="border: solid 1px"><input name="telephone">
				</input></td>
			</tr>
		</table>
		<input type="submit" id="send" value="Aceptar">
		<input type="submit" id="cancel" value="Cancelar">
	</form:form>
</body>
</html> 
