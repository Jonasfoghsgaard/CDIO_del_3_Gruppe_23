package Game;

import Entity.Terning;
import Entity.Transaktioner;
import Fields.Farveblokke;

import Entity.Terning;
import Entity.Transaktioner;
import Fields.Farveblokke;

public class Spillebræt {


    Farveblokke blok = new Farveblokke();


    private Transaktioner transaktioner = new Transaktioner();
    private Terning terning = new Terning();


    void fåNyPlacering(int spiller) {
        terning.slåMedTerning();


        Controller.spillere[spiller].setPlacering(Controller.spillere[spiller].getPlacering()+ terning.getØjne());


        if (Controller.spillere[spiller].getPlacering() > 23) {
            Controller.spillere[spiller].setPlacering(Controller.spillere[spiller].getPlacering() - 24);
        }


        if (Controller.spillere[spiller].getPlacering()< Controller.spillere[spiller].getgamlePlacering()){
            transaktioner.passerStart(spiller);
            System.out.println("Du får 2 penge nu.");
        }
    }


    void spillerHandling(int spiller, int placering) {




     /*   if (Game.Controller.spillere[spiller].alleredeIFængsel == true) {
            placering = 6;
            Game.Controller.spillere[spiller].setPlacering(6);
            Entity.Transaktioner.betalTilBank(spiller, 5);
            Game.Controller.spillere[spiller].alleredeIFængsel = false;
        }
*/



        if (blok.felter.feltliste[placering].ejendomsFelt == true) {

            if (blok.felter.feltliste[placering].købt == true) {  // Betaler husleje
                for (int i = 0; i < Controller.regler.antalSpillere; i++) {
                    if (Controller.spillere[i].sKonto.ejet[placering] == true) {
                        blok.ejerBeggeGrunde();
                        Transaktioner.betalPenge(spiller, i, blok.felter.feltliste[placering].pris);
                    }
                }
            }

            else // (Felter.Felter.feltliste[placering].købt == false)
            { // Køber felt
                Transaktioner.betalTilBank(spiller, blok.felter.feltliste[placering].pris);
                blok.felter.feltliste[placering].købt = true;
                Controller.spillere[spiller].sKonto.ejet[placering] = true;
            }
        }



        if (blok.felter.feltliste[placering].gåIFængsel == true) { // er på fængselfelt
          /*  if (Game.Controller.spillere[spiller].alleredeIFængsel == false) {
                Game.Controller.spillere[spiller].alleredeIFængsel = true;
                Game.Controller.spillere[spiller].setPlacering(6);
            }
            */


        } else if (blok.felter.feltliste[placering].chanceFelt == true) {
            Controller.spillere[spiller].trækChancekort(spiller);

            if (Controller.spillere[spiller].getPlacering() != Controller.spillere[spiller].getgamlePlacering() ) {


                if (Controller.spillere[spiller].getPlacering() > 23) {
                    Controller.spillere[spiller].setPlacering(Controller.spillere[spiller].getPlacering() - 24);
                    spillerHandling(spiller, Controller.spillere[spiller].getPlacering());


                    System.out.print("felt: ");
                }
                System.out.println(blok.felter.feltliste[Controller.spillere[spiller].getPlacering()].info);
                System.out.print("Placering: "); // Hvor spilleren står.
                System.out.println(Controller.spillere[spiller].getPlacering());


            }


        } else if (blok.felter.feltliste[placering].ingenHandling == true) {

        } else if (blok.felter.feltliste[placering].startFelt == true) {

        }

    }
}





