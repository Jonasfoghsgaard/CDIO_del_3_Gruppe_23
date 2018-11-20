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
}






