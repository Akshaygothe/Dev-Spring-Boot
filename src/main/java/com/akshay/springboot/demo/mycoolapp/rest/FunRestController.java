package com.akshay.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	// injecting properties
	@Value("${coach.name}")
	private String CoachName;
	
	@Value("${team.name}")
	private String teamName;
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello World";
	}
	
	@GetMapping("/workout")
	public String getDaliyWorkout() {
		return "Run Hard 5K!";
	}
	
	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return "Coach: " + CoachName + ", Team Name: " + teamName;
	}
}
