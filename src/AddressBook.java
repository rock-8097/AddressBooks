import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public List<Contact> getContacts() {
        return contacts;
    }
    public void displayContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
    public void editeContact(String oldName, Contact newContact) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equalsIgnoreCase(oldName)) {
                contacts.set(i, newContact);
                return;
            }
        }
        System.out.println("Contact not found.");
    }
}