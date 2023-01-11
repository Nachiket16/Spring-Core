# Notes

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