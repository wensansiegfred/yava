package models.xml;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root
public class People {
	
	@ElementList(inline = true, name = "person", required = false)
	public List<Person> persons;
	
	public List<Person> getPersons() {
		return persons;
	}

	public People() {
		this.persons = new ArrayList<Person>();
	}
	
	@Attribute
	public String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
