import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        System.out.println("Hallo Kurs! Was geeeeeeht");

        String vorname = "Rikardo";
        String nachname = "Marenzzi";
        int Alter = 28;

        Scanner eingabewert = new Scanner(System.in);

        System.out.println("Der Benutzer " + vorname + " " + nachname + " ist aktuell" + Alter + " Jahre alt.");
        System.out.println("Wie Alt wird der Benutzer in ... Jahren sein?");
        System.out.println("Bitte Jahr eingeben: ");
        int Jahr = eingabewert.nextInt();
        Alter = Alter +Jahr;
        System.out.println("----");
        System.out.println("In " + Jahr + " Jahren wird der Benutzer " + vorname + " " + nachname + " " + Alter + " Jahre alt sein." );


    }


}
