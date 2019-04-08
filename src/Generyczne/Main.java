package Generyczne;

public class Main {

    public static void main(String[] args) {

        Napoje[] napoj = {new Napoje()};
        Polka<Napoje> polkaNaNapoje = new Polka<>(napoj);
        polkaNaNapoje.wyswietlCoStoi();

        Slodycze[] cukierek = {new Slodycze()};
        Polka<Slodycze> polkaNaSlodycze = new Polka<>(cukierek);
        polkaNaSlodycze.wyswietlCoStoi();

        Samochod[] auto = {new Samochod()};
      //  Polka<Samochod> polkaNaAuta = new Polka<>(auto);  nie dziala bo nie podpiety pod interfejs Artykuly spozywcze

    }
}
