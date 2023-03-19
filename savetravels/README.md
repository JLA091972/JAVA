# File Updates
- [ ] update [application.properties](./src/main/resources/application.properties)

```
# Where are jsp files? HERE!
spring.mvc.view.prefix=/WEB-INF/
# Data Persistence
spring.datasource.url=jdbc:mysql://localhost:3306/<<YOUR_SCHEMA_NAME>>
spring.datasource.username=root
spring.datasource.password=root  #use rootroot if using MAC
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
		<!-- DEPENDENCY FOR USING VALIDATION ANNOTATIONS -->
		<dependency>
			<groupId>javax.validation</groupId>
			<artifactId>validation-api</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-validation</artifactId>
		</dependency>


```
#
# Needed files to Create

- [ ] add [index.jsp](./src/main/webapp/WEB-INF/index.jsp)
- [ ] add a view for show one [show.jsp](./src/main/webapp/WEB-INF/show.jsp)
- [ ] add a view for create [new.jsp](./src/main/webapp/WEB-INF/new.jsp)
- [ ] add a view for update [edit.jsp](./src/main/webapp/WEB-INF/edit.jsp)

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

```
#

```

- [ ] make the schema.


```
#

## Controllers

<span style="color:red">WARNING!!</span> Update ProjectFileName before clicking!<br/>
 Create a MainController.java file at ./src/main/java/dojo/<span style="color:red">**_ProjectFileName_**</span>/controllers/MainController.java
- [ ] Make our [MainController](./src/main/java/dojo/savetravels/controllers/MainController.java). 

- Inside should contain your Mapping/Routes .... see below.
- Add @Controller after package...
- ALT-SHIFT-O  --> import anything needed

```java
// class definition and imports here...
    //@RequestMapping("/")
    @GetMapping ("/")
    public String index(Model model) {
    	// Your code here! Add values to the view model to be rendered

        return "index.jsp";
    }

```
#

# Models (2 layers)
### 1 - PERSISTANCE layer
### 1 - PERSISTANCE layer
<span style="color:red">WARNING!!</span> Update Foldername and Model/Model2 before clicking!<br/>
- [ ] Created [Model1.java](src/main/java/dojo/FolderName/models/Model1.java)
- [ ] Created [Model2.java](src/main/java/dojo/FolderName/models/Ninja.java)

<span style="color:red">WARNING!!</span> Update Table Name and classname <br/>
@Entity <br/>
@Table(name="travels")
public class Travel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    
	//!! Add required data from wireframe
	
	//Generate Empty Constructor
	//Generate Constructor using All Fields
	//Generate Get and Set
..
}

### 2 - SERVICE layer

- [ ] Create [TravelService.java](src/main/java/dojo/savetravels/services/TravelService.java) 
