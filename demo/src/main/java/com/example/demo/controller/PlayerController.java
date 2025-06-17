package com.example.demo.controller;

import com.example.demo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

	@Autowired
	private PlayerService playerService;

	@GetMapping("/")
	public String index() {
		return "Hello From Sujay";
	}

	@GetMapping("/all")
	public String getAll()
	{
		return playerService.findAll();
	}

}