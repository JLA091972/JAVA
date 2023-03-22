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
    <title>Home</title>
</head>

<body>
    <h1>Home Page</h1>
    <p><a href="/products/new">New Product</a></p>
    <p><a href="/categories/new">New Category</a></p>
    <hr>
    <table>
        <thead>
            <tr>
                <th class="proddisplay">Products</th>
                <th class="catdisplay">Categories</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>
                    <ul class="proddisplay">
                        <c:forEach var="product" items="${products}">
                            <li>
                                <a href="products/${product.id}">${product.name}</a>
                            </li>
                        </c:forEach>
                    </ul>
                </td>
                <td>
                    <ul class="catdisplay">
                        <c:forEach var="category" items="${categories}">
                            <li>
                                <a href="categories/${category.id}">${category.name} </a>
                            </li>
                        </c:forEach>
                    </ul>
                </td>
            </tr>
        </tbody>
    </table>

</body>

</html>