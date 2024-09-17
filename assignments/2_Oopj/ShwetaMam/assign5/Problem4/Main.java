package assign5.Problem4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.print("Name   : ");
        student.setName(sc.nextLine());
        System.out.print("Roll Num   : ");
        student.setRollNum(sc.nextInt());
        sc.nextLine();
        System.out.print("Address   : ");
        student.setAddress(sc.nextLine());

        System.out.println(student);

        Student student2 = new Student(102, "Virat Kohli","Mumbai");
        System.out.println(student2);

        sc.close();
    }
}
