<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css" />
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<!-- START HTML BELOW (!!) -->
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Travel Saving</title>
</head>

<body>
    ${expense}
    <h1>Travel Expense Record</h1>
    <h4>Add Expenses</h4>
    <!-- modelAttribute item declared on MainController.jsp  -->
    <form:form action="/expenses/update/${expenses.id}" method="post" modelAttribute="expenses">
        <input type="hidden" name="_method" value="put">
        <p>
            <form:label path="expense">Expense Name:</form:label>
            <form:errors path="expense" />
            <form:input path="expense"></form:input>
        </p>
        <p>
            <form:label path="vendor">Vendor:</form:label>
            <form:errors path="vendor" />
            <form:input path="vendor"></form:input>
        </p>
        <p>
            <form:label path="amount">Amount:</form:label>
            <form:errors path="amount" />
            <form:input path="amount"></form:input>
        </p>
        <p>
            <form:label path="description">Description:</form:label>
            <form:errors path="description" />
            <form:input path="description"></form:input>
        </p>
        <input type="submit" value="Update an Expense">
    </form:form>
</body>

</html>