<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Fruit Store</h1>
    <div >
        <table class="table ">
            <tr>
                <th>Name</th>
                <th>Fruit Price</th>
            </tr>
            <tr>
                <td>
                    <c:forEach var="eachFruit" items="${Fruits}">
                        <p><c:out value ="${eachFruit.name}"></c:out></p>
                    </c:forEach>
                </td>
                <td>
                    <c:forEach var="eachFruit" items="${Fruits}">
                        <p><c:out value ="${eachFruit.price}"></c:out></p>
                    </c:forEach>
                </td>
            </tr>
        </table>
    </div>
</body>
</html>