import java.util.Scanner;

public class Spiller {
    Scanner scanner = new Scanner(System.in);
    private String name = "";
    private int alder;
    private boolean lossCondition;
    private int placering;
    private int feltplacering;


    String getName() {return name; }
    int getAlder() {return alder;}
    int getPlacering() { return placering;}

    public void setPlacering(int placering) {
        this.placering = placering;
    }

    private Spiller() {
        System.out.println("Indtast navn: ");
        name = scanner.nextLine();

        System.out.println("Indtast alder: ");
        alder = 21;
       // alder = scanner.nextInt();

        while (alder < 10 || alder > 100) {

            if (alder < 10) {
                System.out.println("Du er for ung til at spille Monopoly Junior");
                System.out.println("Indtast ny alder: ");
                alder = scanner.nextInt();
            }

            if (alder > 100){
                System.out.println("Du er for gammel til at spille Monopoly Junior");
                System.out.println("Indtast ny alder: ");
                alder = scanner.nextInt();
            }

        }




        placering = 0;


    }

    static Spiller[] spillerListe = new Spiller[Controller.regler.antalSpillere];

    static void opretSpiller() {
        for (int i = 0; i < Controller.regler.antalSpillere; i++) {
            spillerListe[i] = new Spiller();
        }

    }

}



