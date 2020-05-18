package com.example1.demo1;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeresource {
@GetMapping("/")
public String home()
{
	return("<h1>welcome</h1>");
}

@GetMapping("/user")
public String user()
{
	return("<h1>welcome user</h1>");
}
}
