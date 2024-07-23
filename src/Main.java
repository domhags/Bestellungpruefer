import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stueckzahl;
        double einzelpreis;
        String bezeichnung;

        while (true) {
            System.out.println("Bitte geben Sie die Stückzahl als Ganzzahl ein:");
            String stueckzahlInput = scanner.nextLine();
            if (isInteger(stueckzahlInput)) {
                stueckzahl = Integer.parseInt(stueckzahlInput);
                break;
            } else {
                System.out.println("Ungültige Eingabe. Bitte geben Sie eine gültige Ganzzahl ein.");
            }
        }

        while (true) {
            System.out.println("Bitte geben Sie den Einzelpreis als Kommazahl ein:");
            String einzelpreisInput = scanner.nextLine();
            if (isDouble(einzelpreisInput)) {
                einzelpreis = Double.parseDouble(einzelpreisInput);
                break;
            } else {
                System.out.println("Ungültige Eingabe. Bitte geben Sie eine gültige Kommazahl ein.");
            }
        }

        System.out.println("Bitte geben Sie die Bezeichnung als String ein:");
        bezeichnung = scanner.nextLine();

        System.out.println("Bestellung:");
        System.out.println("Stückzahl: " + stueckzahl);
        System.out.println("Einzelpreis: " + einzelpreis);
        System.out.println("Bezeichnung: " + bezeichnung);
    }

    public static boolean isInteger(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isDouble(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
