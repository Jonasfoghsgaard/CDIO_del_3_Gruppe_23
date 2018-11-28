public class Spillebræt {

    private Transaktioner transaktioner = new Transaktioner();
    private Terning terning = new Terning();



    void fåNyPlacering(int spiller) {
        terning.slåMedTerning();
        //System.out.print("Terningeslag: ");
        //System.out.println(terning.getØjne());
        Spiller.spillerListe[spiller].setPlacering(Spiller.spillerListe[spiller].getPlacering() + terning.getØjne());
        if (Spiller.spillerListe[spiller].getPlacering() > 23) {
            Spiller.spillerListe[spiller].setPlacering(Spiller.spillerListe[spiller].getPlacering() - 24);
            transaktioner.passerStart(spiller);
        }
    }


    void spillerHandling(int spiller, int placering) {

        if (Felter.feltliste[placering].ejendomsFelt == true) {

            if (Felter.feltliste[placering].købt == false) { // Køber felt
                Felter.feltliste[placering].købt = true;
                Controller.eKonto.konto[spiller].ejet[placering] = true;
                Transaktioner.betalTilBank(spiller, Felter.feltliste[placering].pris);
                fåNyPlacering(spiller);
            } else if (Felter.feltliste[placering].købt == true) {  // Betaler husleje
                for (int i = 0; i < Controller.regler.antalSpillere; i++) {
                    if (Controller.eKonto.konto[i].ejet[placering] == true) {
                        Transaktioner.betalPenge(spiller, i, Felter.feltliste[placering].pris);
                        fåNyPlacering(spiller);
                    }
                }

            }

        }


        if (Felter.feltliste[placering].gåIFængsel == true) { // er på fængselfelt


            if (Spiller.spillerListe[spiller].alleredeIFængsel == false) { // har været i fængsel i en hel runde


                // er lige landet i fængsel
                Spiller.spillerListe[spiller].alleredeIFængsel = true;
                Spiller.spillerListe[spiller].setPlacering(6);

            }


        } else if (Felter.feltliste[placering].chanceFelt == true) {
            fåNyPlacering(spiller);
        } else if (Felter.feltliste[placering].ingenHandling == true) {
            fåNyPlacering(spiller);
        } else if (Felter.feltliste[placering].startFelt == true) {
            fåNyPlacering(spiller);
        }
         if (Felter.feltliste[placering].besøgIFængsel == true){
             if (Spiller.spillerListe[spiller].alleredeIFængsel == true) { // har været i fængsel i en hel runde

                 Transaktioner.betalTilBank(spiller, 1);
                 fåNyPlacering(spiller);
                 Spiller.spillerListe[spiller].alleredeIFængsel = false;

             }
             else {
                 fåNyPlacering(spiller);
             }
         }
    }
}






