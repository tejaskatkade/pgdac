// Object created inside mehtod getSingleton

class Singleton{
    private int num;
    private static Singleton singleton = null;
    
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

        if(singleton == null){
            singleton = new Singleton();           
        }
        return singleton;
    }
      
}

public class Main {
    public static void main(String[] args) {
        // Singleton singleton = new Singleton(); // Not ok
        // The constructor Singleton() is not visible
    
        Singleton.getSingleton();
        Singleton.getSingleton();
        Singleton.getSingleton();
        Singleton.getSingleton();
        
    }
}
