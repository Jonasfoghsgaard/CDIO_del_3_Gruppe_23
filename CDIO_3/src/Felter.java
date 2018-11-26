public class Felter {


    int pris;
    String info;
    boolean købt;
    boolean gåIFængsel;
    boolean startFelt;
    boolean chanceFelt;
    boolean ejendomsFelt;
    boolean ingenHandling;
    int [] ejerAfFelt;

    public Felter() {
        pris = 0;
        købt = false;
        gåIFængsel = false;
        startFelt = false;
        chanceFelt = false;
        ejendomsFelt = false;
        ingenHandling = false;
        info ="";
        ejerAfFelt = new int[Controller.regler.antalSpillere + 1];

    }


    static Felter [] feltliste = new Felter [24];

        public void opretFelter(){

        Felter chanceKort = new Felter(); // Felt 3, 9, 15, 21
        chanceKort.chanceFelt = true;


        Felter start = new Felter(); // Felt 0
        start.startFelt = true;
        start.info = "Startfelt Modtag 2 ";

        Felter burgerBaren = new Felter(); // Felt 1
        burgerBaren.ejendomsFelt = true;
        burgerBaren.pris = 1;
        burgerBaren.info ="burger koster 1";

        Felter pizzariaet = new Felter(); // Felt 2
        pizzariaet.ejendomsFelt = true;
        pizzariaet.pris = 1;
        pizzariaet.info = "pizza koster 1";

        Felter slikButikken = new Felter(); // Felt 4
        slikButikken.pris = 1;
        slikButikken.ejendomsFelt = true;
        slikButikken.info = "slik koster 1";

        Felter isKiosken= new Felter(); // Felt 5
        isKiosken.pris = 1;
        isKiosken.ejendomsFelt = true;
        isKiosken.info = "is koster 1";

        Felter besøgFængsel = new Felter(); // Felt 6
        besøgFængsel.ingenHandling = true;
        besøgFængsel.info = "besøgfængsel koster nadda";

        Felter museet = new Felter(); // Felt 7
        museet.pris = 2;
        museet.ejendomsFelt = true;
        museet.info = "museet koster 2";

        Felter biblioteket= new Felter(); // Felt 8
        biblioteket.pris = 2;
        biblioteket.ejendomsFelt = true;
        biblioteket.info = "biblo koster 2";

        Felter skaterParken= new Felter(); // Felt 10
        skaterParken.pris = 2;
        skaterParken.ejendomsFelt = true;
        skaterParken.info = "skater koster 2";

        Felter swimmingpoolen= new Felter(); // Felt 11
        swimmingpoolen.pris = 2;
        swimmingpoolen.ejendomsFelt = true;
        swimmingpoolen.info ="POOOOOOOOOl koster 2";

        Felter gratisParkering = new Felter(); // Felt 12
        gratisParkering.ingenHandling = true;
        gratisParkering.info = "Parkering koster gratis";

        Felter spillehallen= new Felter(); // Felt 13
        spillehallen.pris = 3;
        spillehallen.ejendomsFelt = true;
        spillehallen.info = "spille spille koster 3";

        Felter biografen = new Felter(); // Felt 14
        biografen.pris = 3;
        biografen.ejendomsFelt = true;
        biografen.info = "biffen koster 3";

        Felter legetøjsbutikken = new Felter(); // Felt 16
        legetøjsbutikken.pris = 3;
        legetøjsbutikken.ejendomsFelt = true;
        legetøjsbutikken.info = "legetøj koster 3";

        Felter dyrehandleren = new Felter(); // Felt 17
        dyrehandleren.pris = 3;
        dyrehandleren.ejendomsFelt = true;
        dyrehandleren.info = "dyrehandleren koster 3";

        Felter gåIFængsel= new Felter(); // Felt 18
        gåIFængsel.gåIFængsel = true;
        gåIFængsel.info = "Du er blevet smidt i fængsel din bandit det koster ikke noget endnu...";

        Felter bowlingHallen = new Felter(); // Felt 19
        bowlingHallen.pris = 4;
        bowlingHallen.ejendomsFelt = true;
        bowlingHallen.info = "bowling koster 4";


        Felter zoologiskHave = new Felter(); // Felt 20
        zoologiskHave.pris = 4;
        zoologiskHave.ejendomsFelt = true;
        zoologiskHave.info = "Giraf, elefant og tiger - du er vist i zoo koster 4";

        Felter vandlandet = new Felter(); // Felt 22
        vandlandet.pris = 5;
        vandlandet.ejendomsFelt = true;
        vandlandet.info = "H2O land koster 5";

        Felter strandProminaden = new Felter(); // Felt 23
        strandProminaden.pris = 5;
        strandProminaden.ejendomsFelt = true;
        strandProminaden.info = "Her bor de rige koster 5";



        feltliste[0]=start;
        feltliste[1]=burgerBaren;
        feltliste[2]=pizzariaet;
        feltliste[3]=chanceKort;
        feltliste[4]=slikButikken;
        feltliste[5]=isKiosken;
        feltliste[6]=besøgFængsel;
        feltliste[7]=museet;
        feltliste[8]=biblioteket;
        feltliste[9]=chanceKort;
        feltliste[10]=skaterParken;
        feltliste[11]=swimmingpoolen;
        feltliste[12]=gratisParkering;
        feltliste[13]=spillehallen;
        feltliste[14]=biografen;
        feltliste[15]=chanceKort;
        feltliste[16]=legetøjsbutikken;
        feltliste[17]=dyrehandleren;
        feltliste[18]=gåIFængsel;
        feltliste[19]=bowlingHallen;
        feltliste[20]=zoologiskHave;
        feltliste[21]=chanceKort;
        feltliste[22]=vandlandet;
        feltliste[23]=strandProminaden;







    }
}




