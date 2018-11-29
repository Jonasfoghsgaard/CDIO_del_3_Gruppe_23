package Fields;

import Game.Controller;

public class Farveblokke {

    public Felter felter = new Felter();

        public void ejerBeggeGrunde() { // tjekker om en spiller ejer begge grunde.

        for (int i = 0; i < Controller.regler.antalSpillere; i++) {

            if (Controller.spillere[i].sKonto.ejet[1] == true && Controller.spillere[i].sKonto.ejet[2] == true) {
                felter.feltliste[1].pris = 2;
                felter.feltliste[2].pris = 2;
                felter.feltliste[1].info = " Doouble cheeesss til den ekstra priiis! Koster 2";
                felter.feltliste[2].info = "Pizzaen smagte utrolig godt og du valgte at betale dobbelt. Koster 2.";
            }

            if (Controller.spillere[i].sKonto.ejet[4] == true && Controller.spillere[i].sKonto.ejet[5] == true) {
                felter.feltliste[4].pris = 2;
                felter.feltliste[5].pris = 2;
                felter.feltliste[4].info = "Slik mums. Koster 2";
                felter.feltliste[5].info = " Is mums. Koster 2";
            }
            if (Controller.spillere[i].sKonto.ejet[7] == true && Controller.spillere[i].sKonto.ejet[8] == true) {
                felter.feltliste[7].pris = 4;
                felter.feltliste[8].pris = 4;
                felter.feltliste[7].info = "Museet koster dobbelt op. Bad luck betal 4";
                felter.feltliste[8].info = " Du har glemt at aflevere dine bøge på biblo, betal 4";
            }
            if (Controller.spillere[i].sKonto.ejet[10] == true && Controller.spillere[i].sKonto.ejet[11] == true) {
                felter.feltliste[10].pris = 4;
                felter.feltliste[11].pris = 4;
                felter.feltliste[10].info = "Tony Hawk er ankommet betal 4";
                felter.feltliste[11].info = "Der er ekstra klor i vandet betal 4";
            }
            if (Controller.spillere[i].sKonto.ejet[13] == true && Controller.spillere[i].sKonto.ejet[14] == true) {
                felter.feltliste[13].pris = 6;
                felter.feltliste[14].pris = 6;
                felter.feltliste[13].info = "Du gamblede lidt for meget betal 6";
                felter.feltliste[14].info = "Der er kommet en ny film 6";

            }
            if (Controller.spillere[i].sKonto.ejet[16] == true && Controller.spillere[i].sKonto.ejet[17] == true) {
                felter.feltliste[16].pris = 6;
                felter.feltliste[17].pris = 6;
                felter.feltliste[16].info = "Det ved at være jul betal 6";
                felter.feltliste[17].info = "du har købt en gris og skal betale 6";
            }

            if (Controller.spillere[i].sKonto.ejet[19] == true && Controller.spillere[i].sKonto.ejet[20] == true) {
                felter.feltliste[19].pris = 8;
                felter.feltliste[20].pris = 8;
                felter.feltliste[19].info = "Der er kommet nye kugler betal 8";
                felter.feltliste[20].info = "Du har købt et sæson kort koster 8";

            }
            if (Controller.spillere[i].sKonto.ejet[22] == true && Controller.spillere[i].sKonto.ejet[23] == true) {
                felter.feltliste[22].pris = 10;
                felter.feltliste[23].pris = 10;
                felter.feltliste[22].info = "Der er kommet en helt ny rutsjebane som du har betalt for, betal 10";
                felter.feltliste[23].info = "Her bor de rige, det er du ikke længere, betal 10";
            }
        }

    }
}