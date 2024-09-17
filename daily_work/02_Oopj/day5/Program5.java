import java.time.LocalDate;

class Date{
    private int day;
    private int month;
    private int year;

    public Date(){
        LocalDate localDate = LocalDate.now();
        this.day = localDate.getDayOfMonth();
        this.month = localDate.getMonthValue();
        this.year = localDate.getYear();
    }

    @Override
    public String toString() {
        return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
    }

    

}

public class Program5 {
    
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        // Date [day=9, month=9, year=2024]
    }
    
}
