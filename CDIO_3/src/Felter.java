public class Felter {



    int pris;
    int placering;
    String info;
    boolean købt;
    boolean gåIFængsel;
    boolean startFelt;
    boolean chanceFelt;
    boolean ejendomsFelt;
    boolean ingenHandling;
    boolean besøgIFængsel;
    Felter[] feltliste;


    public Felter() {
        pris = 0;
        købt = false;
        gåIFængsel = false;
        startFelt = false;
        chanceFelt = false;
        ejendomsFelt = false;
        ingenHandling = false;
        info = "";

        feltliste = new Felter[24];


    }

    void opretFelter() {

        Felter chanceKort = new Felter(); // Felt 3, 9, 15, 21
        chanceKort.chanceFelt = true;
        chanceKort.info = "Træk et chancekort :)";





        Felter start = new Felter(); // Felt 0
        start.startFelt = true;
        start.info = "Startfelt Modtag 2, bortset fra i første runde. ";


        Felter burgerBaren = new Felter(); // Felt 1
        burgerBaren.ejendomsFelt = true;
        burgerBaren.pris = 1;
        burgerBaren.info = "burger koster 1";

        Felter pizzariaet = new Felter(); // Felt 2
        pizzariaet.ejendomsFelt = true;

        pizzariaet.pris = 1;
        pizzariaet.info = "Pizzzzza koster 1";


        Felter slikButikken = new Felter(); // Felt 4
        slikButikken.ejendomsFelt = true;


        slikButikken.pris = 1;
        slikButikken.info = "Slik koster 1";


        Felter isKiosken = new Felter(); // Felt 5
        isKiosken.ejendomsFelt = true;



        isKiosken.pris = 1;
        isKiosken.info = "is koster 1";


        Felter besøgFængsel = new Felter(); // Felt 6
        besøgFængsel.besøgIFængsel = true;
        besøgFængsel.info = "besøgfængsel koster nadda";


        Felter museet = new Felter(); // Felt 7
        museet.ejendomsFelt = true;



        museet.pris = 2;
        museet.info = "Museet koster 2";


        Felter biblioteket = new Felter(); // Felt 8

        biblioteket.ejendomsFelt = true;



        biblioteket.pris = 2;
        biblioteket.info = "biblo koster 2";


        Felter skaterParken = new Felter(); // Felt 10
        skaterParken.ejendomsFelt = true;

        skaterParken.pris = 2;
        skaterParken.info = "skater koster 2";


        Felter swimmingpoolen = new Felter(); // Felt 11
        swimmingpoolen.ejendomsFelt = true;


        swimmingpoolen.pris = 2;
        swimmingpoolen.info = "POOOOOOOOOl koster 2";


        Felter gratisParkering = new Felter(); // Felt 12
        gratisParkering.ingenHandling = true;
        gratisParkering.info = "Parkering koster gratis";


        Felter spillehallen = new Felter(); // Felt 13
        spillehallen.ejendomsFelt = true;


        spillehallen.pris = 3;
        spillehallen.info = "spille spille koster 3";


        Felter biografen = new Felter(); // Felt 14
        biografen.ejendomsFelt = true;


        biografen.info = "biffen koster 3";
        biografen.pris = 3;


        Felter legetøjsbutikken = new Felter(); // Felt 16
        legetøjsbutikken.ejendomsFelt = true;


        legetøjsbutikken.pris = 3;
        legetøjsbutikken.info = "legetøj koster 3";

        Felter dyrehandleren = new Felter(); // Felt 17
        dyrehandleren.ejendomsFelt = true;


        dyrehandleren.pris = 3;
        dyrehandleren.info = "dyrehandleren koster 3";


        Felter gåIFængsel = new Felter(); // Felt 18
        gåIFængsel.gåIFængsel = true;
        gåIFængsel.pris = 1;
        gåIFængsel.info = "Du er blevet smidt i fængsel din bandit det koster ikke noget endnu...";

        Felter bowlingHallen = new Felter(); // Felt 19
        bowlingHallen.ejendomsFelt = true;
        bowlingHallen.info = "bowling koster 4";
        bowlingHallen.pris = 4;


        Felter zoologiskHave = new Felter(); // Felt 20
        zoologiskHave.ejendomsFelt = true;


        zoologiskHave.pris = 4;
        zoologiskHave.info = "Giraf, elefant og tiger - du er vist i zoo koster 4";

        Felter vandlandet = new Felter(); // Felt 22
        vandlandet.ejendomsFelt = true;

        vandlandet.pris = 5;
        vandlandet.info = "H2O land koster 5";


        Felter strandProminaden = new Felter(); // Felt 23
        strandProminaden.ejendomsFelt = true;

        strandProminaden.info = "Her bor de rige koster 5";
        strandProminaden.pris = 5;


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








