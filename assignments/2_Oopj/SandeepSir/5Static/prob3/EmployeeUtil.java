package prob3;

import java.util.ArrayList;
import java.util.Scanner;
public class EmployeeUtil {

    private static ArrayList<Employee> list = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void applyRaise(){
        System.out.println("Enter raise percentage : ");
        double percentage = sc.nextDouble();
        list.stream().forEach(e->e.applyRaise(percentage));
    }

    public static void addEmployee(){
        Employee emp = new Employee();
        
        System.out.println("*** Enter Employee Details ***");
        System.out.print("Name :  ");
        sc.nextLine();
        emp.setName(sc.nextLine());
        System.out.print("Id :  ");
        emp.setEmpId(sc.nextInt());
        System.out.print("Salary :  ");
        emp.setSalary(sc.nextDouble());
        System.out.println(emp);
        list.add(emp);

    }

    public static void removeEmployee(){
        System.out.print("Enter Employee id : ");
        int id = sc.nextInt();
        Employee emp = list.stream().filter(e->e.getEmpId() == id).findFirst().orElse(null);
    
        if(emp == null){
            System.out.println("Employee With id : "+id+" not found ...!");
        }else{
            if(list.remove(emp)){
                System.out.println("Employee With id : "+id+" Deleted sucessfully");
            }else{
                System.out.println("Employee With id : "+id+" Not Deleted");
            }
        }
    }

    public static void printEmployeeDetails(){
        System.out.print("Enter Employee id : ");
        int id = sc.nextInt();
        Employee emp = list.stream().filter(e->e.getEmpId() == id).findFirst().orElse(null);

        if(emp == null){
            System.out.println("Employee With id : "+id+" not found ...!");
        }else{
            //System.out.println("Employee :");
            System.out.println(emp.toString());
        }
    }

    public static void printTotalExpenses(){
        System.out.println("Total Salary Expenses is : "+ Employee.getTotalExpense());
    }

    public static void printTotalEmployee(){
        System.out.println("Total Employee count is : "+Employee.getTotalEmployee());
    }



    public static int menulist(){
        System.out.println("0. Exit");
        System.out.println("1. Add Employee");
        System.out.println("2. Remove Employee");
        System.out.println("3. Print Employee Details");
        System.out.println("4. Add Raise");
        System.out.println("5. Print Total Expences");
        System.out.println("6. Print Total Number of Employees");
        System.out.println("Select Options");
        return sc.nextInt();
    }

    public static void releseResource(){
        sc.close();
    }
    

}
