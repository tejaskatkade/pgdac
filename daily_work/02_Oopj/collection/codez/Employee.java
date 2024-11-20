package codez;
public class Employee implements Comparable<Employee> {
    private int empId;
    private String empName;
    private float empSalary;
    private String empDept;
    private int empAge;
    private String empDesig;

   
    public Employee(){

    }
    public Employee(int empId, String empName, float empSalary, String empDept, int empAge, String empDesig) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empDept = empDept;
        this.empAge = empAge;
        this.empDesig = empDesig;
    }

   
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public float getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(float empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public String getEmpDesig() {
        return empDesig;
    }

    public void setEmpDesig(String empDesig) {
        this.empDesig = empDesig;
    }

    

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empDept=" + empDept
                + ", empAge=" + empAge + ", empDesig=" + empDesig + "]";
    }
    
    @Override
    public int compareTo(Employee other) {
        return Float.compare(this.empSalary, other.empSalary);
    }
}
