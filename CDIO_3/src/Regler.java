import java.util.Scanner;

public class Regler
{

    int antalSpillere;


    Scanner scanner = new Scanner(System.in);



    Regler(){
        System.out.println("Indtast antal Spillere: ");
        antalSpillere = scanner.nextInt();

        while (antalSpillere < 2) {
            System.out.println("Der skal minimum være 2 spillere.");
            System.out.println("Indtast igen antal Spillere: ");
            antalSpillere = scanner.nextInt();
        }

        while (antalSpillere > 4) {
            System.out.println("Der må maks være 4 spillere: ");
            System.out.println("Indtast igen antal spillere: ");
            antalSpillere = scanner.nextInt();
        }

    }



}
