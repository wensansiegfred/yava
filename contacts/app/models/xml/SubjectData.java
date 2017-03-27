package models.xml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "subject_data")
public class SubjectData {
	
	@Element(name = "id")
	private int id;
	
	@Element(name = "value")
	private String subjectValue;
	
	@Element(name= "subject_field_id")
	private int subjectFieldId;
	
	@Element(name = "subject_field_label")
	private String subjectFieldLabel;
	
	public SubjectData(int id, String subjectValue, int subjectFieldId, String subjectFieldLabel) {
		this.id = id;
		this.subjectValue = subjectValue;
		this.subjectFieldId = subjectFieldId;
		this.subjectFieldLabel = subjectFieldLabel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubjectValue() {
		return subjectValue;
	}

	public void setSubjectValue(String subjectValue) {
		this.subjectValue = subjectValue;
	}

	public int getSubjectFieldId() {
		return subjectFieldId;
	}

	public void setSubjectFieldId(int subjectFieldId) {
		this.subjectFieldId = subjectFieldId;
	}

	public String getSubjectFieldLabel() {
		return subjectFieldLabel;
	}

	public void setSubjectFieldLabel(String subjectFieldLabel) {
		this.subjectFieldLabel = subjectFieldLabel;
	}
}
