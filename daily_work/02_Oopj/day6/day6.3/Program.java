class A{

    static int count = 5;
}
class B{

    static int count = 10;
}
class C{

    static int count = 20;
}

public class Program {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        System.out.println("A :"+ A.count);
        System.out.println("B :"+ B.count);
        System.out.println("C :"+ C.count);
    }
}
