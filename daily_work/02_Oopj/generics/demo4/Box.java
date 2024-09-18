package demo4;

public class Box<T extends Number> {
    private T object;

    public T getObject(){
        return this.object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}
