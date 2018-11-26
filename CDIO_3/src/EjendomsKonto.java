public class EjendomsKonto {



    boolean ejet[] = new boolean[24];
    EjendomsKonto[] konto = new EjendomsKonto[Controller.regler.antalSpillere];

    EjendomsKonto() {

        for (int i = 0; i < 24; i++) {
            ejet[i] = false;
        }


    }

    void opretEjendomsKonto(){
        for (int i = 0; i < Controller.regler.antalSpillere; i++) {
            konto[i] = new EjendomsKonto();



            konto[i].ejet[3] = true;
        }
    }
}