
public class Main2 {
	public static void main(String[] args) {
		ContactBook contacts = new ContactBook();
		contacts.addContact("Rodrigo Marques", "960032732", "rodrigimix@protonmail.com");
		contacts.addContact("Joana Marques", "960000000", "jm@gmail.com");
		contacts.addContact("Sergio Marques", "924479291", "sm@gmail.com");
		contacts.addContact("Ana Marques", "924479292", "cm@gmail.com");
		System.out.println(contacts.getNumberOfContacts());
		System.out.println(contacts.hasContact("Rodrigo Marques"));
		System.out.println(contacts.getEmail("Rodrigo Marques"));
		System.out.println(contacts.getPhone("Rodrigo Marques"));
		contacts.deleteContact("Rodrigo Marques");
		System.out.println(contacts.getNumberOfContacts());

		
	
	
	
	}
}
