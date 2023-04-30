<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add song</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container">
		<form:form action="/new" method="post" modelAttribute="lista"><!-- model crea el objeto segun lo que el usuario este indicando -->
			<h1>Agregar Cancion</h1>
			<div>
				<form:label path="titulo">Titulo</form:label>
				<form:input path="titulo" class="form-control"/>
				<form:errors path="titulo" class="text-danger"></form:errors>
			</div>
			<div>
				<form:label path="artista">Artista</form:label>
				<form:input path="artista" class="form-control"/>
				<form:errors path="artista" class="text-danger"></form:errors>
			</div>
			<div>
				<form:label path="clasificacion">Clasificacion</form:label>
				<form:input path="clasificacion" class="form-control"/>
				<form:errors path="clasificacion" class="text-danger"></form:errors>
			</div>
			
			<input type="submit" value="Añadir cancion" class="btn btn-success">
		</form:form>
	</div>
</body>
</html>