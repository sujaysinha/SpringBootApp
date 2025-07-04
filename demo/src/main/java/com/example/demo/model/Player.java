package com.example.demo.model;

public class Player {
    String playerID;
    String  birthYear ;
    String  birthMonth ;
    String  birthDay;
    String  birthCountry;
    String  birthState;
    String  birthCity;
    String  deathYear;
    String  deathMonth;
    String  deathDay;
    String  deathCountry;
    String  deathState;
    String  deathCity;
    String  nameFirst;
    String  nameLast;
    String  nameGiven;
    String  weight;
    String  height;
    String  bats;
    String  throws_ ;
    String  debut;
    String  finalGame;
    String  retroID;
    String  bbrefID;

    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public String getNameFirst() {
        return nameFirst;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerID='" + playerID + '\'' +
                ", nameFirst='" + nameFirst + '\'' +
                ", nameLast='" + nameLast + '\'' +
                '}';
    }

    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public String getNameLast() {
        return nameLast;
    }

    public void setNameLast(String nameLast) {
        this.nameLast = nameLast;
    }


}
