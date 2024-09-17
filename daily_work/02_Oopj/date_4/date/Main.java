package date;

public class Main{

    public static void printDate(Date date){
        int day = date.getDay();
        int month = date.getMonth();
        int year = date.getYear();

        System.out.println(day+"/"+month+"/"+year);
    }

    public static void main(String[] args) {
        Date date = new Date();
        Main.printDate(date);

        Date date2 = new Date(24, 03, 2002);
        Main.printDate(date2);

    }
      
}
