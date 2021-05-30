package maingame.newstuff;

import java.util.Scanner;

public class GameEngine {
    public static void startGame(){
        Scanner scaner = new Scanner(System.in);
        System.out.println("Es läuft wohooo");
        System.out.println("Fangen wir mit den Grundlagen an");
        Player player = new Player();
        System.out.println("Gib erstmal deinen Namen an: ");
        player.setName(scaner.nextLine());
        System.out.println("So, nun kümmern wir uns um die Rasse");
        chooseRace(player);
        System.out.println("Zum Schluss jetzt noch die Klasse");
        player.chooseClass();

        System.out.println("Das hast du bisher jetzt erreicht");
        System.out.println(player.toString());
        System.out.println("\n Viel Spaß damit");
    }

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
    }
    private static void wrongInput(){
        System.out.println("Kannst du mal was Gescheites eingeben du H0nda!!");
        System.out.println("Pass mal besser auf ey");
        return;
    }
}
