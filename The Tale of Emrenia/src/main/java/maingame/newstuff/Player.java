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

    public void changeName(String name){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Möchtest du deinen Namen ändern ?");
        System.out.println("(1) Ja !\n(2) Nein !");
        String in = scanner.next();
        int selection;
        try {
            selection = Integer.parseInt(in);
        } catch (NumberFormatException e){
            wrongInput();
            return;
        }
        switch (selection){
            case(2):
                System.out.println("Gut, dann halt nicht!");
                break;
            default:
                wrongInput();
                break;
            case(1):
                System.out.println("Wie willst du, wie man dich künftig nennt?");
                setName(scanner.next());
                break;
        }
    }

    //* - - - Veränderung der Werte des Players - - - */
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
                this.playerRace = "Mensch";
                this.intelligence += 3;
                this.charisma += 2;
                break;
            case 2:
                System.out.println("Du bist nun also elfischer Abstammung\n");
                this.playerRace = "Elf";
                this.intelligence += 2;
                this.speed += 3;
                break;
            case 3:
                System.out.println("Du bist nun also daemonischer Abstammung\n");
                this.playerRace = "Daemon";
                this.lifePoints += 2;
                this.strength += 3;
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
}
