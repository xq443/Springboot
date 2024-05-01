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

