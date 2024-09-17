package demo2;

enum Day{
    SUN("sunday"),
    MON("monday"),
    TUE("tuesday");

    String name;

    Day(String name){
        this.name = name;
    }

}
public class Program {
    
    public static void main(String[] args) {
        System.out.println("Name "+Day.SUN.name());
        System.out.println("Ordinal "+Day.SUN.ordinal());
        System.out.println("Literal "+Day.SUN.name);
        
        System.out.println();

        Day[] days = Day.values();

        for(Day day : days){
            System.out.print(day+" ");
        }
        System.out.println();

        for(Day day : days){
            System.out.print(day.name+" ");
        }
        System.out.println();

        for(Day day : days){
            System.out.print(day.name()+" ");
        }
        System.out.println();

        for(Day day : days){
            System.out.print(day.toString()+" ");
        }
        System.out.println();
        
        
    }
}
