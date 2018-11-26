public class Spillebræt {

    private Transaktioner transaktioner = new Transaktioner();
    private Terning terning = new Terning();








   void fåNyPlacering(int spiller){
           terning.slåMedTerning();
       //System.out.print("Terningeslag: ");
       //System.out.println(terning.getØjne());
           Spiller.spillerListe[spiller].setPlacering(Spiller.spillerListe[spiller].getPlacering() + terning.getØjne());
           if (Spiller.spillerListe[spiller].getPlacering() > 23) {
               Spiller.spillerListe[spiller].setPlacering(Spiller.spillerListe[spiller].getPlacering()-24);
               transaktioner.passerStart(spiller);
           }
       }



       void spillerHandling (int spiller, int placering){

       if (Felter.feltliste[placering].ejendomsFelt == true) {

           if (Felter.feltliste[placering].købt == false) {
               Felter.feltliste[placering].købt = true;
               Controller.eKonto.konto[spiller].ejet[placering] = true;
               Transaktioner.betalTilBank(spiller, Felter.feltliste[placering].pris);
           }

           else if (Felter.feltliste[placering].købt == true) {

               for (int i = 0; i < Controller.regler.antalSpillere ; i++) {
                   if (Controller.eKonto.konto[i].ejet[placering] == true){
                       Transaktioner.betalPenge(spiller, i, Felter.feltliste[placering].pris);
                   }
               }

           }







       }





       }








}






