package models.xml;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "tag")
public class TagXml {
	
	@Element(name = "id", required = false)
	private int id;
	
	@Element(name = "name", required = false)
	private String name;
	
	@Attribute(required = false)
	private String type;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public TagXml(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
