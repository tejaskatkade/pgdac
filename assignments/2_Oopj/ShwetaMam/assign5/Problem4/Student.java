package assign5.Problem4;

public class Student {
    
    private int rollNum;
    private String name;
    private String address;

    Student(){
        this(0,"unknown","unknown");
    }
    Student(int rollNum, String name, String address) {
        this.name = name;
        this.rollNum = rollNum;
        this.address= address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public int getRollNum() {
        return this.rollNum;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public String toString(){
        return "Student [ Name : "+name+", Roll Num : "+rollNum+", Address :"+address+"]";
    }
}
