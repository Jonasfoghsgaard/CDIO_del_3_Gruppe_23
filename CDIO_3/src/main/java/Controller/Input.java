package Controller;

import Boundary.GameBoard;

//Denne klasser viser begyndelsen af spillet og spørger om hvor mange spillere der skal spil.
public class Input {
    public static int spillerAntal() {
        return GameBoard.getBræt().getUserInteger("Hvor mange spillere er I? \nPS. I kan kun spille mellem 2 og 4 spillere", 2, 4);
    }

//Denne metode sikrer at de indtastede navne ikke er for lange eller for korte.
    public static String spillerNavn(int spillerNr) {
        boolean virker = false;
        String gentagNavn;
        do {
            gentagNavn = GameBoard.getBræt().getUserString("Indtast navn på spiller " + spillerNr);
            if (gentagNavn.length() < 11 && gentagNavn.length() > 1) {
                virker= true;
            }
        } while (!virker);
        return gentagNavn;
    }

}