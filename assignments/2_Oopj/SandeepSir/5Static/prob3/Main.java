package prob3;

public class Main {
    public static void main(String[] args) {
        //EmployeeUtil util = new EmployeeUtil();
        int choice;
        
        
        while ((choice = EmployeeUtil.menulist()) != 0) {
            switch (choice) {
                case 1:
                        EmployeeUtil.addEmployee();
                    break;
                case 2:
                        EmployeeUtil.removeEmployee();
                    break;
                case 3:
                        EmployeeUtil.printEmployeeDetails();  
                    break;
                case 4:
                        EmployeeUtil.applyRaise();  
                    break;
                case 5:
                        EmployeeUtil.printTotalExpenses();
                    break;
                case 6:
                        EmployeeUtil.printTotalEmployee();
                    break;
                default:
                    System.out.println("Wrong option");
                    break;
            }
        }

        EmployeeUtil.releseResource();
    }
}
