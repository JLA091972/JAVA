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
<link rel="stylesheet" href="main.css" />
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>


<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <h1> Send an Omikuji!</h1>

    <div class="container">
        <form action="/omikuji" method="POST">
            <div class="col-sm-3">
                <label for="number">Enter a number</label>
                <input type="number" name="number"><br/>
            </div>
            <div class="col-sm-5" >
                <label for="city">Enter the name of a city</label>
                <input type="text" class="form-control form-control-sm" name="city">
            </div>
            <div class="col-sm-5">
                <label for="person">Enter a persons name</label>
                <input type="text" class="form-control form-control-sm" name="person">
            </div>
            <div class="col-sm-5">
                <label for="hobby">Enter professional endeavor or hobby</label>
                <input type="text" class="form-control form-control-sm" name="hobby">
            </div>
            <div class="col-sm-5">                
                <label for="livingthing">Enter any type of living thing</label>
                <input type="text" class="form-control form-control-sm" name="livingthing">
            </div>
                <label for="comment">Say something nice to someone</label><br/>
                <p><textarea name="comment" id="" cols="50" rows="5"></textarea></p>
                <p> Send and show a friend </p>
            <button type="submit" class="btn btn-primary">Send</button>
        </form>
    </div>
    </div>
</body>

</html>