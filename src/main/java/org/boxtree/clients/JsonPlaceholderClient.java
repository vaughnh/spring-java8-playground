package org.boxtree.clients;

import org.boxtree.models.JsonPlaceHolder.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class JsonPlaceholderClient {
	
	private final Config config;
	private final RestTemplate restTemplate;
	
	@Autowired
	public JsonPlaceholderClient(Config config) {
	    this.config = config;
	    this.restTemplate = new RestTemplate();
	}
	
	public User[] getUsers() {
       	return restTemplate.getForObject(this.config.getUri(), User[].class);
	}
}
