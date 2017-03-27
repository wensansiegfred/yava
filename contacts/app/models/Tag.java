package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import play.db.jpa.Model;

@Entity
public class Tag extends Model {	
	
	public String tagname;
	public int tagId;
	
	public Tag(int tagId, String tagname) {		
		this.tagId = tagId;
		this.tagname = tagname;
	}
}
 