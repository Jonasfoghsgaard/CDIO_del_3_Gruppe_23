public class Spillebræt {

    Transaktioner transaktioner = new Transaktioner();
    Terning terning = new Terning();
    int[] spillebræt = new int[24];
    private int feltPlacering;





    // Spillebræt(){
    //   for (int i = 0; i <Controller.regler.antalSpillere ; i++) {
    //       spillebræt[Spiller.spillerListe[i].getPlacering()] = feltPlacering;
    //   }
    //  }

   int nyPlacering;

   void fåNyPlacering(int spiller){

           terning.slåMedTerning();
       System.out.print("Terningeslag: ");
       System.out.println(terning.getØjne());

           Spiller.spillerListe[spiller].setPlacering(Spiller.spillerListe[spiller].getPlacering() + terning.getØjne());
           if (Spiller.spillerListe[spiller].getPlacering() > 24) { // måske 23
               Spiller.spillerListe[spiller].setPlacering(Spiller.spillerListe[spiller].getPlacering()-24);
               transaktioner.passerStart(spiller);
           }


       }


   }






