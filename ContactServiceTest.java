import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void testAddContact() {
		ContactService contactService = new ContactService();
		int arrayLengthBefore = contactService.contactList.size();
		contactService.addContact("012341", "Bob", "Brown", "3003026004", "13 Cake str. Aberdeen Road");
		int arrayLengthAfter = contactService.contactList.size();
		assertTrue(arrayLengthAfter == arrayLengthBefore + 1);
	}
	
	@Test
	void testContactNotAdded() {
		ContactService contactService = new ContactService();
		int arrayLengthBefore = contactService.contactList.size();
		contactService.addContact("012342", "Bob", "Brown", "3003026004", "13 Cake str. Aberdeen Road");
		int arrayLengthAfter = contactService.contactList.size();
		assertTrue(arrayLengthAfter == arrayLengthBefore);
	}
	
	@Test
	void testEditContactWithCorrectFields() {
		ContactService contactService = new ContactService();
		contactService.addContact("012343", "Bob", "Brown", "3003026004", "13 Cake str. Aberdeen Road");
		Contact newContact = contactService.contactList.get(0);
		String formerLastname = newContact.getLastName();
		contactService.editContact("012343", "Bob", "Eilish", "3003026004", "13 Cake str. Aberdeen Road");
		String newLastname = newContact.getLastName();
		assertTrue(formerLastname != newLastname);
		assertTrue(formerLastname == "Brown");
		assertTrue(newLastname == "Eilish");
	}
	
	@Test
	void testEditContactWithWrongFields() {
		ContactService contactService = new ContactService();
		contactService.addContact("012344", "Bob", "Brown", "3003026004", "13 Cake str. Aberdeen Road");
		Contact newContact = contactService.contactList.get(0);
		String formerLastname = newContact.getLastName();
		contactService.editContact("012344", "Bob", "Eilish-Alexander", "3003026004", "13 Cake str. Aberdeen Road");
		String newLastname = newContact.getLastName();
		assertTrue(formerLastname != newLastname);
		assertTrue(formerLastname == "Brown");
		assertTrue(newLastname == "Eilish");
	}
	
	@Test
	void testDeleteContact() {
		ContactService contactService = new ContactService();
		contactService.addContact("012345", "Bob", "Brown", "3003026004", "13 Cake str. Aberdeen Road");
		int arrayLengthBeforeDelete = contactService.contactList.size();
		
		contactService.deleteContact("012345");
		int arrayLengthAfterDelete = contactService.contactList.size();
		assertTrue(arrayLengthAfterDelete < arrayLengthBeforeDelete);
		assertTrue(arrayLengthAfterDelete == (arrayLengthBeforeDelete - 1));
	}

}
