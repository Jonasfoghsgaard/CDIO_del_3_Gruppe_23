import java.lang.*;

public class Controller {
    static Regler regler = new Regler();



    static Spiller[] spillere = new Spiller[regler.antalSpillere];

    public static void main(String[] args) {

        Spillebræt spillebræt = new Spillebræt();
        spillebræt.felter.opretFelter();

        for (int i = 0; i < regler.antalSpillere; i++) {
            spillere[i] = new Spiller();
        }

        for (int j = 0; j < 50; j++) { // udskift til while når kode er klar


            for (int i = 0; i < regler.antalSpillere; i++) {
                spillebræt.fåNyPlacering(i);
                System.out.println(spillere[i].getName());
                System.out.print("Placering: "); // Hvor spilleren står.
                System.out.println(spillere[i].getPlacering());
                System.out.print("felt: ");
                System.out.println(spillebræt.felter.feltliste[spillere[i].getPlacering()].info);
                spillebræt.spillerHandling(i, spillere[i].getPlacering());
                System.out.println("------------------------------------------");
            }
            System.out.println("STATUS");
            for (int i = 0; i < regler.antalSpillere; i++) {
                System.out.println("Spiller: " + (i + 1) + " " + spillere[i].getName() + " konto: " + spillere[i].sKonto.getPenge());
            }
            System.out.println("------------------------------------------");


        }

        for (int i = 0; i < 24; i++) {


            System.out.println(spillebræt.felter.feltliste[i].pris);
    }



          for (int i = 0; i <24 ; i++) {
                System.out.println(i + " " + spillere[0].sKonto.ejet[i]);
            }
            System.out.println();
            for (int i = 0; i <24 ; i++) {
                System.out.println(i + " " + spillere[1].sKonto.ejet[i]);
                }


        }


}






