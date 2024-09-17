demo 
 1. sub class
 2. Normal inner class
 3. Anonymous Inner class
 4. Lambda expression
 5. method with return type
 6. method with return type and one parameter
 7. method with return type and two parameter
 -------------------------------------------------------------------
                    Functional Interfaces:

 8. Interface Predicate<T>      (java.util.function)
        Type Parameters: T - the type of the input to the predicate

    Abstract Method : boolean	test(T t)
 
 9. Interface Consumer<T>       (java.util.function)
            Type Parameters: T - the type of the input to the operation
    Abstract Method : void	accept(T t)
10. Interface Supplier<T>       (java.util.function)    
            Type Parameters :  T - the type of results supplied by this supplier
    Abstract Method ; T	get();
11. Interface Function<T,R>
            Type Parameters:   T - the type of the input to the function
                               R - the type of the result of the function
    Abstract Method : R	apply(T t)
12. Behaviour Parameterization : the ability of a method to receive multiple
                    different behavior as its parameter and use them internally to
                    accomplish the task
13. Method Reference :
                        - Using static method
                        - Using non static method
    -> here :: (colon colon operator) is used 
    -> As the existing method is present with required logic then we can use method
       reference
14. Method reference :   Example 

                       interface BiFunction<T,U,R>     
                       Abstract Method : R apply(T t, U u);
    Required Logic : Integer.sum(); method 

15.

/***
 * 
 * To implement functional interface we can use 
 *  1.  Implement that interface by class
 *  2.  Simple Inner class
 *  3.  Anonymous Inner Class
 *  4.  Lambda function
 *  5.  Method reference         (function pointer in c)
 *  6. 
 */ 


Lambda expression :
    steps :
        1. Interface_Name 
        2. Interface_Name  refernce = 
        3. Interface_Name  refernce = () -> {};
        4. Interface_Name  refernce = (parameters) -> {};
            if the functional method has parameter
        5. Interface_Name  refernce = (parameters) -> { adding body & return if required};
        6.  remove the curly braces and if removed the remove word return