package section_1;

public class InfiniteForLoopUpdate {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i += 2) {
            System.out.println(i);
        }
    }
}

// Error to investigate: Why does the loop print unexpected results or run
// infinitely? How should the loop update expression be corrected ?

//=> loop is fine : it just increamenting by 2 istead of 1
// If you want to increment it by 1 the it can be done by i = i+1 