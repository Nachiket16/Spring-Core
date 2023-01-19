# Notes For Spring Framework

>### We have to provoide 3 things to the spring.
>* #### 1 About the Beans
  >>* @Component -> will create the bean
>* #### 2 About the Dependencies
 >>* @Autowired -> will tell which component is dependent.
>* #### 3 Where to search the Beans (Pkg location)
 >>* @SpringBootApplication by default will scan the pkg and subPkg.
 >>* @ComponentScan(basePackages = {"",""})
 >>* This call other pkg as per the requirement

>### Bean: 
> When the Object is managed by the spring boot it is called as the bean.
>

>### @Component
> This will make the class as the Bean / Component
> 
> So Object will be created by the Spring framework

@Primary
@Qualifier


___ 

### When To Use which Autowired Injection ?     
1- Constructor Based Autowired      
    - When dependency are mandatory in that case use Constructor based autowired.   
2- Setter Based Autowired   
    - For Optional dependency use the Setter based Autowired.      
3- Field Based Autowired    
    - For Optional dependency.


### Scope of the Bean

**Singleton:** Only one instance of the spring bean will be created for the spring container.              
By Default scope is singleton.

**Prototype:** New instance will be created every time the bean is requested from the spring container.

**Request Scope:** New Instance of the bean will be created for each HTTP request.                      
available for the Web Application.
                
**Session Scope:** A new bean will be created for each HTTP session by the container.       

**Application:** The application scope created the bean instance for the lifecycle of a ServletContext.

**WebSocket:** WebSocket scoped beans are stored in teh WebSocket session attributes.

---
### When you Declare the bean for the context you will get singleton object. You can do this by using the @Scope("singleton") annotation as well.
> BY DEFAULT SCOPE IS ->SINGLETON
        
@Scope("singleton") -> Same Hash Code
@Scope("prototype") -> Diff Hash Code
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)