import java.lang.*;

public class Controller {
    static Regler regler = new Regler();
    static Felter felter = new Felter();


    public static void main(String[] args) {
        felter.opretFelter();
        Spiller.opretSpiller();
        SpillerKonto.opretKonto();
        Spillebræt spillebræt = new Spillebræt();



        for (int j = 0; j < 10; j++) {


        for (int i = 0; i < regler.antalSpillere ; i++) {
            System.out.print("Navn: ");
            System.out.println(Spiller.spillerListe[i].getName());
            System.out.print("Placering: ");
            System.out.println(Spiller.spillerListe[i].getPlacering());
            spillebræt.fåNyPlacering(i);
            Transaktioner.betalTilBank(i, Felter.feltliste[Spiller.spillerListe[i].getPlacering()].pris);
            System.out.print("felt: ");
            System.out.println(Felter.feltliste[Spiller.spillerListe[i].getPlacering()].info);
            // SpillerKonto.kontoListe[i].setPenge(Felter.feltliste[Spiller.spillerListe[i].getPlacering()].pris);
            System.out.print("Konto: ");
            System.out.println(SpillerKonto.kontoListe[i].getPenge());
            System.out.println("----------------------------------------------------------");
        }




         //   System.out.print("Alder: ");
         //   System.out.println(Spiller.spillerListe[i].getAlder());

        }
    }
}


