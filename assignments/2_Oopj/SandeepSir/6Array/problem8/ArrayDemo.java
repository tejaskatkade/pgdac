package problem8;

public class ArrayDemo {
    private int[] array;

    ArrayDemo(){
        this(5);    
    }

    ArrayDemo(int size){
        array = new int[size];
    }

    public int[] getArray(){
        return array;
    }

    public void setArray(int [] array){
        this.array = array;
    }
}
