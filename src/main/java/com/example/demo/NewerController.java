package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/example/test")
public class NewerController {

	@GetMapping("/hello-world")
		public ResponseEntity<String> get() {
		
			return ResponseEntity.ok("Hello Woreeld!");
		}
}