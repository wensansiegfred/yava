package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import play.db.jpa.Model;

@Entity
public class Contact extends Model {
	public int personId;
	public String firstName; 
	public String lastName;
	public String title; 
	public String background; 
	public String linkedInUrl; 
	public String avatarUrl; 
	public int companyId; 
	public String companyName;
	public Date createdAt;
	public Date updatedAt;
	public String visibleTo;
	public int ownerId;
	public int groupId;
	public int authorId;
	public String emailAddress;
	public String phoneNumber;
	public String emailLocation;
	public String phoneLocation;
	
	@ManyToMany(cascade = CascadeType.ALL)
	public Set<Tag> tags;
	
	public Contact(		
		int personId, 
		String firstName, 
		String lastName,
		String title, 
		String background, 
		String linkedInUrl, 
		String avatarUrl, 
		int companyId, 
		String companyName,
		Date createdAt,
		Date updatedAt,
		String visibleTo,
		int ownerId,
		int groupId,
		int authorId,
		String emailAddress,
		String phoneNumber,
		String emailLocation,
		String phoneLocation
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
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.emailLocation = emailLocation;
		this.phoneLocation = phoneLocation;
		this.tags = new HashSet<Tag>();
	}

	public int getPersonId() {
		return personId;
	}

	public Set<Tag> getTags() {
		return tags;
	}

	public void setTags(Set<Tag> tags) {
		this.tags = tags;
	}
	
	public boolean personExist(Contact contact) {
		int count = Contact.find("select c from Contact c where c.personId = :personId")
				.setParameter("personId", contact.personId)
				.fetch()
				.size();
		return count > 0;
	}
}
