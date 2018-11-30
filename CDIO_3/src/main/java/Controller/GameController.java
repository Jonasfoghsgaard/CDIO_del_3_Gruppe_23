package Controller;

import Boundary.Chancekort;
import Boundary.GameBoard;
import Entity.Spiller;
import Entity.Terning;
import Entity.Tur;

public class GameController {
    public Terning terning;
    private int spillere;

    //Konstruktøren har tre parametrer, der benyttes til Main klassen.
    // Det er netop denne konstruktør, der opretter de nødvendige ting, altså hvor mange spiller der er med osv.
    public GameController(int antalSpillere, int antalTerninger, int antalØjne) {
        spillere = antalSpillere;
        terning = new Terning(antalTerninger,antalØjne);
    }

    //Dette er logiken bag spillet.
    private void spilLogik() {
        while (true) {
            Spiller spiller = Tur.getnuværendeSpiller();
            if(spiller.isSpillerErBlevetFængslet()) {
                if (spiller.spillerHarFængselsKortet()) {
                    if (GameBoard.getBræt().getUserLeftButtonPressed("Du er røget i fængsel, men du har et frikort! Vil du bruge det?", "Ja", "Nej")) {
                        spiller.setSpillerErBlevetFængslet(false);
                    } else {
                        spiller.tilføjTilBeholdning(0);
                        spiller.setSpillerErBlevetFængslet(false);
                    }
                } else {
                    spiller.tilføjTilBeholdning(0);
                    spiller.setSpillerErBlevetFængslet(false);
                }
            }
            GameBoard.getBræt().getUserButtonPressed("Det er nu " + spiller.getNavn(), "Slå med terningerne");
            terning.kastTerningen();
            GameBoard.rykPåBrikken(spiller, terning.sum());
            if (spiller.getBeholdning() <= 0) {
                break;
            }
            GameBoard.getBræt().showMessage(spiller.getNavn() + " har nu en beholdning på: " + spiller.getBeholdning());
            Tur.næsteSpiller();
        }
        Spiller vinder = Tur.getVinder();
        GameBoard.getBræt().showMessage("Vinderen er " + vinder.getNavn() + " med " + vinder.getBeholdning() + "$!");

    }


    //Viser startbeholdningen, der er afhængig af, hvor mange der netop er med i spillet. Denne metode bruges til at køre spillet.
    public void Start() {
        Tur.tilføjSpillere(spillere);
        GameBoard.tilføjKøretøj(Tur.getSpillere());
        switch (spillere) {
            case 2:
                for(Spiller spiller : Tur.getSpillere()) {
                    spiller.tilføjTilBeholdning(20);
                }
                break;
            case 3:
                for(Spiller spiller : Tur.getSpillere()) {
                    spiller.tilføjTilBeholdning(18);
                }
                break;
            case 4:
                for(Spiller spiller : Tur.getSpillere()) {
                    spiller.tilføjTilBeholdning(16);
                }
                break;
            default:
                for(Spiller spiller : Tur.getSpillere()) {
                    spiller.tilføjTilBeholdning(15);
                }
                break;
        }
        Chancekort.opretChancerKort();
        spilLogik();
    }

}