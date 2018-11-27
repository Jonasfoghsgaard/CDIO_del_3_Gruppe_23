import java.util.Scanner;

public class Spiller {

    SpillerKonto sKonto = new SpillerKonto();
    Scanner scanner = new Scanner(System.in);




    private String name = "";
    private int alder;
    private int placering;
    boolean alleredeIFængsel;
    String getName() {return name; }
    int getAlder() {return alder;}
    int getPlacering() { return placering;}

    public void setPlacering(int placering) {
        this.placering = placering;
    }
    public void setName (String name) {this.name = name; }
    public void setAlder(int alder) {this.alder = alder; }
    public void setalleredeIFængsel(boolean ForT) {this.alleredeIFængsel = alleredeIFængsel;}


    Spiller() {
        alleredeIFængsel = false;
        placering = 0;

        System.out.println("Indtast navn: ");
        setName(scanner.next());
        System.out.println("Indtast alder: ");
        setAlder(21);


        while (alder < 10 || alder > 100) {
        if (alder < 10) {
        System.out.println("Du er for ung til at spille Monopoly Junior");
        System.out.println("Indtast ny alder: ");
        alder = scanner.nextInt(); }

        if (alder > 100){
        System.out.println("Du er for død til at spille Monopoly Junior");
        System.out.println("Indtast ny alder: ");
        alder = scanner.nextInt();

        }


        }
    }



}



