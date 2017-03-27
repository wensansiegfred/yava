package models.xml;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

public class ContactData {
	
	@ElementList(name = "email-addresses")
	private List<EmailAddress> emailAddress;
	
	public List<EmailAddress> getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(List<EmailAddress> emailAddress) {
		this.emailAddress = emailAddress;
	}

	public List<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	@ElementList(name = "phone-numbers")
	private List<PhoneNumber> phoneNumbers;
	
	@ElementList(name = "instant-messengers")
	private List<InstantMessenger> instantMessengers;
	
	@ElementList(name = "twitter-accounts")
	private List<TwitterAccount> twitterAccounts;
	
	@ElementList(name = "addresses")
	private List<Address> addresses;
	
	public List<InstantMessenger> getInstantMessengers() {
		return instantMessengers;
	}

	public void setInstantMessengers(List<InstantMessenger> instantMessengers) {
		this.instantMessengers = instantMessengers;
	}

	public List<TwitterAccount> getTwitterAccounts() {
		return twitterAccounts;
	}

	public void setTwitterAccounts(List<TwitterAccount> twitterAccounts) {
		this.twitterAccounts = twitterAccounts;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public List<WebAddress> getWebAddresses() {
		return webAddresses;
	}

	public void setWebAddresses(List<WebAddress> webAddresses) {
		this.webAddresses = webAddresses;
	}

	@ElementList(name = "web-addresses")
	private List<WebAddress> webAddresses;
	
	public ContactData() {
		this.emailAddress = new ArrayList<EmailAddress>();
		this.phoneNumbers = new ArrayList<PhoneNumber>();		
	}
} 
