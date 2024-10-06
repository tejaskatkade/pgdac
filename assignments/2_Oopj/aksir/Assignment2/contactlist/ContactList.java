public class ContactList {
    Contact head;
    static class Contact {
        Long number;
        String name;
        Contact next;

        Contact(Long number, String name) {
            this.name = name;
            this.number = number;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Contact createContact(Long number, String name) {
        return new Contact(number, name);
    }

    public void addContact(Long number, String name) {
        Contact newContact = createContact(number, name);
        Contact temp = head;
        if(head == null) {
            head = newContact;
        
        }else {

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newContact;
        }
        System.out.println("Contact added: "+newContact.name+", "+ newContact.number);

    }
    
    public void removeContact(String name) {
        if(isEmpty()) {
            System.out.println("No Contacts Found");
        
        }else if(head.next == null) {
            if(head.name.equals(name)) {
                System.out.println("Contact Deleted "+head.name+", "+head.number);
                head = null;
            }else{
                System.out.println("Contact Not Found ");
            }
        }else if(head.name.equals(name)) {
            
                System.out.println("Contact Deleted "+head.name+", "+head.number);
                head = head.next;
        }else{
            Contact temp = head;
            while (temp.next != null && !temp.next.name.equals(name)) {
                temp = temp.next; 
            }

            if(temp.next != null) {
                System.out.println("Contact Found "+temp.next.name+", "+temp.next.number);

                if (temp.next.next == null) {
                    System.out.println("Contact Deleted "+temp.next.name+", "+temp.next.number);
                    temp.next = null;
                    
                } else {
                    temp.next = temp.next.next;
                }

            }else{
                System.out.println("Contact Not Found ");

            }

            

        }
    }

    public void searchContact(String name) {
        if(isEmpty()) {
            System.out.println("No Contacts Found");
        }else{
            Contact temp = head;

            while (temp != null && !(temp.name.equals(name)) ) {
                temp = temp.next; 
            }

            if(temp != null) {
                System.out.println("Contact : "+ temp.name+" , "+ temp.number);
                return;
            }
            System.out.println("Contact Not Found ");
        }
    }
    
    public void displayContacts() {
        
        if(isEmpty()) {
            System.out.println("No Contacts Found");
        }else{
            System.out.println("Contact List:");
            Contact temp = head;
            while (temp != null) {
                System.out.println(temp.name+", "+temp.number);
                temp = temp.next; 
            }
        }
        
    }
    
    
}
