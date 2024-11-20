package revbymalkeetsir.demo1;

class Student{
    int rollNO;
    String name;

    void showRecord(){
        System.out.println("Roll no : "+this.rollNO +" Name :"+this.name);
    }
}
public class GenericsDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name ="Tejas";
        s1.rollNO = 1001;

        s1.showRecord();
        
        Student s2 = new Student();
        s2.name = "Malkeet";
        
        s2.showRecord();


        // here I can only store 1 string and 1 integer

        // so I want a class which allow me to any data type


        Demo d1 = new Demo();
        
        d1.var1 = "Tejas";
        d1.var2 = "Virat";
        d1.showRecord();

        Demo d2 = new Demo(); // RAW type instance as I have not specified the Type
        d2.var1 = 12345;
        d2.var2 = true;
        d2.showRecord();

        Demo<Float> d4 = new Demo<>();
        d4.var1 = 123.45F;
        // Here my instance d4 is bounded Not Demo class


        Demo1 d3 = new Demo1();
        
        // d3.var1 = "Tejas";  // Type mismatch: cannot convert from String to Number
        // d3.var2 = "Virat";
        d3.showRecord();

    }
}


// <>   -> Diamond Operator : use to indicate generic type

// declaration of generic class


class Demo<T> {
    T var1; // Generic variable i.e. declared using T
    T var2;

    void showRecord(){
        System.out.println(this.var1 +" "+this.var2);
    }

     void GetData(T a, T b){ // Generic method

    }

}

// Demo1 class here is bounded class
class Demo1 <T extends Number> {
    T var1; // Generic variable i.e. declared using T
    T var2;

    void showRecord(){
        System.out.println(this.var1 +" "+this.var2);
    }

}
