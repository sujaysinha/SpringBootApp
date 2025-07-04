package com.example.demo.repository;

import com.example.demo.model.Player;
import com.example.demo.utils.CsvParser;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("PlayerRepository")
public class PlayerRepository {

    File inputFile = new File("C:\\Users\\sujay\\IdeaProjects\\SpringBootApp\\demo\\src\\main\\resources\\Player.csv");
    List<Player> players = new ArrayList<>();
    Map<String, Player> playerMap = new HashMap<>();

    public PlayerRepository()
    {
        System.out.println("Called while constructor Initialization");
        try {
            players = CsvParser.parseCsvToPojo(inputFile, Player.class);
            players.forEach(player -> playerMap.computeIfAbsent(player.getPlayerID(), p-> player ));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public List<Player> getAllPlayers()
    {
        return players;
    }
   public Player getById(String playerId)
    {
        return playerMap.get(playerId);
    }
}
