package generycznyformularz;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Pole<String> emial = new Pole<>(null);
        Pole<String> imie = new Pole<>(null);
        Pole<String> nazwisko = new Pole<>(null);
        Pole<LocalDate> dataUrodzenia = new Pole<>(null);
        Pole<Integer> ulubionaLiczba = new Pole<>(null);

        emial.uzupelnijZawartosc("m.bogusz@o2.pl");
        imie.uzupelnijZawartosc("Michal");
        dataUrodzenia.uzupelnijZawartosc(LocalDate.now().minusYears(32));
        ulubionaLiczba.uzupelnijZawartosc(10);

        Pole [] pola = {emial,imie,nazwisko,dataUrodzenia,ulubionaLiczba};
        Formularz formularz = new Formularz(pola);

        formularz.wyswietlZawartosc();

    }

}
