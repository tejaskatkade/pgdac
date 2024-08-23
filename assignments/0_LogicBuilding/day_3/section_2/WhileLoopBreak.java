package section_2;

public class WhileLoopBreak {
    public static void main(String[] args) {
        int count = 0;
        while (count < 5) {
            System.out.print(count + " ");
            count++;
            if (count == 3)
                break;
        }
        System.out.println(count);
    }
}
