
public class ContactBook {

	private static final int DEFAULT_CAPACITY = 50;
	private static final int GROWTH_FACTOR = 2;
	private static final int NOT_FOUND = -1;
	private int size;
	private Contact[] contacts;
	
	public ContactBook() {
		size = 0;
		contacts = new Contact[DEFAULT_CAPACITY];
	}
	
	private int searchIndex(String name) {
		int i = 0;
		
		while(i<size && !contacts[i].hasName(name)) {
			i++;
		}
		
		if (i < size)
			return i;
		else
			return NOT_FOUND;
			
	}
	
	private boolean isFull() {
		return size == contacts.length;
	}
	
	private void grow() {
		Contact[] temp = new Contact[GROWTH_FACTOR*contacts.length];
		for (int i = 0; i < size; i++) {
			temp[i] = contacts[i];
		}
		contacts = temp;
	}
	
	public boolean hasContact(String name) {
		return searchIndex(name) != NOT_FOUND;
		
	}
	
	public int getNumberOfContacts() {
		return size;
	}
	
	public void addContact(String name, String number, String email) {
		if(isFull())
			grow();
		contacts[size++] = new Contact(name, number, email);
	}
	
	public void deleteContact(String name) {
		contacts[searchIndex(name)] = contacts[size-1];
		size--;
	}
	
	public void setEmail(String name, String email) {
		contacts[searchIndex(name)].setEmail(email);
	}
	
	public String getEmail(String name) {
		return contacts[searchIndex(name)].getEmail();
	}
	
	public void setPhone(String name, String number) {
		contacts[searchIndex(name)].setPhone(number);
	}
	
	public String getPhone(String name) {
		return contacts[searchIndex(name)].getPhone();
	}
	
	public ContactIteractor iteractor() {
		return new ContactIteractor(contacts, size);
	}
}
