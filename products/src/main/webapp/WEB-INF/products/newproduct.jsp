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
    <title>Create Product</title>
</head>

<body>
    <h1>Add a New Product</h1>


    <button onclick="location.href='/menu'" >Home</button>
    <form:form action="/addproduct" method="post" modelAttribute="product">
        ${session}
        <p>
            <form:label path="productname">Product Name</form:label>
            <form:input path="productname"></form:input>
            <form:errors path="productname" class="text-danger" />
        </p>
        <p>
            <form:label path="productdescription">Product Description</form:label>
            <form:input path="productdescription"></form:input>
            <form:errors path="productdescription" class="text-danger" />
        </p>
        <p>
            <form:label path="price">Price</form:label>
            <form:input path="price"></form:input>
            <form:errors path="price" class="text-danger" />
        </p>
        <input class="btn btn-primary btn-sm" type="submit" value="Submit">
    </form:form>
</body>

</html>