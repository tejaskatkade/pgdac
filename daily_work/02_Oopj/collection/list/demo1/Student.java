package demo1;

public class Student {
    int rollNun;
    String name;
    int age;

    public Student() {
    }

    public Student(int rollNun, String name, int age) {
        this.rollNun = rollNun;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Studen [rollNun=" + rollNun + ", name=" + name + ", age=" + age + "]";
    }
    
}
