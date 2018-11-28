public class Transaktioner {










    public static void betalPenge(int betaler, int modtager, int pengeMængde){
       Controller.spillere[betaler].sKonto.setPenge(Controller.spillere[betaler].sKonto.getPenge()-pengeMængde);
       Controller.spillere[modtager].sKonto.setPenge(Controller.spillere[modtager].sKonto.getPenge()+pengeMængde);
    }

    public static void betalTilBank(int betaler, int pengeMængde){
        Controller.spillere[betaler].sKonto.setPenge(Controller.spillere[betaler].sKonto.getPenge()-pengeMængde);
    }

    public static void passerStart (int modtager){
        Controller.spillere[modtager].sKonto.setPenge(Controller.spillere[modtager].sKonto.getPenge()+2);
    }

}
