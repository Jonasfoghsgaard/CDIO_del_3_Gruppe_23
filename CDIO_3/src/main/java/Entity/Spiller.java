package Entity;

import gui_fields.GUI_Car;
import gui_fields.GUI_Player;

import java.awt.*;

public class Spiller {
    private String navn;
    private GUI_Player spiller;
    private int beholdning;
    private boolean spillerErBlevetFængslet;
    private boolean spillerHarFængselsKortet;
    private static Color farve;
    private GUI_Car bil;
    private String spillerskøretøj;
    private int feltplacering;

    //En konstruktør, der viser hvad en spiller har.
    public Spiller(){
        beholdning = 0;
        feltplacering = 0;
        spillerErBlevetFængslet = false;
        spillerHarFængselsKortet = false;
        spillerskøretøj = "";

    }

    //En "set" metode, der viser køretøjets egenskaber.
    public void setBilType(String køretøj){
        if (køretøj.equals("Bil")){
            farve = new Color(255, 0, 0);
            bil = new GUI_Car(farve, Color.RED, GUI_Car.Type.CAR, GUI_Car.Pattern.FILL);
            spillerskøretøj = "Bil;";
        } else if (køretøj.equals("Racerbil")) {
            farve = new Color(255, 255, 0);
            bil = new GUI_Car(farve, Color.YELLOW, GUI_Car.Type.RACECAR, GUI_Car.Pattern.FILL);
            spillerskøretøj = "Racerbil";
        } else if (køretøj.equals("Traktor")) {
            farve = new Color(0, 255, 0);
            bil = new GUI_Car(farve, Color.GREEN, GUI_Car.Type.TRACTOR, GUI_Car.Pattern.FILL);
            spillerskøretøj = "Traktor";
        } else if (køretøj.equals("Ufo")) {
            farve = new Color(0, 0, 255);
            bil = new GUI_Car(farve, Color.BLUE, GUI_Car.Type.UFO, GUI_Car.Pattern.FILL);
            spillerskøretøj = "Ufo";
        } else {
            farve = new Color(213,63,119);
            bil = new GUI_Car(farve, Color.MAGENTA, GUI_Car.Type.RACECAR, GUI_Car.Pattern.FILL);
            spillerskøretøj = "Bil"; }
    }

    //En "get" metode, der hente returnerer farven.
    public static Color getFarve() {
        return farve;
    }

    //En "set" metode, der sætter navnet for spilleren i GUI
    public void setNavn(String navn){
        this.navn=navn;
        spiller = new GUI_Player(navn,beholdning,bil);
    }

    //En "Get" metode, der henter navnet
    public String getNavn() {
        return navn;
    }

    //Denne metode "setter" beholdningen, hensyntagen af det given parameter.
    public void setBeholdning(int beholdning) {
        if (beholdning>=0){
        this.beholdning = beholdning;
        }
    }

    //Get metode, der henter vores beholdning
    public int getBeholdning() {
        return beholdning;
    }

    //Denne metode er vigtig, da det "tilføjTilBeholdning" giver likvide midler på kontoen og det er en af de vigtigste elementer i koden.
    public void tilføjTilBeholdning(int penge){
        beholdning += penge;
        if (beholdning <= 0){
            beholdning = 0;
        }
    }

    //Her betales huslejen, det er lidt øv, men man skal jo tjene penge, ikke sandt?
    public void betalHusleje(int penge, Spiller spiller) {
        beholdning -= penge;
        spiller.tilføjTilBeholdning(penge);
    }

    //Denne metode "Setter" placering af felterne.
    public void setFeltplacering(int feltplacering) {
        this.feltplacering = feltplacering;
    }

    //Denne metode flytter spillerensplacering.
    public void flytFeltPlacering(int placering) {
        feltplacering += placering;
        if (feltplacering > 23) {
            feltplacering -= 24;
            tilføjTilBeholdning(2);
        }
    }

    //Endnu en "get" metode....
    public int getFeltplacering() {
        return feltplacering;
    }

    //Opretter en GUI_Player og får den returneret.
    public GUI_Player getSpiller() {
        return spiller;
    }


    //FÆNGSEL !!!!! Disse metoder viser de forskellige tilstande, når man skal i fængsel og kortet der kan få spilleren ud.

    public void setSpillerErBlevetFængslet(boolean fængslet) {
        this.spillerErBlevetFængslet = fængslet;
    }

    public boolean isSpillerErBlevetFængslet() {
        return spillerErBlevetFængslet;
    }

    public boolean spillerHarFængselsKortet() {
        return spillerHarFængselsKortet;
    }

    public void setSpillerHarFængselsKortet(boolean fængselsKortet) {
        this.spillerHarFængselsKortet = fængselsKortet;
    }}