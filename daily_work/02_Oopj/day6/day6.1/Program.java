class Employee{
    private String name;
    private int empId;
    private String departmnet;
    private String designation;
    private String salary;
    
    public Employee() {
    
    }

    public Employee(String name, int empId, String departmnet, String designation, String salary) {
        this.name = name;
        this.empId = empId;
        this.departmnet = departmnet;
        this.designation = designation;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", empId=" + empId + ", departmnet=" + departmnet + ", designation="
                + designation + ", salary=" + salary + "]";
    }

    
    String str1 = String.format(){

    }
    // public String getString(){
    //     return this.name +" "+this.empId+" "+this.departmnet+" "+this.designation;
    // }



    



    

}

public class Program{
    public static void main(String[] args) {
        Employee employee = new Employee();
        // String str = employee.getString();
        String str = employee.toString();
        System.out.println(str);
        System.out.println(employee);
    }
}