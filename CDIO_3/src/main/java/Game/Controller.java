package Game;

import Entity.Spiller;

public class Controller {
    public static Regler regler = new Regler();
    public static Spiller[] spillere = new Spiller[regler.antalSpillere];


    public static void spillogik() {
        boolean spilSpillet = true;

        Spillebræt spillebræt = new Spillebræt();
        spillebræt.blok.felter.opretFelter();

        for (int i = 0; i < regler.antalSpillere; i++) {
            spillere[i] = new Spiller();
        }

        for (int s = 0; s < regler.antalSpillere; s++) {


            while (spilSpillet) {


                for (int i = 0; i < regler.antalSpillere; i++) {
                    int spiller = i;


                    spillebræt.fåNyPlacering(spiller);
                    int placering = spillere[i].getPlacering();

                    String info = spillebræt.blok.felter.feltliste[placering].info;


                    System.out.println(spillere[spiller].getName());
                    System.out.print("Placering: "); // Hvor spilleren står.
                    System.out.println(placering);
                    System.out.print("felt: ");
                    System.out.println(info);
                    spillebræt.spillerHandling(spiller, placering);
                    System.out.println("------------------------------------------");

                    spillere[i].setGamlePlacering(placering);

                }

                System.out.println("STATUS");
                for (int i = 0; i < regler.antalSpillere; i++) {
                    System.out.println("Entity.Spiller: " + (i + 1) + " " + spillere[i].getName() + " konto: " + spillere[i].sKonto.getPenge());
                }
                System.out.println("------------------------------------------");

                for (int i = 0; i < regler.antalSpillere; i++) {


                    if (spillere[i].sKonto.getPenge() < 0) {
                        spilSpillet = false;

                    }
                }
            }

        }


        int[] slutKonto = new int[4];
        for (int i = 0; i < regler.antalSpillere; i++) {

            slutKonto[i] = spillere[i].sKonto.getPenge();

            if (regler.antalSpillere < 3) {
                slutKonto[2] = 0;
                slutKonto[3] = 0;

            }
            if (regler.antalSpillere < 4) {
                slutKonto[3] = 0;
            }
        }

            if (slutKonto[0] > slutKonto[1] && slutKonto[0] > slutKonto[2] && slutKonto[0] > slutKonto[3]) {
                System.out.println("Vinderen af spillet er: " + spillere[0].getName());
            }


            if (slutKonto[1] > slutKonto[0] && slutKonto[1] > slutKonto[2] && slutKonto[1] > slutKonto[3]) {
                System.out.println("Vinderen af spillet er: " + spillere[1].getName());
            }


            if (slutKonto[2] > slutKonto[0] && slutKonto[2] > slutKonto[1] && slutKonto[2] > slutKonto[3]) {
                System.out.println("Vinderen af spillet er: " + spillere[2].getName());
            }


            if (slutKonto[3] > slutKonto[1] && slutKonto[3] > slutKonto[2] && slutKonto[3] > slutKonto[0]) {
                System.out.println("Vinderen af spillet er: " + spillere[3].getName());
            }


    }
}




