package Entity;

import java.util.Random;
public class Terning {


    Random terning = new Random();

    int øjne;

    public int slåMedTerning() {
            øjne = terning.nextInt(6)+1 ;

        return øjne;}


    public int getØjne() {
        return øjne;
    }

}







