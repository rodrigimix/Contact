
public class ContactIteractor {
	private Contact[] contacts;
	private int size;
	private int nextIndex;
	
	public ContactIteractor(Contact[] contacts, int size) {
		this.contacts = contacts;
		this.size = size;
		nextIndex = 0;
	}
	
	public boolean hasNext() {
		return nextIndex < size;
	}
	
	public Contact next() {
		return contacts[nextIndex++];
		
	}
}
