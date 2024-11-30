package com.dbic.catalogApi.controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class StatusController {
    private static final String template = "OK";


	@GetMapping("/")
	public Status status() {
		return new Status(String.format(template));
	}
}
