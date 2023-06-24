import java.lang.String;

public class Contact {
	
	//instance variable
	private String id;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	//constructor
	public Contact(String id, String firstName, String lastName, String phone, String address) {
		if (id == null || id.length() > 10) { 
			throw new IllegalArgumentException("Invalid id");
		}
		
		if (firstName == null || firstName.length() > 10) { 
			throw new IllegalArgumentException("Invalid first-name");
		}
		
		if (lastName == null || lastName.length() > 10) { 
			throw new IllegalArgumentException("Invalid last-name");
		}
		
		if (phone == null || phone.length() != 10) { 
			throw new IllegalArgumentException("Invalid phone");
		}
		
		if (address == null || address.length() > 30) { 
			throw new IllegalArgumentException("Invalid address");
		}
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
		
		
	}
	//public Contact() {}
	
	//Accessor methods
	public String getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhoneNumber() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	//Mutator methods
	public void setFirstName(String newFirstName) {
		this.firstName = newFirstName;
	}
	
	public void setLastName(String newLastName) {
		this.lastName = newLastName;
	}
	
	public void setPhone(String newPhone) {
		this.phone = newPhone;
	}
	
	public void setAddress(String newAddress) {
		this.address = newAddress;
	}
	
}
