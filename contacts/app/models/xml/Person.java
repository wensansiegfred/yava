package models.xml;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.xml.bind.DatatypeConverter;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root
public class Person {
	
	@Element(name = "id")
	private int personId;
	
	@Element(name = "first-name")
	private String firstName;
	
	@Element(name = "last-name")
	private String lastName;
	
	@Element(name = "title", required = false)
	private String title;
	
	@Element(name = "background", required = false)
	private String background;
	
	@Element(name = "linkedin-url", required = false)
	private String linkedInUrl;
	
	@Element(name = "avatar_url", required = false)
	private String avatarUrl;
	
	@Element(name = "company-id", required = false)
	private int companyId;
	
	@Element(name = "company-name", required = false)
	private String companyName;
	
	@Element(name = "created-at")
	private String createdAt;
	
	@Element(name = "updated-at")
	private String updatedAt;
	
	@Element(name = "visible-to")
	private String visibleTo;
	
	@Element(name = "owner-id", required = false)
	private int ownerId;
	
	@Element(name = "group-id", required = false)
	private int groupId;
	
	@Element(name = "author-id")
	private int authorId;
	
	@Element(name = "contact-data")
	private ContactData contactData;
	
	@ElementList(name = "subject_datas", required = false)
	private List<SubjectData> subjectData;
	
	@ElementList(name = "tags")
	private List<TagXml> tags;
	
	public Person (
			int personId, 
			String firstName, 
			String lastName,
			String title, 
			String background, 
			String linkedInUrl, 
			String avatarUrl, 
			int companyId, 
			String companyName,
			String createdAt,
			String updatedAt,
			String visibleTo,
			int ownerId,
			int groupId,
			int authorId,
			ContactData contactData,
			List<SubjectData> subjectData,
			List<TagXml> tags
	) {
		
			this.personId = personId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.title = title;
			this.background = background;
			this.linkedInUrl = linkedInUrl;
			this.avatarUrl = avatarUrl;
			this.companyId = companyId;
			this.companyName = companyName;
			this.createdAt = createdAt;
			this.updatedAt = updatedAt;
			this.visibleTo = visibleTo;
			this.ownerId = ownerId;
			this.groupId = groupId;
			this.authorId = authorId;
			this.contactData = contactData;
			this.subjectData = subjectData;
			this.tags = tags;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBackground() {
		return background;
	}

	public void setBackground(String background) {
		this.background = background;
	}

	public String getLinkedInUrl() {
		return linkedInUrl;
	}

	public void setLinkedInUrl(String linkedInUrl) {
		this.linkedInUrl = linkedInUrl;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getVisibleTo() {
		return visibleTo;
	}

	public void setVisibleTo(String visibleTo) {
		this.visibleTo = visibleTo;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public ContactData getContactData() {
		return contactData;
	}

	public void setContactData(ContactData contactData) {
		this.contactData = contactData;
	}

	public List<SubjectData> getSubjectData() {
		return subjectData;
	}

	public void setSubjectData(List<SubjectData> subjectData) {
		this.subjectData = subjectData;
	}

	public List<TagXml> getTags() {
		return tags;
	}

	public void setTags(List<TagXml> tags) {
		this.tags = tags;
	}
}
