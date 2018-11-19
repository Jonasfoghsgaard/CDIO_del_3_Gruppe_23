import java.util.concurrent.CopyOnWriteArrayList;

public class SpillerKonto {

    Controller controlla = new Controller();



    int penge;

    static int startbeholdning (int antalSpillere) {

        if (antalSpillere == 2)
    {return 20;
    }

    else if (antalSpillere == 3){
        return 18;
}

    else if (antalSpillere == 4) {
        return 20;
        }

        else { return 20; } // slet denne linje senere.
    }


SpillerKonto() {

penge = startbeholdning(Controller.regler.antalSpillere);
    }










}
