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
- As the @SpringBootApplication performs a @ComponentScan, a bean is created from classes marked with @Component.
- @Controller, @Service and @Repository derive from @Component.
- @Configuration: marks a class as a source for bean definitions.
- @Bean: method-level annotation for bean definitions.
- @Autowired injects the bean where it's needed.


