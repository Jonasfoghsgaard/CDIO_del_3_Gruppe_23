public class Felter {


    int pris;
    String info;
    boolean købt;
    boolean gåIFængsel;
    boolean startFelt;
    boolean chanceFelt;
    boolean ejendomsFelt;
    boolean ingenHandling;
    boolean besøgIFængsel;


    boolean brun = false;
    boolean lyseblå = false;
    boolean pink = false;
    boolean orange = false;
    boolean rød = false;
    boolean gul = false;
    boolean grøn = false;
    boolean blå = false;



    public Felter() {
        pris = 0;
        købt = false;
        gåIFængsel = false;
        startFelt = false;
        chanceFelt = false;
        ejendomsFelt = false;
        ingenHandling = false;
        info = "";


    }


    void ejerBeggeGrunde() { // tjekker om en spiller ejer begge grunde.

        for (int i = 0; i < Controller.regler.antalSpillere; i++) {


            if (Controller.spillere[i].sKonto.ejet[1] ==true && Controller.spillere[i].sKonto.ejet[2] == true){
                brun = true;
            }

            if (Controller.spillere[i].sKonto.ejet[4] == true && Controller.spillere[i].sKonto.ejet[5]== true) {
                lyseblå = true;
            }
            if (Controller.spillere[i].sKonto.ejet[7] == true && Controller.spillere[i].sKonto.ejet[8]== true) {
                pink = true;
            }
            if (Controller.spillere[i].sKonto.ejet[10]== true && Controller.spillere[i].sKonto.ejet[11]== true) {
                orange = true;
            }
            if (Controller.spillere[i].sKonto.ejet[13]== true && Controller.spillere[i].sKonto.ejet[14]== true) {
                rød = true;
            }
            if (Controller.spillere[i].sKonto.ejet[16]== true && Controller.spillere[i].sKonto.ejet[17]== true) {
                gul = true;
            }

            if (Controller.spillere[i].sKonto.ejet[19]== true && Controller.spillere[i].sKonto.ejet[20]== true) {
                grøn = true;
            }
            if (Controller.spillere[i].sKonto.ejet[22]== true && Controller.spillere[i].sKonto.ejet[23]== true) {
                blå = true;
            }
        }


    }


    Felter[] feltliste = new Felter[24];

    public void opretFelter() {

        Felter chanceKort = new Felter(); // Felt 3, 9, 15, 21
        chanceKort.chanceFelt = true;
        chanceKort.info = "Træk et chancekort :)";


        Felter start = new Felter(); // Felt 0
        start.startFelt = true;
        start.info = "Startfelt Modtag 2, bortset fra i første runde. ";

        Felter burgerBaren = new Felter(); // Felt 1
            burgerBaren.ejendomsFelt = true;
            if (brun == true) {
                burgerBaren.pris = 2;
                burgerBaren.info = " Burgeren er ekstra dyr idag, betal 2";
            } else {
                burgerBaren.pris = 1;
                burgerBaren.info = "burger koster 1";
            }

        Felter pizzariaet = new Felter(); // Felt 2
            pizzariaet.ejendomsFelt = true;
            if (brun == true) {
                pizzariaet.pris = 2;
                pizzariaet.info = " Pizzaen smagte utrolig godt og du valgte at betale dobbelt. Koster 2.";
            } else {
                pizzariaet.pris = 1;
                pizzariaet.info = "Pizzzzza koster 1";
            }

        Felter slikButikken = new Felter(); // Felt 4
            slikButikken.ejendomsFelt = true;

            if (lyseblå == true) {
                slikButikken.pris = 2;
                slikButikken.info = " Slik mums. Koster 2";
            } else {
                slikButikken.pris = 1;
                slikButikken.info = "Slik koster 1";
            }

        Felter isKiosken = new Felter(); // Felt 5
            isKiosken.ejendomsFelt = true;
            if (lyseblå == true) {
                isKiosken.pris = 2;
                isKiosken.info = " Is mums. Koster 2";
            } else {
                isKiosken.pris = 1;
                isKiosken.info = "is koster 1";
            }


        Felter besøgFængsel = new Felter(); // Felt 6
        besøgFængsel.besøgIFængsel = true;
        besøgFængsel.info = "besøgfængsel koster nadda";


        Felter museet = new Felter(); // Felt 7
            museet.ejendomsFelt = true;

            if (pink == true) {
                museet.pris = 4;
                museet.info = " Museet koster dobbelt op. Bad luck betal 4";
            } else {
                museet.pris = 2;
                museet.info = "Museet koster 2";
            }


        Felter biblioteket = new Felter(); // Felt 8

            biblioteket.ejendomsFelt = true;
            if (pink == true) {
                biblioteket.pris = 4;
                biblioteket.info = " Du har glemt at aflevere dine bøge på biblo, betal 4";
            } else {
                biblioteket.pris = 2;
                biblioteket.info = "biblo koster 2";
            }


        Felter skaterParken = new Felter(); // Felt 10
            skaterParken.ejendomsFelt = true;

            if (orange == true) {
                skaterParken.pris = 4;
                skaterParken.info = "Tony Hawk er ankommet betal 4";
            } else {
                skaterParken.pris = 2;
                skaterParken.info = "skater koster 2";
            }

        Felter swimmingpoolen = new Felter(); // Felt 11
            swimmingpoolen.ejendomsFelt = true;
            if (orange == true) {
                swimmingpoolen.pris = 4;
                swimmingpoolen.info = "Der er ekstra klor i vandet betal 4";
            } else {
                swimmingpoolen.pris = 2;
                swimmingpoolen.info = "POOOOOOOOOl koster 2";
            }


        Felter gratisParkering = new Felter(); // Felt 12
        gratisParkering.ingenHandling = true;
        gratisParkering.info = "Parkering koster gratis";


        Felter spillehallen = new Felter(); // Felt 13
            spillehallen.ejendomsFelt = true;
            if (rød == true) {
                spillehallen.pris = 6;
                spillehallen.info = "Du gamblede lidt for meget betal 6";
            } else {
                spillehallen.pris = 3;
                spillehallen.info = "spille spille koster 3";
            }


        Felter biografen = new Felter(); // Felt 14
            biografen.ejendomsFelt = true;
            if (rød == true) {
                biografen.pris = 6;
                biografen.info = "Der er kommet en ny film 6";
            } else {
                biografen.info = "biffen koster 3";
                biografen.pris = 3;
            }


        Felter legetøjsbutikken = new Felter(); // Felt 16
            legetøjsbutikken.ejendomsFelt = true;
            if (gul == true) {
                legetøjsbutikken.pris = 6;
                legetøjsbutikken.info = "Det ved at være jul betal 6";
            } else {

                legetøjsbutikken.pris = 3;
                legetøjsbutikken.info = "legetøj koster 3";
            }

        Felter dyrehandleren = new Felter(); // Felt 17
            dyrehandleren.ejendomsFelt = true;
            if (gul == true) {
                dyrehandleren.pris = 6;
                dyrehandleren.info = "du har købt en gris og skal betale 6";
            } else {
                dyrehandleren.pris = 3;
                dyrehandleren.info = "dyrehandleren koster 3";
            }

        Felter gåIFængsel = new Felter(); // Felt 18
        gåIFængsel.gåIFængsel = true;
        gåIFængsel.pris = 1;
        gåIFængsel.info = "Du er blevet smidt i fængsel din bandit det koster ikke noget endnu...";

        Felter bowlingHallen = new Felter(); // Felt 19
            bowlingHallen.ejendomsFelt = true;
            if (grøn == true) {
                bowlingHallen.pris = 8;
                bowlingHallen.info = "Der er kommet nye kugler betal 8";
            } else {
                bowlingHallen.info = "bowling koster 4";
                bowlingHallen.pris = 4;
            }

        Felter zoologiskHave = new Felter(); // Felt 20
            zoologiskHave.ejendomsFelt = true;
            if (grøn == true) {
                zoologiskHave.pris = 8;
                zoologiskHave.info = "Du har købt et sæson kort koster 8";
            } else {
                zoologiskHave.pris = 4;
                zoologiskHave.info = "Giraf, elefant og tiger - du er vist i zoo koster 4";
            }

        Felter vandlandet = new Felter(); // Felt 22
            vandlandet.ejendomsFelt = true;
            if (blå == true) {
                vandlandet.pris = 10;
                vandlandet.info = " Der er kommet en helt ny rutsjebane som du har betalt for, betal 10";
            } else {
                vandlandet.pris = 5;
                vandlandet.info = "H2O land koster 5";
            }

        Felter strandProminaden = new Felter(); // Felt 23
            strandProminaden.ejendomsFelt = true;
            if (blå == true) {
                strandProminaden.pris = 10;
                strandProminaden.info = "Her bor de rige, det er du ikke længere, betal 10";
            } else {
                strandProminaden.info = "Her bor de rige koster 5";
                strandProminaden.pris = 5;
            }

            if (brun ==true ){
                pris = 2;
            }





        feltliste[0] = start;
        feltliste[1] = burgerBaren;
        feltliste[2] = pizzariaet;
        feltliste[3] = chanceKort;
        feltliste[4] = slikButikken;
        feltliste[5] = isKiosken;
        feltliste[6] = besøgFængsel;
        feltliste[7] = museet;
        feltliste[8] = biblioteket;
        feltliste[9] = chanceKort;
        feltliste[10] = skaterParken;
        feltliste[11] = swimmingpoolen;
        feltliste[12] = gratisParkering;
        feltliste[13] = spillehallen;
        feltliste[14] = biografen;
        feltliste[15] = chanceKort;
        feltliste[16] = legetøjsbutikken;
        feltliste[17] = dyrehandleren;
        feltliste[18] = gåIFængsel;
        feltliste[19] = bowlingHallen;
        feltliste[20] = zoologiskHave;
        feltliste[21] = chanceKort;
        feltliste[22] = vandlandet;
        feltliste[23] = strandProminaden;
    }

}







