package com.example.demo.utils;

import com.example.demo.model.Player;
import org.apache.commons.csv.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvParser {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("Player.csv"); // Replace with your CSV file
        List<Player> people = parseCsvToPojo(inputFile, Player.class);
        people.forEach(System.out::println);
    }

    public static <T> List<T> parseCsvToPojo(File inputFile, Class<T> pojoClass) throws IOException {
        List<T> records = new ArrayList<>();
        try (Reader reader = new FileReader(inputFile);
             CSVParser parser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader())) {
            for (CSVRecord record : parser) {
                try {
                    T pojo = pojoClass.getDeclaredConstructor().newInstance();
                    // Assuming constructor with no arguments
                    // Populate fields based on CSV columns
                    if (pojo instanceof Player) {
                        Player player = (Player) pojo;//,
                        player.setPlayerID(record.get("playerID"));
                        player.setNameFirst(record.get("nameFirst"));
                        player.setNameLast(record.get("nameLast"));
                        records.add((T) player);
                    }
                } catch (Exception e) {
                    System.err.println("Failed to map CSV record to POJO: " + record);
                    e.printStackTrace();
                }
            }
        }
        return records;
    }
}