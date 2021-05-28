package maingame.oldstuff;

import java.util.Scanner;

public class Spieler
{
    private String spielername, rasse, klasse;
    private int LP = 3, ST = 3, IN = 3, GW = 3, CH = 3;
    
    public Spieler()
    {
        
    }
    
    public void Name()
    {
            int i;
            System.out.println("Wie lautet dein Name ?");
            System.out.println("Achtung alles ab einem Leerzeichen wird nicht als Name angenommen!");
            Scanner scan = new Scanner(System.in);
            spielername = scan.next();
            System.out.println("Ahh du heißt also " + spielername + " ?");
            System.out.println("(1) Ja !");
            System.out.println("(2) Nein !");
            Scanner scan1 = new Scanner(System.in);
            scan1 = new Scanner(System.in);
            i = scan1.nextInt();
        
            if(i == 1)
            {
                System.out.println(spielername + " ist auch ein wirklich schöner Name !");
            }
            else if(i == 2)
            {
                System.out.println("Ohh du heißt also gar nicht " + spielername + " ?");
                Name();
            }
            else
            {
                System.out.println("Bitte eine der obrigen Optionen eintippen !");
                Name();
            }
            
    }
    
    public void Rasse()
    {
            int i;
            System.out.println("Also welcher der 3 Rassen möchtest du angehören ?");
            System.out.println("(1) Menschen");
            System.out.println("(2) Elfen");
            System.out.println("(3) Dämonen");
            Scanner scan1 = new Scanner(System.in);
            scan1 = new Scanner(System.in);
            i = scan1.nextInt();
            if(i == 1)
            {
                System.out.println("Ah du bist also ein Mensch !");
                System.out.println("(1) Ja!");
                System.out.println("(2) Nein!");
                scan1 = new Scanner(System.in);
                i = scan1.nextInt();
                if(i == 1)
                {
                    System.out.println("Sehr gut!");
                    CH += 2;
                    IN += 3;
                    rasse = "Mensch";
                }
                else if(i == 2)
                {
                    System.out.println("Nein ? Nun gut.");
                    Rasse();
                }
                else
                {
                    System.out.println("Bitte eine der obrigen Optionen wählen!");
                    Rasse();
                }
            }
            else if(i == 2)
            {
                System.out.println("Ah du bist also ein Elf!");
                System.out.println("(1) Ja!");
                System.out.println("(2) Nein!");
                scan1 = new Scanner(System.in);
                i = scan1.nextInt();
                if(i == 1)
                {
                    System.out.println("Sehr gut!");
                    IN += 2;
                    GW += 3;
                    rasse = "Elf";
                }
                else if(i == 2)
                {
                    System.out.println("Nein ? Nun gut.");
                    Rasse();
                }
                else
                {
                    System.out.println("Bitte eine der obrigen Optionen wählen!");
                    Rasse();
                }
            }
            else if(i == 3)
            {
                System.out.println("Ah du bist also ein Dämon !");
                System.out.println("(1) Ja!");
                System.out.println("(2) Nein!");
                scan1 = new Scanner(System.in);
                i = scan1.nextInt();
                if(i == 1)
                {
                    System.out.println("Sehr gut!");
                    LP += 2;
                    ST += 3;
                    rasse = "Dämon";
                }
                else if(i == 2)
                {
                    System.out.println("Nein ? Nun gut.");
                    Rasse();
                }
                else
                {
                    System.out.println("Bitte eine der obrigen Optionen wählen!");
                    Rasse();
                }
            }
            else
                {
                    System.out.println("Bitte eine der obrigen Optionen wählen!");
                    Rasse();
                }
            }
            public void info()
            {
                int i;
                System.out.println("Hier die aktuelle Info: ");
                System.out.println("Name: " + spielername);
                System.out.println("Rasse: " + rasse);
                System.out.println("LP: " + LP);
                System.out.println("ST: " + ST);
                System.out.println("IN: " + IN);
                System.out.println("GW: " + GW);
                System.out.println("CH: " + CH);
                System.out.println("Möchtest du etwas ändern ?");
                System.out.println("(1) Name");
                System.out.println("(2) Rasse");
                System.out.println("(3) Nein alles gut so !");
                Scanner scan1 = new Scanner(System.in);
                scan1 = new Scanner(System.in);
                i = scan1.nextInt();
                if(i == 1)
                {
                    Name();
                    info();
                }
                else if(i == 2 )
                {
                    LP = 3;
                    ST = 3;
                    IN = 3;
                    GW = 3;
                    CH = 3;
                    Rasse();
                    info();
                }
                else if(i == 3)
                {
                    System.out.println("Sehr schön ! Dann kommen wir jetzt zu den Klasse !");
                }
                else
                {
                    System.out.println("Bitte eine der obrigen Optionen wählen !");
                    info();
                }
            }
            
