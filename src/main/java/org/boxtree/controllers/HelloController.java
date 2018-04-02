package org.boxtree.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	public class Message {
		private String content;
		
		Message(String content) {
			this.content = content;
		}
		
		public String getContent() {
			return content;
		}
 	}
	
	private static final String messageTemplate = "Hello, %s";
	
    @GetMapping("/hello")
    @ResponseBody
    public Message sayHello(@RequestParam(name="name", required=false, defaultValue="You") String name) {
        return new Message(String.format(messageTemplate, name));
    }
}
