package models.xml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "phone-number")
public class PhoneNumber {
	
	@Element(name = "id")
	private int phoneId;
	
	@Element(name = "number")
	private String number;
	
	@Element(name = "location")
	private String location;
	
	public int getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public PhoneNumber(int phoneId, String number, String location) {
		this.phoneId = phoneId;
		this.number = number;
		this.location = location;
	}
}
