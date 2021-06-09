package maingame.newstuff;

import java.util.Scanner;

public class Player {

    public String name, playerRace, playerClass;
    public int lifePoints, strength, intelligence, speed, charisma;

    /* - - - Konstruktoren - - - */
    //Default Konstruktor
    public Player(){
        name = "DefaultName";
        playerRace = "DefaultRace";
        playerClass = "DefaultClass";
        lifePoints = 3;
        strength = 3;
        intelligence = 3;
        speed = 3;
        charisma = 3;
    }
    //Konstruktor mit Namensübergabe
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

    //Ausgabe aller Werte
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

    /* - - - Veränderung der Werte des Players - - - */
    public void setName(String name){
        this.name = name;
        System.out.println("Dein neuer Name ist nun " + name + "\n");
        //System.out.println("Viel Spaß auf deinem weiteren Abenteuer");
        return;
    }
    public void setRace(int selection){
        switch (selection) {
            case 1:
                System.out.println("Du bist nun also menschlicher Abstammung\n");
                playerRace = "Mensch";
                lifePoints = 3;
                strength = 3;
                intelligence = 6;
                speed = 3;
                charisma = 5;
                break;
            case 2:
                System.out.println("Du bist nun also elfischer Abstammung\n");
                playerRace = "Elf";
                lifePoints = 3;
                strength = 3;
                intelligence = 5;
                speed = 6;
                charisma = 3;
                break;
            case 3:
                System.out.println("Du bist nun also daemonischer Abstammung\n");
                playerRace = "Daemon";
                lifePoints = 5;
                strength = 6;
                intelligence = 3;
                speed = 3;
                charisma = 3;
                break;
            default:
                System.out.println("Irgendwas stimmt hier nicht...");
                break;
        }
    }
    public void setClass(int selection){
        switch (selection) {
            case 1:
                System.out.println("Du bist nun also ein Krieger\n");
                this.playerClass = "Krieger";
                break;
            case 2:
                System.out.println("Du bist nun also ein Magier\n");
                this.playerClass = "Magier";
                break;
            case 3:
                System.out.println("Du bist nun also ein Dieb\n");
                this.playerClass = "Dieb";
                break;
            case 4:
                System.out.println("Du bist nun also ein Schütze\n");
                this.playerClass = "Schütze";
                break;
            default:
                System.out.println("Irgendwas stimmt hier nicht...");
                break;
        }
    }

    private void wrongInput(){
        System.out.println("Kannst du mal was Gescheites eingeben du H0nda!!");
        System.out.println("Pass mal besser auf ey");
        return;
    }

    //Rückgabe des Spielernamen (Emre-09.06.2021)
    public String gibName()
    {
        return this.name;
    }
}
