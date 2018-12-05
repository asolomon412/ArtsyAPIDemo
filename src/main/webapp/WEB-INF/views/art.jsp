<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/sketchy/bootstrap.min.css" />
</head>
<body>
	<!-- This is an include directive and allows us to reuse other files in our pages so we don't have to duplicate code -->
	<%-- <%@ include file="partials/header.jsp"%> --%>

	<!-- <a class="btn btn-primary" href="/next-results">Next</a> -->

	<table class="table">
		<thead>
			<tr>
				<!-- <th>ID</th> -->
				<th>Title</th>
				<th>Medium</th>
				<th>Date</th>
				<!-- <th>Location</th> -->
				<th>Height</th>
				<th>Width</th>			
				<th>Image</th>
			</tr>

		</thead>
		<c:forEach var="a" items="${art }">
			<tbody>
				<tr>
					<%-- <td>${a.id }</td> --%>
					<td>${a.title }</td>
					<td>${a.medium }</td>
					<td>${a.date }</td>
					<%-- <td>${a.location}</td> --%>
					<td>${a.dimensions.in.height }</td>
					<td>${a.dimensions.in.width }</td>
					<td><img src="${a.links.image.img}"></td>

				</tr>

			</tbody>


		</c:forEach>
	</table>

	<img alt="" src="">
</body>
</html>