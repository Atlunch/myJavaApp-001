import java.util.Scanner;


public class Main {

    /*
    Hier sollte ein wichtiges Kommentar stehen :)
     */

    public static int sum(int value_age, int value_year) {
        return value_age + value_year;
    }


    public static String check_age(int value_age, String value_name, String value_surname) {

        String message;

        if (value_age >= 16 && value_age <= 60) {
                message = "Der Benutzer " + value_name + " " + value_surname + " darf die Achterbahn benutzen.";
            } else {
                message = "Der Benutzer " + value_name + " " + value_surname + " darf die Achterbahn NICHT benutzen.";
            }

        return message;
    }



    public static void main(String[] args) {

        Scanner input_value = new Scanner(System.in);

        System.out.println("Bitte Vorname des Benutzers eingeben: ");
        String name = input_value.nextLine();

        System.out.println("Bitte Nachname des Benutzers eingeben: ");
        String surname = input_value.nextLine();

        System.out.println("Bitte Alter des Benutzers eingeben: ");
        int age = input_value.nextInt();

        System.out.println("Der Benutzer " + name + " " + surname + " ist aktuell " + age + " Jahre alt und würde gerne in Zukunft eine Achterbahn benutzen.");
        System.out.println("Die Achterbahn darf nur im Alter zwischen 16 und 60 Jahren genutzt werden.");
        System.out.println("Darf der Benutzer in ... Jahren die Achterbahn (noch) benutzen?");
        System.out.println("Bitte Jahr eingeben: ");

        int Jahr = input_value.nextInt();
        age = sum(age,Jahr);

        System.out.println("----");
        System.out.println("In " + Jahr + " Jahren wird der Benutzer " + name + " " + surname + " " + age + " Jahre alt sein." );

        System.out.println(check_age(age,name,surname));

    }

}


