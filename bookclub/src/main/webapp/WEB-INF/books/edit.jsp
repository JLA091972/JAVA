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
    ${book}
    <h1>Change Your Entry</h1>
    <button onclick="location.href='/books'" class="btn btn-primary btn-sm">Back to the shelves</button>
    <form:form action="/books/${book.id}/update" method="post" modelAttribute="book">
        <input type="hidden" name = "_method" value="put" />
        <form:input type="hidden" path="user" value="${book.user.id}"></form:input>
        <p>
            <form:label path="title">Book Title</form:label>
            <form:input path="title"></form:input>
            <form:errors path="title" class="text-danger" />
        </p>
        <p>
            <form:label path="author">Book Author</form:label>
            <form:input path="author"></form:input>
            <form:errors path="author" class="text-danger" />
        </p>
        <p>
            <form:label path="thoughts">What are your thoughts?</form:label>
            <form:input path="thoughts"></form:input>
            <form:errors path="thoughts" class="text-danger" />
        </p>
        <input type="submit" value="Submit">
    </form:form>

</body>

</html>