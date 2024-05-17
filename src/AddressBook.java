import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contacts;
    //list to store contacts
    public AddressBook() {
        this.contacts = new ArrayList<>();
    }
    //add contact
    public void addContact(Contact contact) {
        contacts.add(contact);
    }
    // to store elements in list
    public List<Contact> getContacts() {
        return contacts;
    }
    //to print all contacts in list
    public void displayContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
    //edit contact by name in list
    public void editeContact(String oldName, Contact newContact) {
        for (int i = 0; i < contacts.size(); i++) {
            //check name in list or not
            if (contacts.get(i).getName().equalsIgnoreCase(oldName)) {
                contacts.set(i, newContact);
                return;
            }
        }
        System.out.println("Contact not found.");
    }
    //to delete contact from list
    public void deleteContact(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equalsIgnoreCase(name)) {
                contacts.remove(i);
                System.out.println("Contact deleted.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }
}