import java.util.Scanner;

public class Main {

    /*
    Hier sollte ein wichtiges Kommentar stehen :)
     */

    public static void main(String[] args) {

        Scanner eingabewert = new Scanner(System.in);

        System.out.println("Bitte Vorname des Benutzers eingeben: ");
        String vorname = eingabewert.nextLine();

        System.out.println("Bitte Nachname des Benutzers eingeben: ");
        String nachname = eingabewert.nextLine();

        System.out.println("Bitte Alter des Benutzeres eingeben: ");
        int Alter = eingabewert.nextInt();

        System.out.println("Der Benutzer " + vorname + " " + nachname + " ist aktuell " + Alter + " Jahre alt und würde gerne in Zukunft eine Achterbahn benutzen.");
        System.out.println("Die Achterbahn darf nur im Alter zwischen 16 und 60 Jahren genutzt werden.");
        System.out.println("Darf der Benutzer in ... Jahren die Achterbahn (noch) benutzen?");
        System.out.println("Bitte Jahr eingeben: ");
        int Jahr = eingabewert.nextInt();
        Alter = Alter +Jahr;
        System.out.println("----");
        System.out.println("In " + Jahr + " Jahren wird der Benutzer " + vorname + " " + nachname + " " + Alter + " Jahre alt sein." );

        if (Alter > 16 && Alter < 60) {
            System.out.println("Der Benutzer " + vorname + " " + nachname + " darf die Achterbahn benutzen.");
        } else {
            System.out.println("Der Benutzer " + vorname + " " + nachname + " darf die Achterbahn NICHT benutzen.");
        }




    }


}
