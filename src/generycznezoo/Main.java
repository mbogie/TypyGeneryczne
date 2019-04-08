package generycznezoo;

public class Main {

    public static void main(String[] args) {

    Pies pies = new Pies();
    Kot kot = new Kot();

    Klatka<Pies, Trawa> klatkaDlaPsa = new Klatka<>(pies, new Trawa());
    Klatka<Kot, Piasek> klatkaDlaKota = new Klatka<>(kot, new Piasek());

    klatkaDlaKota.uderzWKlatke();
    klatkaDlaPsa.uderzWKlatke();
    }

}



