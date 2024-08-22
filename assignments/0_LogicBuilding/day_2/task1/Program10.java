public class Program10 {
    public void display() {
        System.out.println("No parameters");
    }
    public void display(int num) {
        System.out.println("With parameter: " + num);
    }
    public static void main(String[] args) {
        display();
        display(5);
    }
}
// What happens when you compile and run this code? Is method overloading allowed?
// error: non-static method display() cannot be referenced from a static context
