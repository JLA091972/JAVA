# Books Demo


- [ ] update [application.properties](./src/main/resources/application.properties)

```
# Where are jsp files? HERE!
spring.mvc.view.prefix=/WEB-INF/
# Data Persistence
spring.datasource.url=jdbc:mysql://localhost:3306/<<YOUR_SCHEMA_NAME>>
spring.datasource.username=root
spring.datasource.password=<<root or rootroot>>
spring.jpa.hibernate.ddl-auto=update
# For Update and Delete method hidden inputs
spring.mvc.hiddenmethod.filter.enabled=true
```



- [ ] add dependencies to [pom.xml](./pom.xml)

```xml
        <!-- DEPENDENCIES FOR DISPLAYING JSPS AND USING JSTL TAGS -->
        <dependency>
            <groupId>org.apache.tomcat.embed</groupId>
            <artifactId>tomcat-embed-jasper</artifactId>
        </dependency>
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>jstl</artifactId>
        </dependency>

		<!-- DEPENDENCIES FOR BOOTSTRAP -->
        <dependency>
            <groupId>org.webjars</groupId>
            <artifactId>webjars-locator</artifactId>
            <version>0.46</version>
        </dependency>
        <dependency>
            <groupId>org.webjars</groupId>
            <artifactId>bootstrap</artifactId>
            <version>5.2.3</version>
        </dependency>
```
#
## Views
- [ ] add a view for show all [index.jsp](./src/main/webapp/WEB-INF/index.jsp)

```html
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
    <h1>HELLO!!</h1>
</body>

</html>

```

- [ ] add a view for show one [show.jsp](./src/main/webapp/WEB-INF/show.jsp)
- [ ] add a view for New [new.jsp](./src/main/webapp/WEB-INF/new.jsp)
- [ ] add a view for Update [update.jsp](./src/main/webapp/WEB-INF/update.jsp)
- [ ] add a view for Edit [update.jsp](./src/main/webapp/WEB-INF/edit.jsp)



- [ ] add CSS file [main.css](.\src\main\resources\static\css\main.css)

#
## Controllers
- [ ] Make our [MainController](./src/main/java/dojo/booksapi/controllers/MainController.java). :warning:<span style="color:red">WARNING!!</span> :warning: This link won't work in your file!!!

```java
@Controller
public class MainController {

    //! READ ALL
    @GetMapping("/")
    public String index(){
        return "index.jsp";
    }
}
    
```
#
## Models (2 layers)
### persistance layer

- [ ] Create [Book.java](src/main/java/dojo/booksapi/models/Book.java)

- [ ] Create [BookRepository.java](src/main/java/dojo/booksapi/repositories/BookRepository.java) i.e. the ORM - object relational mapper

### service layer

- [ ] Create [BookService.java](src/main/java/dojo/booksapi/services/BookService.java) 