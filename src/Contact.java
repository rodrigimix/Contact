
public class Contact {
	private String name;
	private String number;
	private String email;

	public Contact(String name, String number, String email) {
		this.name = name;
		this.number = number;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return number;
	}

	public String getEmail() {
		return email;
	}

	public void setPhone(String number) {
		this.number = number;

	}

	public void setEmail(String email) {
		this.email = email;

	}

	public boolean hasName(String name) {
		return this.name.equals(name);
	}
}
