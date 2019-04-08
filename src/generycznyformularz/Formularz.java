package generycznyformularz;

public class Formularz {

    private Pole[] pola;

    public Formularz(Pole[] pola) {
        this.pola = pola;
    }

    public void zapisz(){
        System.out.println("Zapisane");
    }

    public void wyswietlZawartosc(){
        for(Pole pole : pola){
            System.out.println(pole.getZawartosc());
        }

    }
}
