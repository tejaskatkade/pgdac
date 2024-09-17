
class Employee{
    private String name;
    private int empId;
    private float salary;
    

    Employee(){
        this("unknown", 0, 0.0f);   //Constructor Chaining
    }


    public Employee(String name, int empId, float salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    
	public String getName() {	//Inspector / Selector / Getter method
		return this.name;
	}

	public void setName(String name) {	//Mutator / Setter method
		this.name = name;
	}

	public int getEmpid() {	//Inspector / Selector / Getter method
		return this.empId;
	}

	public void setEmpid(int empId) {	//Mutator / Setter method
		this.empId = empId;
	}

	public float getSalary() {	//Inspector / Selector / Getter method
		return this.salary;
	}

	public void setSalary(float salary) {	//Mutator / Setter method
		this.salary = salary;
	}


    
}

public class Program1{
    public static void main(String[] args) {
        
    }

}