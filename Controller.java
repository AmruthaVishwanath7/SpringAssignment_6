package com.assignment.task6.SpringAssignment6;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@PostMapping("/postData")
	public String saveData(@RequestBody Student s) {
		
		System.out.println(s.roll);
		System.out.println(s.name);
		
		
		return"Data Stored";
		
	}

}
