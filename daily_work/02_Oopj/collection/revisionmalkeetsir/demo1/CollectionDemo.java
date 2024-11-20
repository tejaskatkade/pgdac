package revisionmalkeetsir.demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student>{
    private String name;
    private int rollNo;
    private float fees;

    public Student(){

    }
    
    public Student(int rollNo,String name, float fees) {
        this.name = name;
        this.rollNo = rollNo;
        this.fees = fees;
    }

   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public float getFees() {
        return fees;
    }
    public void setFees(float fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Name : " + name + ", Roll No :" + rollNo;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);

    }    
}

class StudentManager{

    List<Student> list = new ArrayList<>();
    static  Scanner sc = new Scanner(System.in);
    public StudentManager(){
        list.add(new Student(101,"Tejas",75000));
        list.add(new Student(102,"Virat",75000));
        list.add(new Student(103,"Sachin",75000));
        list.add(new Student(104,"Rohit",75000));
    }
    
    void addStudent(){
       
        Student s = new Student();
        System.out.print("Enter Roll Number : ");
        s.setRollNo(sc.nextInt()); 
        sc.nextLine();
        System.out.print("Enter Name : ");
        s.setName(sc.nextLine());
        System.out.print("Enter Fees : ");
        s.setFees(sc.nextFloat());
        list.add(s);
        System.out.println("\nStudent added Successfully");
        
    }
    void updateStudent(){
        System.out.print("Enter the roll Number of studet to be updated  : ");
        int roll = sc.nextInt();
        boolean flag = false;

        for (Student stud : list) {
            if(stud.getRollNo() == roll){
                flag = true;
                System.out.print("Enter Roll Number : ");
                stud.setRollNo(sc.nextInt()); 
                sc.nextLine();
                System.out.print("Enter Name : ");
                stud.setName(sc.nextLine());
                System.out.print("Enter Fees : ");
                stud.setFees(sc.nextFloat());
                list.add(stud);
                System.out.println("\nStudent Updated Successfully");
                break;
            }
        }
        if(flag == false){
            System.out.println("Student Not found");
        }

    }
    void deleteStudent(){
        System.out.print("Enter the roll Number of studet to Delete  : ");
        int roll = sc.nextInt();
        boolean flag = false;

        for (Student stud : list) {
            if(stud.getRollNo() == roll){
                flag = true;
                list.remove(stud);
                break;
            }
        }
        if(flag == false){
            System.out.println("Student Not found");
        }

    }
    void getStudents(){
        list.forEach(e->System.out.println(e));
    }

    static public void closeResource(){
        sc.close();
    }
    public static int menuList(){
        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Update Student");
        System.out.println("4. View Student According Roll No");
        System.out.println("5. View Student According Name");
        System.out.println("6. Delete Student");
        System.out.println("7. Exit");

        System.out.print("Enter choice : ");
        return sc.nextInt();
    }

    public void getStudentsByRoll() {
        Collections.sort(list);
        getStudents();
    }

    public void getStudentsByName() {
        //Collections.sort(null, null);
    }
}
public class CollectionDemo {
    public static void main(String[] args) {
       StudentManager sm = new StudentManager();
        while (true) {
            int choice = StudentManager.menuList();

            switch (choice) {
                case 1:
                    sm.addStudent();
                    break;
                case 2:
                    sm.getStudents();
                    break;
                case 3:
                    sm.updateStudent();
                    break;
                case 4:
                    sm.deleteStudent();
                    break;
                case 5:
                    sm.getStudentsByRoll();
                    break;
                case 6:
                    sm.getStudentsByName();
                    break;
                case 7:
                    System.out.println("Ending the Program");
                    return;
                default:
                    break;
            }
       }
    }
}
