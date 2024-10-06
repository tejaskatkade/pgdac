package demo2;

public class Main {

    static StringBuffer reverse(StringBuffer str) {
        int n = str.length();
        StackDemo s = new StackDemo();

        for(int i=0; i<n; i++) {
            s.push(str.charAt(i)); 
        }

        for (int i = 0; i < n; i++) {
            char ch = (char)s.pop();
            str.setCharAt(i, ch);
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(reverse(new StringBuffer("Tejas Katkade")));
    }
}

