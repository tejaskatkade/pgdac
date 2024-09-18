package demo1;

public class Main{
    public static void main(String[] args) {
        Box box = new Box();
        
        int num = 128;
        box.setObject(num);  // Integer.valueOf(num);

        Object object = box.getObject();
        Integer number = (Integer)object;
        int num2 = number.intValue();
        System.out.println(num2);

//-----------------------------------------------

        float f = 12.f;
        box.setObject(f);
        float f2 = (float)box.getObject();
        System.out.println(f2);

    }
}