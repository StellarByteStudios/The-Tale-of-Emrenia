package maingame;
import maingame.newstuff.Player;

import java.util.Scanner;

public class Main {

    public static void main(String[] in){
        Scanner scaner = new Scanner(System.in);
        System.out.println("Es läuft wohooo");
        System.out.println("Fangen wir mit den Grundlagen an");
        Player player = new Player();
        System.out.println("Gib erstmal deinen Namen an: ");
        player.setName(scaner.nextLine());
        System.out.println("So, nun kümmern wir uns um die Rasse");
        player.chooseRace();
        System.out.println("Zum Schluss jetzt noch die Klasse");
        player.chooseClass();

        System.out.println("Das hast du bisher jetzt erreicht");
        System.out.println(player.toString());
        System.out.println("\n Viel Spaß damit");
    }
}
