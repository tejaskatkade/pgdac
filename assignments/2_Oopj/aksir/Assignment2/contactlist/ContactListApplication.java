import java.io.IOException;

public class ContactListApplication{

    public static void main(String[] args) throws IOException{
        
        ContactManager manager = new ContactManager();

        int choice = 0;
        while ((choice = ContactManager.menuList()) != 0) {
            switch (choice) {
                case 1:
                    manager.viewAllContacts();
                    break;
                case 2:
                    manager.addNewContact();;
                    break;
                case 3:
                    manager.deleteContact();;
                    break;
               
                case 4:
                    manager.findContact();
                    break;
            
                default:
                    System.out.println("Wrong Choice");
                    break;
            }
        }
        
    }
}