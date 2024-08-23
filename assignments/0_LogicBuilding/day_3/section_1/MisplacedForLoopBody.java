package section_1;

public class MisplacedForLoopBody {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
            System.out.println(i);
        System.out.println("Done");
    }
}

// Error to investigate: Why does "Done" print only once, outside the loop? How
// should the loop body be enclosed to include all statements within the loop ?


// =>
// In this code for loop does not have given any curly braces so it will consider only the next line as his body
// Therfore, Done prints only once as it is not the part of the for loop 