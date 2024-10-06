import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContactManager {
    private ContactList list;
//    static Scanner sc = new Scanner(System.in);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public ContactManager() {
        list = new ContactList();
    }

    public void addNewContact() throws IOException{
        System.out.print("Name : ");
        String name = br.readLine();

        System.out.print("Phone : ");
        Long number  = Long.parseLong(br.readLine());

        list.addContact(number, name);
    }

    public void deleteContact() throws IOException{
        System.out.print("Name : ");
        String name = br.readLine();
        list.removeContact(name);
    }

    public void findContact() throws IOException{
        System.out.print("Name : ");
        String name = br.readLine();
        list.searchContact(name);
    }

    public void viewAllContacts(){
        list.displayContacts();
    }

    public static int menuList() throws IOException{
        System.out.println("Contact Manager");
        System.out.println("0. EXIT");
        System.out.println("1. VIEW ALL CONTACTS");
        System.out.println("2. ADD NEW CONTACT");
        System.out.println("3. DELETE CONTACT");
        System.out.println("4. SEARCH CONTACT");
        System.out.print("Enter choice : ");
        return Integer.parseInt(br.readLine());
    }

    public static void releseResources() throws IOException{
        br.close();
    }
}
