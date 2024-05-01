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

Defining Beans (Java)
```
@Configuration
public class AppConfig {


    @Bean
    public SomeObject method() {
        return new SomeObject();
    }
}
```

Defining Beans (XML)
```
AppConfig.java

@Configuration
@ImportResource("app-config.xml")
public class AppConfig {
...
}


app-config.xml

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
	xmlns:context="http://www.springframework.org/schema/context"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        http://www.springframework.org/schema/context/spring-context.xsd">


	<bean id="choose a name for the bean" class="path to class"> </bean>
	<bean id="choose a name for the bean" class="path to class"> </bean>
</beans>
```



