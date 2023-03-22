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
    <div class="container">
    
        <h1>Welcome to the Book Club!</h1>
    
        <h2>Register</h2>
    
        <div class="container">
            <form:form action="/register" modelAttribute="newUser" class="form">
    
                <div class="form-row">
                    <form:errors path="userName" />
                    <form:label for="userName" path="userName">User Name:</form:label>
                    <form:input type="text" path="userName" class="form-control" />
                </div>
    
                <div class="form-row">
                    <form:errors path="email" />
                    <form:label for="email" path="email">Email:</form:label>
                    <form:input type="text" path="email" class="form-control" />
                </div>
    
                <div class="form-row">
                    <form:errors path="password" />
                    <form:label for="password" path="password">Password:</form:label>
                    <form:input type="text" path="password" class="form-control" />
                </div>
    
                <div class="form-row">
                    <form:errors path="confirm" />
                    <form:label for="" path="confirm">Confirm:</form:label>
                    <form:input type="text" path="confirm" class="form-control" />
                </div>
    
                <div class="form-row">
                    <input type="submit" value="Submit" class="btn-primary" />
                </div>
    
            </form:form>
        </div>
    
        <h2>Log In</h2>
    
        <div class="container">
            <form:form action="/login" modelAttribute="newLogin" class="form">
                <div class="form-row">
                    <form:errors path="email" />
                    <form:label for="email" path="email">Email:</form:label>
                    <form:input type="text" path="email" class="form-control" />
                </div>
    
                <div>
                    <form:errors path="password" />
                    <form:label for="password" path="password">Password:</form:label>
                    <form:input type="text" path="password" class="form-control" />
                </div>
    
                <div class="form-row">
                    <input type="submit" value="Submit" class="btn-primary" />
                </div>
    
            </form:form>
        </div>
    
    </div>

</body>

</html>