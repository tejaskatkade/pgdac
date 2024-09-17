package day10.demo1;

public class Employee extends Person { 
    private int empId;
    private float salary;

    Employee(){

    }

    public int getEmpId(){
        return this.empId;
    }

    public void setEmpId(int empId){
        this.empId = empId;
    }

    public float getSalary(){
        return this.salary;
    }

    public void setSalary(float salary){
         this.salary = salary;
    }   
    
}
