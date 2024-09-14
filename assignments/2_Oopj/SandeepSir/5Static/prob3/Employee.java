package prob3;

public class Employee {
    
    private int empId;
    private String name;
    private double salary;
    private static int totalEmp;
    private static double totalExpense;

    Employee(){
        Employee.totalEmp =  Employee.totalEmp + 1;
    }

    public static int getTotalEmployee(){
        return Employee.totalEmp;
    }

    public void applyRaise(double percentage){

        this.salary = this.salary + (this.salary * (percentage/100));
    }

    public void updateSalary(double newSalary){
        this.salary = newSalary;
        Employee.totalExpense = (Employee.totalExpense - this.salary) + newSalary; 
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        Employee.totalExpense = Employee.totalExpense + salary;
        this.salary = salary;
    }

    public static int getTotalEmp() {
        return totalEmp;
    }
    
    public static double getTotalExpense() {
        return totalExpense;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
    }



    // public static void setTotalEmp(int totalEmp) {
    //     Employee.totalEmp = totalEmp;
    // }

    // public static void setTotalExpense(float totalExpense) {
    //     Employee.totalExpense = totalExpense;
    // }    

}
