public class Spillebræt {

    Felter felter = new Felter();


    private Transaktioner transaktioner = new Transaktioner();
    private Terning terning = new Terning();


    void fåNyPlacering(int spiller) {
        terning.slåMedTerning();



        //System.out.print("Terningeslag: ");
        //System.out.println(terning.getØjne());


       Controller.spillere[spiller].setPlacering(Controller.spillere[spiller].getPlacering()+ terning.getØjne());
        if (Controller.spillere[spiller].getPlacering() > 23) {
            Controller.spillere[spiller].setPlacering(Controller.spillere[spiller].getPlacering() - 24);
            transaktioner.passerStart(spiller);
            System.out.println("Du får 2 penge nu.");
        }
    }


    void spillerHandling(int spiller, int placering) {


        if (felter.feltliste[placering].ejendomsFelt == true) {

            if (felter.feltliste[placering].købt == true) {  // Betaler husleje
                for (int i = 0; i < Controller.regler.antalSpillere; i++) {
                    if (Controller.spillere[i].sKonto.ejet[placering] == true) {
                        felter.ejerBeggeGrunde();
                        Transaktioner.betalPenge(spiller, i, felter.feltliste[placering].pris);
                    }
                }
            }

            else // (Felter.feltliste[placering].købt == false)
                 { // Køber felt
                Transaktioner.betalTilBank(spiller, felter.feltliste[placering].pris);
                felter.feltliste[placering].købt = true;
                Controller.spillere[spiller].sKonto.ejet[placering] = true;

            }

        }


        if (felter.feltliste[placering].gåIFængsel == true) { // er på fængselfelt
            if (Controller.spillere[spiller].alleredeIFængsel == false) {
                Controller.spillere[spiller].alleredeIFængsel = true;
                Controller.spillere[spiller].setPlacering(6);
            }



        } else if (felter.feltliste[placering].chanceFelt == true) {

        } else if (felter.feltliste[placering].ingenHandling == true) {

        } else if (felter.feltliste[placering].startFelt == true) {

        }
        if (felter.feltliste[placering].besøgIFængsel == true) {
            if (Controller.spillere[spiller].alleredeIFængsel == true) { // har været i fængsel i en hel runde

                Transaktioner.betalTilBank(spiller, 1);

                Controller.spillere[spiller].alleredeIFængsel = false;

            }
        }
    }
}





