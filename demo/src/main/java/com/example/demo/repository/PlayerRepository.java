package com.example.demo.repository;

import com.example.demo.model.Player;
import com.example.demo.utils.CsvParser;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Repository("PlayerRepository")
public class PlayerRepository {

    //If we have it this way same Object gets returned always
    Player fixedObj = new Player();
    File inputFile = new File("C:\\Users\\sujay\\IdeaProjects\\SpringBootApp\\demo\\src\\main\\resources\\Player.csv");
    List<Player> people = new ArrayList<>();

    public PlayerRepository()
    {
        System.out.println("Called while constructor Initialization");
        try {
            people = CsvParser.parseCsvToPojo(inputFile, Player.class);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
   public Player getById(String playerId)
    {
        return people.get(0);
    }
}
