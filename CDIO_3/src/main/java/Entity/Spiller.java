package Entity;

import Fields.Chancekort;
import Game.Controller;

import java.util.Scanner;
import java.util.Random;


public class Spiller {

    public SpillerKonto sKonto = new SpillerKonto();
    Scanner scanner = new Scanner(System.in);
    Chancekort chancekort = new Chancekort();


    private String name = "";
    private int placering;
    private int gamlePlacering;
    boolean alleredeIFængsel;

    public String getName() {
        return name;
    }

    public int getgamlePlacering() {
        return gamlePlacering;
    }

    public int getPlacering() {
        return placering;
    }


    public void setGamlePlacering(int gamlePlacering) {
        this.gamlePlacering = gamlePlacering;
    }

    public void setPlacering(int placering) {
        this.placering = placering;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setalleredeIFængsel(boolean ForT) {
        this.alleredeIFængsel = alleredeIFængsel;
    }


    public Spiller() {

        alleredeIFængsel = false;
        placering = 0;

        System.out.println("Indtast navn: ");
        setName(scanner.next());

    }


    Random kortvælger = new Random();
    int kort;

    private int tilfældigKort() {





        kort = kortvælger.nextInt(6);
        return kort;
    }

    int getKort() { return kort;}







    public void trækChancekort(int spiller) {
        tilfældigKort();
        int kortvælger = getKort();


        int antalSpillere = Controller.regler.antalSpillere;
        int placering = Controller.spillere[spiller].getPlacering();
        String info = chancekort.kort[kortvælger].info;
        String handling = chancekort.kort[kortvælger].Handling;
        int værdi = chancekort.kort[kortvælger].værdi;
        int penge = Controller.spillere[spiller].sKonto.getPenge();


        if (handling.equals("RykTilStart")) {
            Controller.spillere[spiller].setPlacering(værdi);
            System.out.println(info);
            Transaktioner.passerStart(spiller);

        }

        if (handling.equals("RykFelter")) {
            Controller.spillere[spiller].setPlacering(placering + værdi);
            System.out.println(info);
        }


        if (handling.equals("BetalTilBank")) {
            Transaktioner.betalTilBank(spiller, værdi);
            System.out.println(info);

        }

        if (handling.equals("LavetLektier")) {
            Controller.spillere[spiller].sKonto.setPenge(penge + 2);
            System.out.println(info);
        }

        if (handling.equals("RykEllerTræk")) {
            System.out.println(info);
            System.out.println("Skriv ja for at modtage et nyt chancekort.");
            Scanner scanner = new Scanner(System.in);


            String ja = scanner.next();
            if (ja.equals("ja")) {
                Controller.spillere[spiller].trækChancekort(spiller);
                System.out.println("Du har valgt at modtage et nyt chancekort,");
            } else {
                Controller.spillere[spiller].setPlacering(placering + 1);
                System.out.println("Du har valgt at rykket et felt frem.");
            }
        }

        if (handling.equals("Fødselsdag")) {
            System.out.println(info);

            for (int i = 0; i < antalSpillere; i++) {
                Transaktioner.betalPenge(i, spiller, 1);

            }
        }
/*
        if (handling.equals("gratisOrange")){
            Game.Controller.spillere[spiller].setPlacering(10);
            for (int i = 0; i < antalSpillere; i++) {
                if (Game.Controller.spillere[i].sKonto.ejet[placering] == false)
                {
                 setPlacering(10);
                 Entity.Transaktioner.betalTilBank(spiller, værdi);
                }
                else{
                    setPlacering(10);
                }
            }
        }
*/
    }
}