       public void Klassen()
       {
            int i;
            System.out.println("Also welcher der 4 Klasse möchtest du angehören ?");
            System.out.println("(1) Krieger");
            System.out.println("(2) Magier");
            System.out.println("(3) Dieb");
            System.out.println("(4) Schütze");
            Scanner scan1 = new Scanner(System.in);
            scan1 = new Scanner(System.in);
            i = scan1.nextInt();
            if(i == 1)
            {
                System.out.println("Ah du bist also ein Krieger !");
                System.out.println("(1) Ja!");
                System.out.println("(2) Nein!");
                scan1 = new Scanner(System.in);
                i = scan1.nextInt();
                if(i == 1)
                {
                    System.out.println("Sehr gut!");
                    LP += 3;
                    ST += 2;
                    GW += 1;
                    klasse = "Krieger";
                }
                else if(i == 2)
                {
                    System.out.println("Nein ? Nun gut.");
                    Klassen();
                }
                else
                {
                    System.out.println("Bitte eine der obrigen Optionen wählen!");
                    Klassen();
                }
            }
            else if(i == 2)
            {
                System.out.println("Ah du bist also ein Magier !");
                System.out.println("(1) Ja!");
                System.out.println("(2) Nein!");
                scan1 = new Scanner(System.in);
                i = scan1.nextInt();
                if(i == 1)
                {
                    System.out.println("Sehr gut!");
                    IN += 3;
                    GW += 2;
                    CH += 1;
                    klasse = "Magier";
                }
                else if(i == 2)
                {
                    System.out.println("Nein ? Nun gut.");
                    Klassen();
                }
                else
                {
                    System.out.println("Bitte eine der obrigen Optionen wählen!");
                    Klassen();
                }
            }
            else if(i == 3)
            {
                System.out.println("Ah du bist also ein Dieb !");
                System.out.println("(1) Ja!");
                System.out.println("(2) Nein!");
                scan1 = new Scanner(System.in);
                i = scan1.nextInt();
                if(i == 1)
                {
                    System.out.println("Sehr gut!");
                    CH += 2;
                    GW += 3;
                    LP += 1;
                    klasse = "Dieb";
                }
                else if(i == 2)
                {
                    System.out.println("Nein ? Nun gut.");
                    Klassen();
                }
                else
                {
                    System.out.println("Bitte eine der obrigen Optionen wählen!");
                    Klassen();
                }
            }
            else if(i == 4)
            {
                System.out.println("Ah du bist also ein Schütze !");
                System.out.println("(1) Ja!");
                System.out.println("(2) Nein!");
                scan1 = new Scanner(System.in);
                i = scan1.nextInt();
                if(i == 1)
                {
                    System.out.println("Sehr gut!");
                    IN += 2;
                    GW += 3;
                    ST += 1;
                    klasse = "Schütze";
                }
                else if(i == 2)
                {
                    System.out.println("Nein ? Nun gut.");
                    Klassen();
                }
                else
                {
                    System.out.println("Bitte eine der obrigen Optionen wählen!");
                    Klassen();
                }
            }
            else
                {
                    System.out.println("Bitte eine der obrigen Optionen wählen!");
                    Rasse();
                }
       }
       
       public void info2()
            {
                int i;
                System.out.println("Hier die aktuelle Info: ");
                System.out.println("Name: " + spielername);
                System.out.println("Rasse: " + rasse);
                System.out.println("Klasse: " + klasse);
                System.out.println("LP: " + LP);
                System.out.println("ST: " + ST);
                System.out.println("IN: " + IN);
                System.out.println("GW: " + GW);
                System.out.println("CH: " + CH);
                System.out.println("Möchtest du etwas ändern ?");
                System.out.println("(1) Name");
                System.out.println("(2) Rasse");
                System.out.println("(3) Klasse");
                System.out.println("(4) Nein alles gut so !");
                Scanner scan1 = new Scanner(System.in);
                scan1 = new Scanner(System.in);
                i = scan1.nextInt();
                if(i == 1)
                {
                    Name();
                    info2();
                }
                else if(i == 2 )
                {
                    if(rasse == "Mensch")
                    {
                        CH -= 2;
                        IN -= 3;
                    }
                    else if(klasse == "Elf")
                    {
                        IN -= 2;
                        GW -= 3;
                    }
                    else if(klasse == "Dämon")
                    {
                        ST -= 3;
                        LP -= 2;
                    }
                    Rasse();
                    info2();
                }
                else if(i == 3 )
                {
                    if(klasse == "Krieger")
                    {
                        LP -= 3;
                        ST -= 2;
                        GW -= 1;
                    }
                    else if(klasse == "Magier")
                    {
                        IN -= 3;
                        GW -= 2;
                        CH -= 1;
                    }
                    else if(klasse == "Dieb")
                    {
                        GW -= 3;
                        CH -= 2;
                        LP -= 1;
                    }
                    else if(klasse == "Schütze")
                    {
                        GW -= 3;
                        IN -= 2;
                        ST -= 1;
                    }
                    Klassen();
                    info2();
                }
                else if(i == 4)
                {
                    System.out.println("Sehr schön ! Das wars auch schon !");
                }
                else
                {
                    System.out.println("Bitte eine der obrigen Optionen wählen !");
                    info2();
                }
            }
}
