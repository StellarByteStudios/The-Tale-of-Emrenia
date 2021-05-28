package maingame;
import maingame.newstuff.Player;

import java.util.Scanner;

public class Main {

    public static void main(String[] in){
        Scanner scaner = new Scanner(System.in);
        System.out.println("Es läuft wohooo");
        System.out.println("Fangen wir an");
        System.out.println("Gib deinen Namen an: ");
        String name = scaner.next();
        Player player = new Player(name);
        System.out.println(player.toString());
        System.out.println("\n Viel Spaß damit");
    }
}
