<span style="color:red">WARNING!!</span>
- [ ] Update this file and replace PROJECTFILE with \<ProjectName> before proceeding

# File Updates
- [ ] make the project schema using SQLWorkbench
- [ ] run MavenSetup script
- [ ] update [application.properties](./src/main/resources/application.properties) <<YOUR_SCHEMA_NAME>> from the SQLWorkbench DB schema
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
		<!-- DEPENDENCY FOR PASSWORD ENCRIPTION -->
		<dependency>
			<groupId>org.mindrot</groupId>
			<artifactId>jbcrypt</artifactId>
			<version>0.4</version>
		</dependency>
```
#
# Setting up 
## Controllers --> Services --> Repository
#
- [ ] [MainController.java](./src/main/java/dojo/PROJECTFILE/controllers/MainController.java)
* Should contain your Mapping/Routes .... see below.

```
@Controller
public class MainController {
	// class definition and imports here...
	
	//make connection to SERVICE
	//Autowired should point to XxxxxService xxxxxService 
	//@Autowired 
	
	@GetMapping ("/")
	public String index(Model model) {
		// Your code here! Add values to the view model to be rendered

		return "index.jsp";
	}
}
```
#
- [ ] Test run if website shows index page

## Services
- [ ] XxxxService.java -- located at (src/main/java/dojo/PROJECTFILE/services)
```
@Service
public class XxxxService{
	//Autowired should be pointing to Repository (ex. TravelRepository travelRepository)
    @Autowired     ;
}
```
## Repositories
- [ ] XxxxRepository.java -- located at src/main/java/dojo/PROJECTFILE/repositories
```
public interface TravelRepository extends CrudRepository<Travel, Long> {
    List<Travel> findAll();
}
```


#
## Models (2 layers)
### Persistance Layer

- [ ] create a \<name>.java -  this will populate the DB schema

```html
@Entity
@Table(name="travels")  //should be plural in convention
public class Travel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   
    //!! Add required data from wireframe
        //!! Add required data from wireframe
    
    //add CreatedAt and UpdatedAt if needed
    // This will not allow the createdAt column to be updated after creation
    //@Column(updatable=false)
    //@DateTimeFormat(pattern="yyyy-MM-dd")
    //private Date createdAt;
    //@DateTimeFormat(pattern="yyyy-MM-dd")
    //private Date updatedAt;
    
    //**Generate Empty Constructor**
    //**Generate Constructor using All Fields**
    //**Generate Getters and Setters**
    
    // other getters and setters removed for brevity
    //@PrePersist
    //protected void onCreate(){
    //    this.createdAt = new Date();
    //}
    //@PreUpdate
    //protected void onUpdate(){
    //    this.updatedAt = new Date();
    //}
}
```
- [ ] Create [Model1Repository.java](src/main/java/dojo/PROJECTFILE/repositories/Model1Repository.java)
- [ ] Create [Model2Repository.java](src/main/java/dojo/PROJECTFILE/repositories/Model2Repository.java)

```
    //public interface TravelRepository extends CrudRepository<Travel, Long> {
    //  List<Travel> findAll();
    //}
```

### Service Layer
#### where all the CRUD funtionality/methods are located
- [ ] Create [Model1Service.java](src/main/java/dojo/PROJECTFILE/services/Model1Service.java) 
- [ ] Create [Model2Service.java](src/main/java/dojo/PROJECTFILE/services/Model2Service.java) 
```
    //public class TravelService {
    //@Autowired TravelRepository travelRepository;
	}
```