package maingame.newstuff;

public class Player {

    public String name, playerRace, playerClass;
    public int lifePoints, strength, intelligence, speed, charisma;


    public Player(String name0){
        this.name = name0;
        playerRace = "DefaultRace";
        playerClass = "DefaultClass";
        lifePoints = 3;
        strength = 3;
        intelligence = 3;
        speed = 3;
        charisma = 3;
    }

    @Override
    public String toString(){
        String info = "";
        info += "Name of Player: " + name + "\n";
        info += "Race: " + playerRace + "\n";
        info += "Class: " + playerClass + "\n \n";
        info += "LifePoints (LP): " + lifePoints + "\n";
        info += "Strength (ST): " + strength + "\n";
        info += "Intelligence (IN): " + intelligence + "\n";
        info += "Speed (SP): " + speed + "\n";
        info += "Charisma (CH): " + charisma + "\n";

        return info;
    }
}
