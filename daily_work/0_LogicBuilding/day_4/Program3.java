class Student {
    static String instituteName;
    int id;
    String name;
    float marks;
    long mobile;
    String address;

    Student() {

    }

    Student(int id, String name, float marks, long mobile, String address) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.mobile = mobile;
        this.address = address;                 
    }
    
    Student(int id, String name, float marks, long mobile, String address, String instituteName) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.mobile = mobile;
        this.address = address;                 
        this.instituteName = instituteName;

    }
    
    float displayMarks() {
        
        return marks;
    }

    void calculatePercentage() {
        System.out.println("Percentage");
    }

    void displayDetails(){
        System.out.println(id+" "+name+" "+address +" "+instituteName);
        
    }
}


class Program3 {
    public static void main(String[] args) {
        System.out.println(Student.instituteName);  //null
        Student student = new Student();
        System.out.println(student.id); //0 
        //System.out.println(student.instituteName);  //null                    
        Student.instituteName = "CDAC-Mumbai-Khargar";
        Student student2 = new Student(101, "Tejas", 85, 912234556, "Nashik");
        student2.displayDetails();

        Student student3 = new Student(101, "virat", 89, 1234567, "Mumbai","CDAC-Mumbai");
        student3.displayDetails();

        //Student.instituteName = "CDAC-Mumbai";
        student2.displayDetails();
        student3.displayDetails();


        
    }

}