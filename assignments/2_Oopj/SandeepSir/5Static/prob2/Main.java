package prob2;

public class Main {
    public static void main(String[] args) {
        
        Logger logger = Logger.getInstance();

        System.out.println(logger.getLog());

        logger.log("Tejas Katkade - 01:09 - 06/09/2024");

        System.out.println(logger.getLog());

        logger.log("Tejas Katkade - 02:10 - 07/09/2024");
        System.out.println(logger.getLog());
        Logger logger2 = Logger.getInstance();
        System.out.println(logger2.getLog());

        logger2.clearLog();

        System.out.println(logger.getLog());
        System.out.println(logger2.getLog());

        logger.log("Tejas Katkade - 03:09 - 08/09/2024");

        System.out.println(logger.getLog());
        System.out.println(logger2.getLog());


    }
}
