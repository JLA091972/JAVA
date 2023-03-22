<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<!-- START HTML BELOW (!!) -->

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <h1>${product.name}</h1>
    <p><a href="/">Home</a></p>
    <hr>

    <h3>Categories:</h3>
    <ul>
        <c:forEach var="category" items="${assignedCategories}">
            <li>
                <c:out value="${category.name}"></c:out>
            </li>
        </c:forEach>
    </ul>
    <hr>
    <form action="/products/${id}" method="post">
        <h4>Add Category:</h4>
        <select name="categoryId" id="categoryId" class="input">
            <c:forEach var="category" items="${unassignedCategories}">
                <option value="${category.id}">${category.name}</option>
            </c:forEach>
        </select>
        <input class="input" class="button" type="submit" value="Add" />
    </form>
</body>

</html>