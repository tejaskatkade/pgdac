import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Select shape number");

            System.out.println("1. Circle \n2. Square\n3. Rectangle\n4. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1: // circle
                {
                    System.out.println("Enter the size of radius");
                    int r = sc.nextInt();
                    float A = (float) (3.142 * r * r);
                    System.out.println("Area of circle is :" + A);

                }
                    break;
                case 2: // square
                {
                    System.out.println("Enter the size of side");
                    int s = sc.nextInt();
                    int A = s * s;
                    System.out.println("Area of circle is :" + A);
                }

                    break;
                case 3: // rectangle
                {
                    System.out.println("Enter the lenght");
                    int l = sc.nextInt();
                    System.out.println("Enter the size of width");
                    int w = sc.nextInt();
                    int A = l * w;
                    System.out.println("Area of circle is :" + A);
                }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }
    }
}
