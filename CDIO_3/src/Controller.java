import java.lang.*;

public class Controller {
    static Regler regler = new Regler();
    static Felter felter = new Felter();
    static EjendomsKonto eKonto = new EjendomsKonto();


    public static void main(String[] args) {
        felter.opretFelter();
        Spiller.opretSpiller();
        SpillerKonto.opretKonto();
        eKonto.opretEjendomsKonto();
        Spillebræt spillebræt = new Spillebræt();



        for (int j = 0; j < 20; j++) { // udskift til while når kode er klar


        for (int i = 0; i < regler.antalSpillere ; i++) {




            System.out.print("Navn: ");  // Hvilken spillers tur det er
            System.out.println(Spiller.spillerListe[i].getName());
            System.out.print("Placering: "); // Hvor spilleren står.
            System.out.println(Spiller.spillerListe[i].getPlacering());
            spillebræt.spillerHandling(i, Spiller.spillerListe[i].getPlacering());
            System.out.print("felt: ");
            System.out.println(Felter.feltliste[Spiller.spillerListe[i].getPlacering()].info);
            System.out.print("Konto: ");
            System.out.println(SpillerKonto.kontoListe[i].getPenge());
            System.out.println("------------------------------------------");
            spillebræt.fåNyPlacering(i);




         //   for (int k = 0; k < 24; k++) {
         //       System.out.println(eKonto.konto[i].ejet[k]);
//
        //    }



        }



         //   System.out.print("Alder: ");
         //   System.out.println(Spiller.spillerListe[i].getAlder());

        }
    }
}


