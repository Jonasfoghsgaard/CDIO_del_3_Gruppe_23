import java.lang.*;

public class Controller {
    static Regler regler = new Regler();


    public static void main(String[] args) {

        Spiller.opretSpillere();
        SpillerKonto.opretKonto();


        for (int i = 0; i < regler.antalSpillere ; i++) {
            System.out.print("Navn: ");
            System.out.println(Spiller.spillerListe[i].getName());


            System.out.print("Alder: ");
            System.out.println(Spiller.spillerListe[i].getAlder());

            System.out.print("Konto: ");
            System.out.println(SpillerKonto.kontoListe[i].getPenge());
            System.out.println();

        }
    }
}


