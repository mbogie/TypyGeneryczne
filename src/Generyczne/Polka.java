package Generyczne;

public class Polka<T extends ArtykulySpozywcze> {

    private T[] coZawiera;

    public Polka(T[] coZawiera) {
        this.coZawiera = coZawiera;
    }

    public T[] getCoZawiera() {
        return coZawiera;
    }

    public void wyswietlCoStoi(){
        System.out.println(coZawiera[0].getClass().getName());
    }
}
