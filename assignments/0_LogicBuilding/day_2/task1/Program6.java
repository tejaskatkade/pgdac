// public class Program6 {
//     public static void main(String[] args) {
//         int x = y + 10;
//         System.out.println(x);
//     }
// }

// What error occurs? Why must variables be declared?


// error: cannot find symbol
//         int x = y + 10;
//                 ^
//   symbol:   variable y
//   location: class Program6
// 1 error

public class Program6 {
    public static void main(String[] args) {
        int y = 0;
        int x = y + 10;
        System.out.println(x);
    }
}