package codez;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;

public class TestEmployee {
    public static void main(String[] args) {
        
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Tejas", 50000f, "HR", 22, "Manager"));
        employees.add(new Employee(2, "Varun", 60000f, "IT", 28, "Developer"));
        employees.add(new Employee(3, "Dipesh", 55000f, "Finance", 35, "Analyst"));
        employees.add(new Employee(4, "Kartikey", 45000f, "IT", 26, "Tester"));
        employees.add(new Employee(5, "Shubham", 70000f, "HR", 32, "Director"));
        employees.add(new Employee(6, "Shrutika", 40000f, "IT", 24, "Intern"));
        employees.add(new Employee(7, "Vishaka", 65000f, "Finance", 29, "Manager"));
        employees.add(new Employee(8, "Suvarna", 75000f, "Marketing", 36, "Director"));
        employees.add(new Employee(9, "Abhishek", 75000f, "Marketing", 36, "Director"));

        System.out.println("Employee Records : ");
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        employees.sort(null);

        System.out.println("\nSorting by EmpSalary :");
        ListIterator<Employee> listIterator = employees.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        employees.sort(Comparator.comparing(Employee::getEmpDept));

        System.out.println("\nSorting by EmpDept : ");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}