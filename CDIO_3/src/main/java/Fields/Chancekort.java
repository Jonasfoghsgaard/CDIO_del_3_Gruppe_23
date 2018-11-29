package Fields;

public class Chancekort {


    public kort[] kort;


    public class kort {
        public String info;
        public String Handling;
        public int værdi;


        // Konstruktør til kort
        kort(String info, String Handling, int værdi) {
            this.info = info;
            this.Handling = Handling;
            this.værdi = værdi;

        }

    }
    public Chancekort() {


        kort = new kort[6];

        // ChanceKort
        kort rykTilStart = new kort("Ryk Til Start og modtag 2", "RykTilStart", 0);
        kort rykFemFelterFrem = new kort("Du rykker fem felter frem", "RykFelter", 5);
        kort betal2TilBanken = new kort ("Du har spist for meget slik, betal 2 til banken", "BetalTilBank", 2);
        kort LavetLektier = new kort ( "Du har lavet alle dine lektier, modtag 2.", "ModtagPenge", 2);
        kort chancekortEllerRyk = new kort ("Træk nyt chancekort eller ryk et felt frem", "RykEllerTræk", 1);
        kort Fødselsdag = new kort ("Det er din fødselsdag, modtag 1 fra alle dine medspillere :) ", "Fødselsdag", 1);
    //    kort gratisOrange = new kort ( "Gå til nærmeste orange felt. Få feltet gratis hvis ingen ejer det", "gratisOrange", -2);



        kort[0] = rykTilStart;
        kort[1] = rykFemFelterFrem;
        kort[2] = betal2TilBanken;
        kort[3] = LavetLektier;
        kort[4] = chancekortEllerRyk;
        kort[5] = Fødselsdag;
       // kort[6] = gratisOrange;




    }
}