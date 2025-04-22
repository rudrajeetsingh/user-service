package com.microservice.user.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

	@GetMapping("/{id}")
	public ResponseEntity<Map<String, String>> getUser(@PathVariable("id") String userId) {
		Map<String, String> user = new HashMap<>();
		user.put("id", userId);
		user.put("name", "John Doe");
		return ResponseEntity.ok(user);
	}
}
