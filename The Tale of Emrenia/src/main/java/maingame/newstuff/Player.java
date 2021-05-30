package maingame.newstuff;


import java.util.Scanner;

public class Player {

    public String name, playerRace, playerClass;
    public int lifePoints, strength, intelligence, speed, charisma;


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

    public void changeName(String name){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Du möchtest deinen Namen ändern");
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
    public void chooseRace(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Also welcher der 3 Rassen möchtest du angehören ?");
        System.out.println("(1) Menschen \n(2) Elfen \n(3) Dämonen");
        String in = scanner.next();
        int selection;
        try {
            selection = Integer.parseInt(in);
        } catch (NumberFormatException e){
            wrongInput();
            chooseRace();
            return;
        }
        switch (selection){
            case(1):
                setRace(1);
                break;
            case(2):
                setRace(2);
                break;
            case(3):
                setRace(3);
                break;
            default:
                wrongInput();
                chooseRace();
                return;
        }
    }
    public void chooseClass(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Also welcher der 4 Klassen möchtest du angehören ?");
        System.out.println("(1) Krieger \n(2) Magier \n(3) Dieb \n(4) Schütze");
        String in = scanner.next();
        int selection;
        try {
            selection = Integer.parseInt(in);
        } catch (NumberFormatException e){
            wrongInput();
            chooseClass();
            return;
        }
        switch (selection){
            case(1):
                setClass(1);
                break;
            case(2):
                setClass(2);
                break;
            case(3):
                setClass(3);
                break;
            case(4):
                setClass(4);
                break;
            default:
                wrongInput();
                chooseClass();
                return;
        }
    }

    private void wrongInput(){
        System.out.println("Kannst du mal was Gescheites eingeben du H0nda!!");
        System.out.println("Pass mal besser auf ey");
        return;
    }

    public void setName(String name){
        this.name = name;
        System.out.println("Dein neuer Name ist nun " + name);
        System.out.println("Viel Spaß auf deinem weiteren Abenteuer");
        return;
    }
    public void setRace(int selection){
        switch (selection) {
            case 1:
                System.out.println("Du bist nun also menschlicher Abstammung");
                this.playerRace = "Mensch";
                this.intelligence += 3;
                this.charisma += 2;
                break;
            case 2:
                System.out.println("Du bist nun also elfischer Abstammung");
                this.playerRace = "Elf";
                this.intelligence += 2;
                this.speed += 3;
                break;
            case 3:
                System.out.println("Du bist nun also daemonischer Abstammung");
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
                System.out.println("Du bist nun also ein Krieger");
                this.playerClass = "Krieger";
                break;
            case 2:
                System.out.println("Du bist nun also ein Magier");
                this.playerClass = "Magier";
                break;
            case 3:
                System.out.println("Du bist nun also ein Dieb");
                this.playerClass = "Dieb";
                break;
            case 4:
                System.out.println("Du bist nun also ein Schütze");
                this.playerClass = "Schütze";
                break;
            default:
                System.out.println("Irgendwas stimmt hier nicht...");
                break;
        }
    }
}
