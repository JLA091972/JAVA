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
    <h1>${book.title}</h1>
    <button onclick="location.href='/books'" class="btn btn-primary btn-sm">Back to the shelves</button>

    <c:choose>
        <c:when test="${book.user.id == userId}">
            <h5>You read ${book.title} by ${book.author}</h5>
            <h6> Here are your thoughts</h6>
        </c:when>
        <c:otherwise>
            <h5>${book.user.userName} read ${book.title} by ${book.author}</h5>
            <h6> Here are ${book.user.userName}'s thoughts</h6>
        </c:otherwise>
    </c:choose>

    <p> ${book.thoughts}</p>

    <c:if test="${book.user.id == userId}">
        <a href="/books/${book.id}/edit"> Edit </a>
        <form action="/books/${book.id}" method="post">
            <input type="hidden" name="_method" value="delete">
            <input type="submit" value="Delete">
        </form>
    </c:if>

</body>

</html>