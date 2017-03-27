package models.xml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "instant-messenger")
public class InstantMessenger {
	
	@Element(name = "id")
	private int id;
	
	@Element(name = "location")
	private String location;
	
	@Element(name = "protocol")
	private String protocol;
	
	@Element(name = "address")
	private String address;
	
	public InstantMessenger(int id, String location, String protocol, String address) {
		this.id = id;
		this.location = location;
		this.protocol = protocol;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
