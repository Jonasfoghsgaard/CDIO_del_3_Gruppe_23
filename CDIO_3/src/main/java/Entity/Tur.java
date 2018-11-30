package Entity;

import Boundary.GameBoard;
import Controller.Input;
import gui_fields.GUI_Player;

import java.util.Arrays;
import java.util.Comparator;

public class Tur {

    //Opretter variabler også GUI :-)
    private static GUI_Player[] spillere;
    private static Spiller[] spillere2;
    private static int spillerTur = 0;

    //Denne tildeler brikkerne til spillerne, så spillerne kan vælge dem når koden køres.
    public static void tilføjSpillere(int antal) {
        spillere = new GUI_Player[antal];
        spillere2 = new Spiller[antal];

        String[] køretøjer = {"Bil", "Racerbil", "Traktor", "Ufo"};
        for(int i = 0; i < spillere2.length; i++) {
            spillere2[i] = new Spiller();
            String navn = Input.spillerNavn(i+1);
            String bil;
            switch (i) {
                case 0: bil = GameBoard.getBræt().getUserSelection("Hvilket køretøj vil du gerne bruge?", køretøjer); break;
                case 1: bil = GameBoard.getBræt().getUserSelection("Hvilket køretøj vil du gerne bruge?", køretøjer[0], køretøjer[1], køretøjer[2]); break;
                case 2: bil = GameBoard.getBræt().getUserSelection("Hvilket køretøj vil du gerne bruge?", køretøjer[0], køretøjer[1]); break;
                case 3: bil = GameBoard.getBræt().getUserSelection("Hvilket køretøj vil du gerne bruge?", køretøjer[0]); break;
                default: bil = GameBoard.getBræt().getUserSelection("Hvilket køretøj vil du gerne bruge?", køretøjer); break;
            }
            int a = Arrays.asList(køretøjer).indexOf(bil);
            System.arraycopy(køretøjer,  a + 1, køretøjer, a, køretøjer.length - 1 - a);
            spillere2[i].setBilType(bil);
            spillere2[i].setNavn(navn);

        }
    }

    //get spiller2
    public static Spiller[] getSpillere() {
        return spillere2;
    }

    //Giver turen videre.
    public static void næsteSpiller() {
        if(spillerTur == spillere2.length-1) {
            spillerTur = 0;
        } else {
            spillerTur++;
        }
    }

    //Viser den nuværende spiller, der skal spille.
    public static Spiller getnuværendeSpiller() {
        return spillere2[getNuværendeSpiller()];
    }

    //Viser den anden spiller, som dermed bliver den nuværende efter den forrige har kastet.
    public static int getNuværendeSpiller() {
        return spillerTur;
    }

    //Viser vinderen ved at sammenligne spillernes beholdning
    public static Spiller getVinder() {
        Spiller[] spillerArray = getSpillere();
        Arrays.sort(spillerArray, new Comparator<Spiller>() {
            public int compare(Spiller o1, Spiller o2) {
                return Integer.compare(o1.getBeholdning(), o2.getBeholdning());
            }
        });
        return spillerArray[spillerArray.length-1];
    }
}