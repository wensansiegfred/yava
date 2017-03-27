package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import javax.inject.Inject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.SyncInvoker;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import models.*;
import models.xml.Person;
import modules.XmlParser;
import modules.highrise.HighRiseService;

public class Application extends Controller {
	
    public static void index(String tagname, int counts) {
        render(tagname, counts);
    }
    
    public static void searchTag(String tagname) throws Exception { 
    	HighRiseService ins = HighRiseService.getInstance();
    	List<Tag> tags = ins.getAllTags();    	
    	Long id = (long) 0;
    	int added = 0;
    	if (tags != null) {
	    	for (Tag tag : tags) {	    		
	    		if (tag.tagname.toLowerCase().equals(tagname.toLowerCase())) {
	    			id = (long) tag.tagId;
	    		}
	    	}
    	}
    	
    	if (id > 0) {
    		List<Contact> contacts = ins.getContactByTag((long)id);
    		if (contacts != null) {
    			for(Contact contact : contacts) {    				
    				if (!contact.personExist(contact))
    					contact.save();
    			}
    			added = contacts.size();
    		}
    	}
    	index(tagname, added);
    }
    
    public static void loadcontactbytag(String tagname) {
    	List<Contact> contacts = null;
    	if (tagname.equals("all")) {
    		contacts = Contact.all().fetch();
    	} else {
    		contacts = Contact.find("select c from Contact c left join c.tags t where t.tagname = :tagname")
					.setParameter("tagname", tagname)
					.fetch();
    	}
    	
    	List<Tag> tagsList = Tag.all().fetch();
    	List<String> selectMenu = new ArrayList<String>();
    	for(Tag t : tagsList) {
    		if (!selectMenu.contains(t.tagname)) {
    			selectMenu.add(t.tagname);
    		}    			
    	} 
    	render(contacts, tagname, selectMenu);
    }
    
    public static void allcontact() {
    	List<Contact> contacts = Contact.all().fetch();
    	List<Tag> tagsList = Tag.all().fetch();
    	List<String> selectMenu = new ArrayList<String>();
    	for(Tag t : tagsList) {
    		if (!selectMenu.contains(t.tagname)) {
    			selectMenu.add(t.tagname);
    		}    			
    	}    	
    	render(selectMenu, contacts);
    }
}