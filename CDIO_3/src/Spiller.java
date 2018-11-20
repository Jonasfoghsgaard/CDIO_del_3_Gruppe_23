import java.util.Scanner;

public class Spiller {
    Scanner scanner = new Scanner(System.in);
    private String name = "";
    private int alder;



    String getName() {return name; }
    int getAlder() {return alder;}


    private Spiller() {

        System.out.println("Indtast navn: ");
        name = scanner.nextLine();

        System.out.println("Indtast Alder: ");
        alder = scanner.nextInt();
    }

    static Spiller[] spillerListe = new Spiller[Controller.regler.antalSpillere];

    static void opretSpillere() {
        for (int i = 0; i < Controller.regler.antalSpillere; i++) {
            spillerListe[i] = new Spiller();
        }

    }
}



