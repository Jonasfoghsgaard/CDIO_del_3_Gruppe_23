public class Transaktioner {



    public static void betalPenge(int betaler, int modtager, int pengeMængde){
       SpillerKonto.kontoListe[betaler].setPenge(SpillerKonto.kontoListe[betaler].getPenge()-pengeMængde);
       SpillerKonto.kontoListe[modtager].setPenge(SpillerKonto.kontoListe[modtager].getPenge()+pengeMængde);
    }



    public void passerStart (int modtager){
        SpillerKonto.kontoListe[modtager].setPenge(SpillerKonto.kontoListe[modtager].getPenge()+2);
    }

}
