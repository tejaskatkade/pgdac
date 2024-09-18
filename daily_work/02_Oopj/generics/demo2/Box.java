package demo2;

public class Box<T> {
    private T object;

    public T getObject(){
        return this.object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}
