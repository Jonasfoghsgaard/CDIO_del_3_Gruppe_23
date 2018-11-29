package Entity;

import Game.Controller;

public class SpillerKonto {




    public boolean[] ejet;



     private int penge;
     public int getPenge() { return penge; }
     public void setPenge(int penge) {
         this.penge = penge;
     }




      SpillerKonto() {
          setPenge(Controller.regler.startPenge()); // startBeløb på hver konto



          ejet = new boolean[24]; // Viser hvad man ejer
          for (int i = 0; i <24 ; i++) {
            ejet[i] = false;
          }


     }


 }

