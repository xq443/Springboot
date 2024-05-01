### Unit Testing


```
@RunWith(MockitoJUnitRunner.class)
public class GradeServiceTest {




    @Mock
    private Dependency dependency;


    @InjectMocks
    private Service service;


}

```

- @RunWith(MockitoJUnitRunner.class): class-level annotation where the target class can run tests.
- @Mock: mocks a dependency.
- @InjectMocks: creates an object and injects every mock into it.
- @Test: method-level annotation that can run a test.

```

    @Test
    public void someUnitTest() {


        //1. Arrange: prepare the data needed to carry out the test.
        when(dependency.method()).thenReturn(someData); 


        //2. Act: call the method you want to test.
        Type result = service.method()


	//3. Assert: verify that the method is behaving correctly.
        assertEquals(expect, result);
        verify(mock, times(number of invokations)).method()
    }
```


### Integration Testing


```
@SpringBootTest //starts up application context
@AutoConfigureMockMvc  // Configures the Mockmvc Bean
class TestClass {


    @Autowired
    private MockMvc mockMvc;


    @Test 
    public void test() throws Exception {


    // 1. Create request.


    RequestBuilder getRequest = MockMvcRequestBuilders.get("/path");
    RequestBuilder postRequest = MockMvcRequestBuilders.post("/path");


    // 2. Perform Request.


    mockMvc.perform(getRequest)


    mockMvc.perform(postRequest)
      .param(param, value)
      .param(param, value)
      .param(param, value)
      .param(param, value)


    // 3. Verify status, view, model, etc...


      .andExpect(status().isxxxSuccessful())


      .andExpect(view().name("view"))


      .andExpect(model().attributeExists("modelAttribute"));


      .andExpect(redirectedUrl("/path"));
    }

}
```



