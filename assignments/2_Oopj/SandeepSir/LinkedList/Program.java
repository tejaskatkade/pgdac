
import java.util.Scanner;
public class Program{

    public static void main(String[] args) {
        LL list = new LL();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter choice");
            System.out.println("1. Add at first");
            System.out.println("2. Add at last");
            System.out.println("3. Add at position");
            System.out.println("4. Delete first");
            System.out.println("5. Delete last");
            System.out.println("6. Delete at position");
            System.out.println("7. Print Node");
            System.out.println("8. Print Length");
            System.out.println("9. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    {
                        System.out.println("Enter data");
                        int data = sc.nextInt();
                        list.addFirst(data);
                        list.printNode();
                    }
                    break;
                case 2:
                    {
                        System.out.println("Enter data");
                        int data = sc.nextInt();
                        list.addLast(data);
                        list.printNode();
                    }
                    break;
                case 3:
                    {
                        System.out.println("Enter data");
                        int data = sc.nextInt();
                        System.out.println("Enter position");
                        int pos = sc.nextInt();
                        list.addAtPosition(data, pos);
                        list.printNode();
                    }
                    break;
                case 4:
                    list.deleteFirst();
                    list.printNode();
                    break;
                case 5:
                    list.deleteLast();
                    list.printNode();
                    break;
                case 6:
                    {
                        System.out.println("Enter position");
                        int pos = sc.nextInt();
                        list.deleteAtPosition(pos);
                        list.printNode();
                    }
                    break;
                case 7:
                    list.printNode();
                    break;
                case 8:
                    int length = list.length();
                    System.out.println(length);
                    list.printNode();
                    break;
                case 9:
                    System.exit(0);
                    break;
            
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
