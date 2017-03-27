package models.xml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "email-address")
public class EmailAddress {
	
	@Element(name = "id")
	private int emailId;
	
	@Element(name = "address")
	private String address;
	
	@Element(name = "location")
	private String location;
	
	public EmailAddress(int emailId, String address, String location) {
		this.emailId = emailId;
		this.address = address;
		this.location = location;
	}

	public int getEmailId() {
		return emailId;
	}

	public void setEmailId(int emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
