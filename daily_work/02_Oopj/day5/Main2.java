class Singleton{
    
    private int num;
    private static Singleton singleton = new Singleton();
    
    private Singleton(){
        this.num = -1;
        System.out.println("Object Created....");
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public static Singleton getSingleton() { 
        return Singleton.singleton;
    }
      
}
public class Main2 {
    public static void main(String[] args) {
        Singleton.getSingleton();
        Singleton.getSingleton();
        Singleton.getSingleton();
        Singleton.getSingleton();
    }
}
