package maingame.oldstuff;

import maingame.oldstuff.Spieler;

public class Spielstart extends Spieler
{
    private String t;
    private int i;
    
    public Spielstart()
    {
        
    }
    
    public void Einfuhrung()
    {
        System.out.println("Willkommen bei KonsolenRPG !");
        System.out.println("Als erstes wird du einen Namen, Rasse und zum Schluss eine Klasse für deinen Helden bestimmen !");
        System.out.println("Fangen wir auch direkt an!");
        super.Name();
        System.out.println("Soo jetzt kommen wir zu den Rassen !");
        System.out.println("Es gibt aktuell folgende 3 Rassen: ");
        System.out.println("--> Menschen ");
        System.out.println("--> Elfen ");
        System.out.println("--> Dämonen");
        System.out.println("Jeder dieser 3 Rassen haben bestimmte Stärken in bestimmten Statuswerten");
        System.out.println("Es gibt folgende Statuswerte: ");
        System.out.println("LP: -> Lebenspunkte ");
        System.out.println("ST: -> Stärke(bestimmt wie stark Nahkampfattacken sind) ");
        System.out.println("IN: -> Intelligenz(bestimmt wie stark Magische Zauber wirken) ");
        System.out.println("GW: -> Geschwindigkeit(bestimmt wer zuerst angreifen darf und wie stark Fernkampwaffen sind) ");
        System.out.println("CH: -> Charisma(je höher deste bessere Preise kann man bei Händlern erzielen und erfolgreicher bei Überredungsversuche sein)");
        System.out.println("Der Grundwert beträgt 3");
        System.out.println("Die Menschen erhalten zusätzlich CH = +2 und bei IN = +3");
        System.out.println("Die Elfen erhalten zusätzlich IN = +2 und bei GW = +3");
        System.out.println("Die Dämonen erhalten zusätzlich LP = +2 und bei ST = +3");
        super.Rasse();
        super.info();
        System.out.println("Es gibt folgende Klasse: ");
        System.out.println("--> Krieger");
        System.out.println("--> Magier");
        System.out.println("--> Dieb");
        System.out.println("--> Schütze");
        System.out.println("Der Kieger gibt einen Bonus auf LP +3, ST +2, GW +1");
        System.out.println("Der Magier gibt einen Bonus auf IN + 3, GW +2, CH +1");
        System.out.println("Der Dieb gibt einen Bonus auf GW +3, CH +2, LP +1");
        System.out.println("Der Schütze gibt einen Bonus auf GW +3, IN +2, ST +1");
        super.Klassen();
        super.info2();
    }
}
