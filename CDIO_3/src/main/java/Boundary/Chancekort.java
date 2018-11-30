package Boundary;


import Entity.Spiller;
import Entity.Tur;

import java.util.ArrayList;
import java.util.Collections;

public class Chancekort {
    private static ArrayList<Chancekort> chancer = new ArrayList<Chancekort>();
    private Runnable handling;
    private String beskrivelse;

// Konstruktør der beskriver chancekortet
    private Chancekort(String beskrivelse, Runnable handling) {
        this.handling = handling;
        this.beskrivelse = beskrivelse;
    }

    // Denne metode forstod vi ikke helt, men åbenbart, prioritere systemet,
    // at denne bliver kørt først, da det er en trussel
    public void kør() {
        Thread t = new Thread(handling);
        t.run();
    }

    //Denne metode returnere chancekortets beskrivelser
    public String getBeskrivelse() {
        return beskrivelse;
    }

    //Her tilføjes beskrivelsens og dens handling/konsekvenser til kortet
    private static void tilføjChance(String beskrivelse, Runnable handling) {
        chancer.add(new Chancekort(beskrivelse, handling));
    }

    // Metoden her gør at vi trækker det næste kort der er i bunken.
    public static Chancekort getNæsteChanceKort() {
        Chancekort chancekort = chancer.get(0);
        chancer.remove(0);
        chancer.add(chancekort);
        return chancekort;
    }

    //Her opretter vi kortene.
    public static void opretChancerKort() {
        String chancekortBeskrivelse = "CHANCE: Du rykker frem til start og modtager M2!";
        Runnable chancekort_run = new Runnable() {
            public void run() {
                GameBoard.rykPåBrik(Tur.getnuværendeSpiller(), 0);
                Tur.getnuværendeSpiller().tilføjTilBeholdning(2);
            }
        };
        tilføjChance(chancekortBeskrivelse, chancekort_run);

        chancekortBeskrivelse = "CHANCE: Ryk 5 felter frem!";
        chancekort_run = new Runnable() {
            public void run() {
                if (Tur.getnuværendeSpiller().getFeltplacering() == 21){
                    GameBoard.rykPåBrik(Tur.getnuværendeSpiller(),2);
                }
                else
                GameBoard.rykPåBrik(Tur.getnuværendeSpiller(),Tur.getnuværendeSpiller().getFeltplacering()+5 );
            }
        };
        tilføjChance(chancekortBeskrivelse, chancekort_run);

        chancekortBeskrivelse = "CHANCE: Ryk 1 felt frem, eller tag et chancekort mere.";
        chancekort_run = new Runnable() {
            public void run() {
                boolean valg = GameBoard.getBræt().getUserLeftButtonPressed("Vil du rykke 1 felt frem eller tag et nyt chance kort?", "1 felt frem", "Nyt kort");
                if (valg) {
                    GameBoard.rykPåBrik(Tur.getnuværendeSpiller(), Tur.getnuværendeSpiller().getFeltplacering() +1);
                } else {
                    Chancekort chancekort =  getNæsteChanceKort();
                    GameBoard.getBræt().showMessage(chancekort.getBeskrivelse());
                    chancekort.kør();
                }
            }
        };
        tilføjChance(chancekortBeskrivelse, chancekort_run);

        chancekortBeskrivelse = "CHANCE: Du har spist for meget slik. Betal M2 til banken!";
        chancekort_run = new Runnable() {
            public void run() {
                Tur.getnuværendeSpiller().tilføjTilBeholdning(-2);
            }
        };
        tilføjChance(
                chancekortBeskrivelse, chancekort_run);

        chancekortBeskrivelse = "CHANCE: Ryk frem til Strandpromenaden!";
        chancekort_run = new Runnable() {
            public void run() {
                GameBoard.rykPåBrik(Tur.getnuværendeSpiller(), 23);
            }
        };
        tilføjChance(
                chancekortBeskrivelse, chancekort_run);

        chancekortBeskrivelse = "CHANCE: Det er din fødselsdag! Alle giver dig M1!";
        chancekort_run = new Runnable() {
            public void run() {
                for(Spiller spiller: Tur.getSpillere()) {
                    spiller.tilføjTilBeholdning(-1);
                    Tur.getnuværendeSpiller().tilføjTilBeholdning(1);
                }
            }
        };
        tilføjChance(
                chancekortBeskrivelse, chancekort_run);

        chancekortBeskrivelse = "CHANCE: Du har lavet alle dine lektier! Modag M2 fra banken!";
        chancekort_run = new Runnable() {
            public void run() {
                Tur.getnuværendeSpiller().tilføjTilBeholdning(2);
            }
        };
        tilføjChance(
                chancekortBeskrivelse, chancekort_run);

        chancekortBeskrivelse = "CHANCE: Du løslades uden omkostninger. Behold dette kort, indtil du får brug for det!";
        chancekort_run = new Runnable() {
            public void run() {
                Tur.getnuværendeSpiller().setSpillerHarFængselsKortet(true);
            }
        };

        tilføjChance(
                chancekortBeskrivelse, chancekort_run);



        chancekortBeskrivelse = "CHANCE: Ryk frem til Skaterparken for at lave det perfekte grind! Hvis ingen ejer den får du den GRATIS! Ellers skal du BETALE leje til ejeren!";
        chancekort_run = new Runnable() {
            public void run() {
                GameBoard.rykPåBrik(Tur.getnuværendeSpiller(), 10, true);

            }

        };
        tilføjChance(
                chancekortBeskrivelse, chancekort_run);

        Collections.shuffle(chancer);
    }

}