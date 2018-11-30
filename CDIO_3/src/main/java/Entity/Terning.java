package Entity;

import Boundary.GameBoard;

public class Terning {
//Opretter variabler
    private int øjne;
    private int antalTerninger;
    private int[] terninger;

    //Opretter en konstruktør med 2 parametre, der definere en terning
    public Terning(int antalTerninger, int antalØjne) {
        this.antalTerninger = antalTerninger;
        this.øjne = antalØjne;
    }

    //Matematikken bag terningen
    private int terningeØjne() {
        return (int)(Math.random() * øjne + 1);
    }

    //Denne metode viser når terningen kastes, og den tildeler terningen til GUI'en.
    public int[] kastTerningen() {
        terninger = new int[antalTerninger];
        for (int i = 0; i < terninger.length; i++) {
            terninger[i] = terningeØjne();
        }
        if (antalTerninger == 2) {
            GameBoard.getBræt().setDice(terninger[1], 0, 0, terninger[1], 0, 0);
        } else if (antalTerninger == 1) {
            GameBoard.getBræt().setDie(terninger[0]);
        }
        return terninger;
    }
    //En fin sum metode
    public int sum() {
        int sum = 0;
        for (int sumTerninger : terninger) {
            sum += sumTerninger;
        }
        return sum;
    }
}