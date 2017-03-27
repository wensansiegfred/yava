package models.xml;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "tags")
public class TagsXml {
	
	@ElementList(inline = true, name = "tag", required = false)
	private List<TagXml> tagXmls;
	
	@Attribute
	private String type;
	
	public List<TagXml> getTagXmls() {
		return tagXmls;
	}

	public void setTagXmls(List<TagXml> tagXmls) {
		this.tagXmls = tagXmls;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public TagsXml(String type) {
		this.type = type;
		this.tagXmls = new ArrayList<TagXml>();
	}	
}
