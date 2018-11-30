import Boundary.GameBoard;
import Controller.GameController;
import Controller.Input;
//Ved hjælp af imports, kan jeg køre spillet som ønsket.


public class Monopoly_Junior {

    //Denne main metode kører hele molovitten og det betyder,
    // at man kan spille spillet visuelt
    public static void main(String[] args) {
        GameBoard.opretPlade();
        int antal = Input.spillerAntal();
        GameController Monopoly_Junior = new GameController(antal,1,6);
        Monopoly_Junior.Start();
    }
}

