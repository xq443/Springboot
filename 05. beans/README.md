### Bean
an object that lives inside the Spring container(ApplicationContext)

### How a bean is created
- step 1: A @Component class is automatically discovered by Spring
- step 2: Spring creates an object out of each @Component class that it finds
- step 3: A spring container called Applciation Context stores and manages the object.

```
@SpringBootApplication -> @ComponentScan
                          @Configuraion
                          @EnableAutoConfiguration
public class Application {
  Application.run();
}
```
### Dependency injection
- create an object inside of a class that depends on it -> tight coupling, and it makes unit testing impossible.
- Instead, you should inject the object into the class to achieve loose coupling.
- An object that another class depends on is called a dependency.
- In this example, a great controller relies on the great service dependency, but you should never create a dependency inside of its dependent class.
- The code will become interconnected and impossible to unit test.
