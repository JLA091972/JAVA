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
    <title>Show the Omikuji </title>
</head>
<body>
    <h1>Showing Your Omikuji &#129376</h1>
    <div class="displaybox">
        <p>
            In ${number} years &#8987 you will live in ${city} &#127751 with ${person} as your room mate,
            doing ${hobby} for a living.  The next time you see a ${livingthing}, you will have good luck &#127808.
            Also, ${comment} 
        </p>
        <p style="font-size:48px">
            &#128516; 
        </p>
        
        </div>
    <button onclick="location.href='/'"  class="btn btn-primary">Omikuji</button>
    </body>
    
    </html>