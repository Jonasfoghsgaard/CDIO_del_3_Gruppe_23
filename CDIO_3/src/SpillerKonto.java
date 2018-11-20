import java.util.Scanner;
public class SpillerKonto {

    private int penge;

    public int getPenge() {

        return penge;
    }

    private SpillerKonto() {
        if (Controller.regler.antalSpillere == 2) {
            penge = 20;
        } else if (Controller.regler.antalSpillere == 3) {
            penge = 18;
        } else if (Controller.regler.antalSpillere == 4) {
            penge = 16;
        }
    }


    static SpillerKonto[] kontoListe = new SpillerKonto[Controller.regler.antalSpillere];

    static void opretKonto() {
        for (int i = 0; i < Controller.regler.antalSpillere; i++)
            kontoListe[i] = new SpillerKonto();
    }

}
