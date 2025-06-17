package com.example.demo.service;

import com.example.demo.model.Player;
import com.example.demo.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("PlayerService")
public class PlayerService {
    @Autowired
    PlayerRepository playerRepository;
    public String findAll()
    {
        return playerRepository.getById("id").toString();
    }
}
