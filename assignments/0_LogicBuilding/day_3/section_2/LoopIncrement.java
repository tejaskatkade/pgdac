package section_2;

public class LoopIncrement {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
        count += i++ - ++i;
    }
    System.out.println(count);
    }
}

