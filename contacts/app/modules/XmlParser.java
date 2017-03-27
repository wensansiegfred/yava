package modules;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.bind.DatatypeConverter;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.transform.RegistryMatcher;

import models.Contact;
import models.Tag;
import models.xml.People;
import models.xml.Person;
import models.xml.TagXml;
import models.xml.TagsXml;

public class XmlParser {
	
	public List<Contact> parsePerson(String response) throws Exception {
		List<Contact> contacts = new ArrayList<Contact>();
		RegistryMatcher matcher = new RegistryMatcher();
		Serializer serializer = new Persister(matcher);
		People people = serializer.read(People.class, response);
		
		for(Person person: people.getPersons()) {
			Contact newContact = new Contact(
					person.getPersonId(), 
					person.getFirstName(), 
					person.getLastName(),
					person.getTitle(), 
					person.getBackground(), 
					person.getLinkedInUrl(), 
					person.getAvatarUrl(), 
					person.getCompanyId(), 
					person.getCompanyName(),
					parseDate(person.getCreatedAt()),
					parseDate(person.getUpdatedAt()),
					person.getVisibleTo(),
					person.getOwnerId(),
					person.getGroupId(),
					person.getAuthorId(),
					(person.getContactData().getEmailAddress().size() > 0 ? person.getContactData().getEmailAddress().get(0).getAddress() : ""),
					(person.getContactData().getPhoneNumbers().size() > 0 ? person.getContactData().getPhoneNumbers().get(0).getNumber() : ""),
					(person.getContactData().getEmailAddress().size() > 0 ? person.getContactData().getEmailAddress().get(0).getLocation() : ""),
					(person.getContactData().getPhoneNumbers().size() > 0 ? person.getContactData().getPhoneNumbers().get(0).getLocation() : "")
			);
			
			Set<Tag> tags = new HashSet<Tag>();
			for (TagXml tagXml : person.getTags()) {
				tags.add(new Tag(tagXml.getId(), tagXml.getName()));
			}
			
			newContact.setTags(tags);
			contacts.add(newContact);
		}
		
		return contacts;
	}
	
	public List<Tag> parseTag(String response) throws Exception {		
		List<Tag> tagList = new ArrayList<Tag>();
		RegistryMatcher matcher = new RegistryMatcher();
		Serializer serializer = new Persister(matcher);		
		TagsXml tagsXml = serializer.read(TagsXml.class, response);
		
		for(TagXml tagXml: tagsXml.getTagXmls()) {			
			tagList.add(new Tag(tagXml.getId(), tagXml.getName()));
		}
		
		return tagList;
	}	
	
	private Date parseDate(String mydate) {		
		Calendar date = null;
		date = DatatypeConverter.parseDateTime(mydate);
		return date.getTime();
	}
}
