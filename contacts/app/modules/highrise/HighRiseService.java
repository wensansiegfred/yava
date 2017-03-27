package modules.highrise;

import java.util.Base64;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import models.Contact;
import models.Tag;
import models.xml.Person;
import modules.APPConstants;
import modules.XmlParser;

public class HighRiseService {	
	private static final HighRiseService ins = new HighRiseService();
	private XmlParser xmlParser;
	
	private HighRiseService() {
		xmlParser = new XmlParser();
	}
	
	public static HighRiseService getInstance() {
		return ins;
	}
	
	public List<Contact> getContactByTag(Long tagId) throws Exception {
		String response = queryHighRiseApi("people.xml", "tag_id", tagId);		
		return xmlParser.parsePerson(response);
	}
	
	public List<Contact> getAllContact() throws Exception {
		String response = queryHighRiseApi("people.xml", "", "");		
		return xmlParser.parsePerson(response);
	}
	
	public List<Tag> getAllTags() throws Exception {
		String response = queryHighRiseApi("tags.xml", "", "");		
		return xmlParser.parseTag(response);
	}
	
	private String queryHighRiseApi(String xmlTarget, String param, Object paramValue) {
		Client client = ClientBuilder.newClient();
    	String targetUrl = "https://" + APPConstants.HIGHRISE_USERNAME + ".highrisehq.com";
    	WebTarget webTarget = client.target(targetUrl);
    	Invocation.Builder invocationBuilder = webTarget.path(xmlTarget)    			
    			.queryParam(param, paramValue)
    			.request(MediaType.APPLICATION_XML);
    	String response = invocationBuilder.header("Authorization", "Basic " + Base64.getEncoder().encodeToString(APPConstants.HIGHRISE_API.getBytes())).get(String.class);
    	return response;
	}
}
