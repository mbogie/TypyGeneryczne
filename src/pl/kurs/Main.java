package pl.kurs;

public class Main {

    public static void main(String[] args) {
	// typy genetyczne - uniwersalne klasy na wszystko,
        // podstawiam domyslna zmienna ktora przy wywolywaniu ustawiam

        Ksiazka[] ksiazki = {new Ksiazka()};
        Pudelko<Ksiazka> pudelkoNaKsiazki = new Pudelko<>(ksiazki);


        Ubranie[] ubrania = {new Ubranie()};
        Pudelko<Ubranie> pudelkoNaUbrania = new Pudelko<>(ubrania);

        // kot nie nalezy do interfejsu Rzecz wiec nie mozna przypisac do pudelka
        Kot[] koty = {new Kot()};
       // Pudelko<Kot> pudelkoNaKoty = new Pudelko<>(koty);

        pudelkoNaKsiazki.wyswietlCoWPudelku();
        pudelkoNaUbrania.wyswietlCoWPudelku();
    }


}
