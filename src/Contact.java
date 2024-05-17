import java.util.Scanner;

public class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    public Contact(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    
    @Override
    public String toString() {
        return "Contact["+"firstName='"+firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +", city='" + city + '\'' +
                ", state='" + state + '\'' +", zip='" + zip + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +']'+"......";
    }
    public static Contact newConnection(Scanner scanner) {
        System.out.println("Enter contact details:");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("City: ");
        String city = scanner.nextLine();
        System.out.print("State: ");
        String state = scanner.nextLine();
        System.out.print("Zip: ");
        String zip = scanner.nextLine();
        System.out.print("Phone Number: ");
        String phone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        return new Contact(firstName, lastName, address, city, state, zip, phone, email);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AddressBook addBook = new AddressBook();
        addBook.addContact(newConnection(scan));
        addBook.displayContacts();
        scan.close();
    }

}

