import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testContactClass() {
		Contact contact = new Contact("012345", "Bob", "Brown", "3003026004", "13 Cake str. Aberdeen Road");
		assertTrue(contact.getId().equals("012345"));
	}
	
	@Test
	void testContactFirstName() {
		Contact contact = new Contact("012345", "Bob", "Brown", "3003026004", "13 Cake str. Aberdeen Road");
		assertTrue(contact.getFirstName().equals("012345"));
	}
	
	@Test
	void testContactIdTooLong() { 
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456739900", "Bob", "Brown", "3003026004", "13 Cake str. Aberdeen Road");
		});
	}
	
	@Test
	void testContactIsNull() { 
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Bob", "Brown", "3003026004", "13 Cake str. Aberdeen Road");
		});
	}
	
	@Test
	void testContactFirstNameTooLong() { 
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456739900", "Kjaro", "Brown", "3003026004", "13 Cake str. Aberdeen Road");
		});
	}
}
