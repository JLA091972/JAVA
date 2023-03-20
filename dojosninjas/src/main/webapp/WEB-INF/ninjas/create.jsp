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
    <title>Ninjas</title>
</head>

<body>
    <h1>Add a Ninja!</h1>

    <form:form action="/ninjas" method="post" modelAttribute="ninja" >
        <form:select path="dojo" >
            <c:forEach var="dojo" items="${dojos}">
                <form:option value="${dojo.id}">${dojo.name}</form:option>
            </c:forEach>
            
        </form:select>
        <form:label path="firstname">Ninja First Name</form:label>
        <form:input path="firstname"></form:input>

        <form:label path="lastname">Ninja Last Name</form:label>
        <form:input path="lastname"></form:input>

        <form:label path="age">Ninja Age</form:label>
        <form:input path="age"></form:input>

        <input type="submit" value="Add Ninja">
    </form:form>

</body>

</html>