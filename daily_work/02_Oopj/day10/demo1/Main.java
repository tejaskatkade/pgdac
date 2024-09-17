package day10.demo1;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person(); // ok    // super

        person1.getName();
        person1.getAge();

        //person1.getEmpId(); //not ok
        //The method getEmpId() is undefined for the type Person


        
        Employee employee1 = new Employee(); // ok

        employee1.getEmpId();
        employee1.getSalary();
        employee1.getAge();
        employee1.getSalary();


        
        Person person2 = new Employee(); // ok

       // person2.getEmpId(); // Not OK
       // The method getEmpId() is undefined for the type Person



        
        //Employee employee2 = new Person(); // Not ok


       
       


        


    }
}
