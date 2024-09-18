package demo3;

public class Hashtable<K,V> {
    private K key;
    private V value;

    public Hashtable(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return this.key;
    }

    public V getValue(){
        return this.value;
    }

}
