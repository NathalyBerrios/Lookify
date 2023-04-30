<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="d-flex justify-content-between align-items-center">
			<a href="/songs/new" class="btn btn-success">Agregar Canciones</a>
			<a href="/search/topTen" class="btn btn-primary">Top canciones</a>
			<input type="search" name="Artista">
			<input type="submit" value="Buscar" class="btn btn-danger">
		</div>
		<div>
			<table class="table table-hover">
				<thead>
					<tr>
						<th>Cancion</th>
						<th>Calificacion</th>
						<th>Acciones</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${lista}" var="lista">
						<tr>
							<td>${lista.titulo}</td>
							<td>${lista.clasificacion}</td>
							<td>
								<a href="/borrar">Borrar</a>
								<a href="/mostrar/${lista.id}">titulo</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>