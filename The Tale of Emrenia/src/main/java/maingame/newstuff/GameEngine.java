package maingame.newstuff;

import java.util.Scanner;

public class GameEngine {
    public static void startGame(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Es läuft wohooo");
        System.out.println("Fangen wir mit den Grundlagen an \n");
        Player player = new Player();
        System.out.println("Gib erstmal deinen Namen an: ");

        player.setName(scanner.nextLine());         //Name Fragen
        sarticifiedName(player);                    //Nochmal Fragen ob der Name richtig ist

        System.out.println("So, nun kümmern wir uns um die Rasse\n");
        chooseRace(player);
        sarticifiedRace(player);

        System.out.println("Zum Schluss jetzt noch die Klasse\n");
        chooseClass(player);
        sarticifiedClass(player);
        System.out.println("\nDas hast du bisher jetzt erreicht:\n");
        System.out.println(player.toString());
        System.out.println("\n Viel Spaß damit");
    }
    /* - - - Erstellung des Players - - - */
    //Rassenwahl
    public static void chooseRace(Player player){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Also welcher der 3 Rassen möchtest du angehören ?");
        System.out.println("(1) Menschen \n(2) Elfen \n(3) Dämonen");
        String in = scanner.next();
        int selection;
        try {
            selection = Integer.parseInt(in);
        } catch (NumberFormatException e){
            wrongInput();
            chooseRace(player);
            return;
        }
        switch (selection){
            case(1):
                player.setRace(1);
                break;
            case(2):
                player.setRace(2);
                break;
            case(3):
                player.setRace(3);
                break;
            default:
                wrongInput();
                chooseRace(player);
                return;
        }
        //--> Hier nochmal nachfragen, ob man sich sicher mit der Rasse ist. Andernfalls selbe Methode nochmal ausführen
    }
    //Klassenwahl
    public static void chooseClass(Player player){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Also welcher der 4 Klassen möchtest du angehören ?");
        System.out.println("(1) Krieger \n(2) Magier \n(3) Dieb \n(4) Schütze");
        String in = scanner.next();
        int selection;
        try {
            selection = Integer.parseInt(in);
        } catch (NumberFormatException e){
            wrongInput();
            chooseClass(player);
            return;
        }
        switch (selection){
            case(1):
                player.setClass(1);
                break;
            case(2):
                player.setClass(2);
                break;
            case(3):
                player.setClass(3);
                break;
            case(4):
                player.setClass(4);
                break;
            default:
                wrongInput();
                chooseClass(player);
                return;
        }
        //--> Hier nochmal nachfragen, ob man sich sicher mit der Klasse ist. Andernfalls selbe Methode nochmal ausführen
    }

    /* - - - Stat Changer - - - */
    public static void changeName(Player player){
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
            case(1):
                System.out.println("Wie willst du, wie man dich künftig nennt?");
                player.setName(scanner.next());
                break;
            case(2):
                System.out.println("Gut, dann halt nicht!");
                break;
            default:
                wrongInput();
                break;

        }
    }

    /* - - - Frager Methoden - - - */
    public static void sarticifiedName(Player player){
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Du heißt Momentan: " + player.name);
        System.out.println("Bist du zufrieden mit deinem Namen?");
        System.out.println("(1) Ja !\n(2) Nein !");
        String in = scanner.next();
        int selection;
        try {
            selection = Integer.parseInt(in);
        } catch (NumberFormatException e){
            wrongInput();
            sarticifiedName(player);
            return;
        }
        switch (selection){
            case(1):
                System.out.println("Schön, machen wir weiter!");
                break;
            case(2):
                System.out.println("Wie willst du, wie man dich künftig nennt?");
                player.setName(scanner.next());
                sarticifiedName(player);
                break;
            default:
                wrongInput();
                sarticifiedName(player);
                break;
        }
    }
    public static void sarticifiedRace(Player player){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bist du zufrieden mit deiner Rasse?");
        System.out.println("(1) Ja !\n(2) Nein !");
        String in = scanner.next();
        int selection;
        try {
            selection = Integer.parseInt(in);
        } catch (NumberFormatException e){
            wrongInput();
            sarticifiedRace(player);
            return;
        }
        switch (selection){
            case(1):
                System.out.println("Schön, machen wir weiter!");
                break;
            case(2):
                chooseRace(player);
                sarticifiedRace(player);
                break;
            default:
                wrongInput();
                sarticifiedRace(player);
                break;
        }
    }
    public static void sarticifiedClass(Player player){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bist du zufrieden mit deiner Klasse?");
        System.out.println("(1) Ja !\n(2) Nein !");
        String in = scanner.next();
        int selection;
        try {
            selection = Integer.parseInt(in);
        } catch (NumberFormatException e){
            wrongInput();
            sarticifiedClass(player);
            return;
        }
        switch (selection){
            case(1):
                System.out.println("Schön, machen wir weiter!");
                break;
            case(2):
                chooseClass(player);
                sarticifiedClass(player);
                break;
            default:
                wrongInput();
                sarticifiedClass(player);
                break;
        }
    }
    /* - - - Sonstige Hilfsmethoden - - - */
    private static void wrongInput(){
        System.out.println("Kannst du mal was Gescheites eingeben du H0nda!!");
        System.out.println("Pass mal besser auf ey");
        return;
    }
}
