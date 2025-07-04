package com.example.demo.controller;

import com.example.demo.model.Player;
import com.example.demo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PlayerController {

	@Autowired
	private PlayerService playerService;


	@GetMapping("/players")
	public List<Player> getAll()
	{
		return playerService.findAll();
	}

	@GetMapping("/players/{playerID}")
	public Player getByID(@PathVariable String playerID)
	{
		return playerService.findByID(playerID);
	}

}