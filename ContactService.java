import java.util.ArrayList;

public class ContactService {
	public ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	ContactService () {}
	
	
	public void addContact (String id, String firstName, String lastName, String phone, String address ) {
		Contact newContact = new Contact (id, firstName, lastName, phone, address);
		
		contactList.add(newContact);
	}
	
	public void deleteContact (String id) {
		int targetIndex;
		
		for (Contact contact: contactList) {
			if (contact.getId() == id) {
				targetIndex = contactList.indexOf(contact);
				contactList.remove(targetIndex);
				return;
			}
		}
	}
	
	public void editContact (String id, String firstName, String lastName, String phone, String address) {
		for (Contact contact: contactList) {
			if (contact.getId() == id) {
				
				if (firstName == null || firstName.length() > 10) { 
					throw new IllegalArgumentException("Invalid first-name");
				} 
				else {
					contact.setFirstName(firstName);
				}
				
				
				if (lastName == null || lastName.length() > 10) { 
					throw new IllegalArgumentException("Invalid last-name");
				}
				else {
					contact.setLastName(lastName);
				}
				
				if (phone == null || phone.length() != 10) { 
					throw new IllegalArgumentException("Invalid phone");
				}
				else {
					contact.setPhone(phone);
				}
				
				if (address == null || address.length() > 30) { 
					throw new IllegalArgumentException("Invalid address");
				}
				else {
					contact.setAddress(address);
				}
				
			}
		}
		
	}

}
