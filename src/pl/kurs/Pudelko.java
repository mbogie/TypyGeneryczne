package pl.kurs;

public class Pudelko<T extends Rzecz>{

    private  T[] zawartosc;

    public Pudelko(T[] zawartosc) {
        this.zawartosc = zawartosc;
    }

    public T[] getZawartosc() {
        return zawartosc;
    }

    public void wyswietlCoWPudelku(){
        System.out.println(zawartosc[0].getClass().getName());
    }
}
