package Boundary;

import Entity.Spiller;
import gui_fields.*;
import gui_main.GUI;

import java.awt.*;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class GameBoard {
    private static GUI bræt;
    private static GUI_Field[] felter = new GUI_Field[24];
    private GUI_Field felt;
    private static Spiller[] feltejer = new Spiller[24];
    private int feltPlacering;

    //Vi opretter den famøse spilleplade med disse 24 felter. RGB farverne findes på nettet.
    public static void opretPlade() {
        felter[0] = new GUI_Start();
        felter[0].setTitle("Start");
        felter[0].setSubText("");
        felter[0].setDescription("Modtag $2 fra banken, hver gang du passerer eller lander på START");

        felter[1] = new GUI_Street("Burgerbaren", "$1", "GameBoard koster $1", "1", new Color(188, 122, 0), Color.black);

        felter[2] = new GUI_Street();
        felter[2].setTitle("Pizzeriaet");
        felter[2].setSubText("$1");
        felter[2].setDescription("Feltet koster $1");
        felter[2].setBackGroundColor(new Color(188, 122, 0));

        felter[3] = new GUI_Chance();

        felter[4] = new GUI_Street();
        felter[4].setTitle("Slikbutikken");
        felter[4].setSubText("$1");
        felter[4].setDescription("Feltet koster $1");
        felter[4].setBackGroundColor(new Color(0, 170, 232));

        felter[5] = new GUI_Street();
        felter[5].setTitle("Iskiosken");
        felter[5].setSubText("$1");
        felter[5].setDescription("Feltet koster $1");
        felter[5].setBackGroundColor(new Color(0, 170, 232));

        felter[6] = new GUI_Jail();
        felter[6].setSubText("På Besøg");

        felter[7] = new GUI_Street();
        felter[7].setTitle("Museet");
        felter[7].setSubText("$2");
        felter[7].setDescription("Feltet koster $2");
        felter[7].setBackGroundColor(new Color(232, 0, 212));

        felter[8] = new GUI_Street();
        felter[8].setTitle("Biblioteket");
        felter[8].setSubText("$2");
        felter[8].setDescription("Feltet koster $2");
        felter[8].setBackGroundColor(new Color(232, 0, 212));

        felter[9] = new GUI_Chance();

        felter[10] = new GUI_Street();
        felter[10].setTitle("Skaterparken");
        felter[10].setSubText("$2");
        felter[10].setDescription("Feltet koster $2");
        felter[10].setBackGroundColor(new Color(255, 216, 0));

        felter[11] = new GUI_Street();
        felter[11].setTitle("Swimmingpoolen");
        felter[11].setSubText("$2");
        felter[11].setDescription("Feltet koster $2");
        felter[11].setBackGroundColor(new Color(255, 216, 0));

        felter[12] = new GUI_Street();
        felter[12].setTitle("Gratis");
        felter[12].setSubText("Parkering");

        felter[13] = new GUI_Street();
        felter[13].setTitle("Spillehallen");
        felter[13].setSubText("$3");
        felter[13].setDescription("Feltet koster $3");
        felter[13].setBackGroundColor(new Color(255, 81, 81));

        felter[14] = new GUI_Street();
        felter[14].setTitle("Biografen");
        felter[14].setSubText("$3");
        felter[14].setDescription("Feltet koster $3");
        felter[14].setBackGroundColor(new Color(255, 81, 81));

        felter[15] = new GUI_Chance();

        felter[16] = new GUI_Street();
        felter[16].setTitle("Legetøjsbutikken");
        felter[16].setSubText("$3");
        felter[16].setDescription("Feltet koster $3");
        felter[16].setBackGroundColor(new Color(255, 216, 0));

        felter[17] = new GUI_Street();
        felter[17].setTitle("Dyrehandlen");
        felter[17].setSubText("$3");
        felter[17].setDescription("Feltet koster $3");
        felter[17].setBackGroundColor(new Color(255, 216, 0));

        felter[18] = new GUI_Jail();
        felter[18].setSubText("Gå i fængsel");

        felter[19] = new GUI_Street();
        felter[19].setTitle("Bowlinghallen");
        felter[19].setSubText("$4");
        felter[19].setDescription("Feltet koster $4");
        felter[19].setBackGroundColor(new Color(6, 186, 0));

        felter[20] = new GUI_Street();
        felter[20].setTitle("Zoo");
        felter[20].setSubText("$4");
        felter[20].setDescription("Feltet koster $4");
        felter[20].setBackGroundColor(new Color(6, 186, 0));

        felter[21] = new GUI_Chance();

        felter[22] = new GUI_Street();
        felter[22].setTitle("Vandlandet");
        felter[22].setSubText("$4");
        felter[22].setDescription("Feltet koster $4");
        felter[22].setBackGroundColor(new Color(79, 123, 255));

        felter[23] = new GUI_Street();
        felter[23].setTitle("Strandpromenaden");
        felter[23].setSubText("$4");
        felter[23].setDescription("Feltet koster $4");
        felter[23].setBackGroundColor(new Color(79, 123, 255));

        for(GUI_Field felt: felter) {
            if (felt instanceof GUI_Street) {
                GUI_Street gade = (GUI_Street) felt;
                gade.setOwnableLabel("");
                gade.setRent("1");
            }
        }
        for (int i = 0; i < felter.length; i++) {
            GUI_Street gade;
            switch (i) {
                case 1:
                case 2:
                case 4:
                case 5:
                    gade = (GUI_Street)felter[i]; gade.setRent("1"); break;
                case 7:
                case 8:
                case 10:
                case 11:
                    gade = (GUI_Street)felter[i]; gade.setRent("2"); break;
                case 13:
                case 14:
                case 16:
                case 17:
                    gade = (GUI_Street)felter[i]; gade.setRent("3"); break;
                case 19:
                case 20:
                case 22:
                case 23:
                    gade = (GUI_Street)felter[i]; gade.setRent("4"); break;
            }
        }

        bræt = new GUI(felter);
    }

    //Her "getter" vi brættet.
    public static GUI getBræt(){
        return bræt;
    }

    //TIlføjer køretøjer til spillerne
    public static void tilføjKøretøj(Spiller[] spillere) {
        for (Spiller spiller : spillere) {
            felter[0].setCar(spiller.getSpiller(), true);
        }
    }

    //Metoden viser når spilleren lander på fængselsfeltet, så bliver spilleren rykket til fængslet.
    public static void rykPåBrikken (Spiller spiller, int antalbiler) {
        felter[spiller.getFeltplacering()].setCar(spiller.getSpiller(), false);
        spiller.flytFeltPlacering(antalbiler);
        if (spiller.getFeltplacering() == 18) {
            smidSpillerIFængsel(spiller);
        } else {
            felter[spiller.getFeltplacering()].setCar(spiller.getSpiller(), true);
            feltHandling(spiller);
        }
    }

    //En anden metode der rykker på brikken.
    public static void rykPåBrik(Spiller spiller, int feltplacering, boolean chancekort) {
        felter[spiller.getFeltplacering()].setCar(spiller.getSpiller(), false);
        spiller.setFeltplacering(feltplacering);
        felter[spiller.getFeltplacering()].setCar(spiller.getSpiller(), true);
        feltHandling(spiller, chancekort);
    }

    //En tredje metode der rykker på brikken
    public static void rykPåBrik(Spiller spiller, int feltplacering) {
        rykPåBrik(spiller, feltplacering, false);
    }

    //denne metode smider spilleren i fængsel.
    public static void smidSpillerIFængsel(Spiller spiller) {
        spiller.setSpillerErBlevetFængslet(true);
        spiller.setFeltplacering(6);
        felter[6].setCar(spiller.getSpiller(), true);
    }

    //"Setter" om man ejer feltet
    public static void setFeltejer(int i, Spiller spiller) {
        feltejer[i] = spiller;
    }

    //"Getter det felt man ejer
    public static Spiller getFeltejer(int i) {
        return feltejer[i];
    }

    //Metoden viser om det ejendom man lander på er købt eller til salg
    public static void feltHandling(Spiller spiller, boolean gratis) {
        final int feltplacering = spiller.getFeltplacering();
        GUI_Field felt;
        GUI_Street gade;
        felt = bræt.getFields()[feltplacering];
        if (felt instanceof GUI_Street && !felt.getTitle().equals("Gratis")) {
            gade = (GUI_Street) felt;

            if (gade.getOwnableLabel() == null || gade.getOwnableLabel().trim().length() == 0) {
                if (!gratis) {
                    spiller.tilføjTilBeholdning(-parseInt(gade.getRent()));
                }
                gade.setBorder(spiller.getFarve());
                gade.setOwnableLabel("Købt");
                setFeltejer(feltplacering, spiller);
            } else {
                int rent = parseInt(gade.getRent());
                if (spiller != getFeltejer(feltplacering)) {
                    spiller.betalHusleje(rent, getFeltejer(feltplacering));
                }
            }
        } else if (feltplacering == 3 || feltplacering == 9 || feltplacering == 15 || feltplacering == 21) {
            Chancekort chancekort = Chancekort.getNæsteChanceKort();
            bræt.showMessage(chancekort.getBeskrivelse());
            chancekort.kør();
        }
    }

    //En anden handling, når man lander på et felt
    public static void feltHandling(Spiller spiller) {
        feltHandling(spiller, false);
    }

    //Så sætter man det op I GUI, ved hjælp af et ArrayList og klargøre felterne
    public static ArrayList<GUI_Field> getLedigefelter() {
        ArrayList<GUI_Field> felter = new ArrayList<GUI_Field>();
        for(int i = 0; i < bræt.getFields().length; i++) {
            if (getFeltejer(i) == null) {
                felter.add(bræt.getFields()[i]);
            }
        }
        return felter;
    }

}