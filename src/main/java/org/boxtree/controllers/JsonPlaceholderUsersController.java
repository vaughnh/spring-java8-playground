package org.boxtree.controllers;

import org.boxtree.clients.JsonPlaceholderClient;
import org.boxtree.models.JsonPlaceHolder.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonPlaceholderUsersController {
	
	private final JsonPlaceholderClient client;
	
	@Autowired
	JsonPlaceholderUsersController(JsonPlaceholderClient client) {
		this.client = client;
	}
    @GetMapping("/client")
    @ResponseBody
    public User[] get() {
    	return client.getUsers();
    }
}
