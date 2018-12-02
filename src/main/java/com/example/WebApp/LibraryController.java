package com.example.WebApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class LibraryController {

	@RequestMapping(value = "/LC")
	String lCLibrary() {
		return "Welcome to London Consortium Library";
	}

	@RequestMapping(value = "/LA")
	String lALibrary() {
		return "Welcome to Los Angeles Library";
	}

	@RequestMapping(value = "/LoginLA")
	String lALibraryLogin(@RequestParam(value = "LibraryId") String libId) {
		return "Successfully Logged in at Los Angeles Library"; // login validation fromDb
	}

	@RequestMapping(value = "/LoginLC")
	String lCLibraryLogin(@RequestParam(value = "LibraryId") String libId) {
		return "Successfully Logged in at London Consortium Library. Your Id is: " + libId; // login validation fromDb
	}

	@RequestMapping()
	String defaultMapping() {
		return "This is a default method for the class";
	}

}
