package prob2;

public class Logger {

    private static Logger instance = null;
    private String log = "Empty Logs";

    Logger(){
        System.out.println("Instance Created ....!!!");
    }

    public static Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message){
        if(this.log.equals("Empty Logs")){
            this.log = message;
        }else{
            this.log = this.log + "\n"+ message;
        }
         
    }

    public String getLog(){
        return this.log;
    }
    
    public void clearLog(){
        this.log = "Empty Logs";
    }
}
