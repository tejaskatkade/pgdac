package section_1;

public class WrongInitializationForLoop {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i++) {
            System.out.println(i);
        }
    }
}
// Error to investigate: Why does this loop not print numbers in the expected
// order? What is the problem with the
// initialization and update statements in the `for` loop?

// =>
// The loop goes in infinite loop
// Intead of incrementing i we need to decrement it
