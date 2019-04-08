package generyczneauta;

public class Samochod<SI extends Silnik, SK extends Skrzynia>{

    private SI rodzajSilnika;
    private SK rodzajSkrzyni;

    public Samochod(SI rodzajSilnika, SK rodzajSkrzyni) {
        this.rodzajSilnika = rodzajSilnika;
        this.rodzajSkrzyni = rodzajSkrzyni;
    }

    public Samochod(SK rodzajSkrzyni) {
        this.rodzajSkrzyni = rodzajSkrzyni;
    }

    public Samochod(SI rodzajSilnika) {

        this.rodzajSilnika = rodzajSilnika;
    }

    public void przekrecKluczyk(){
        this.rodzajSilnika.Odpal();
    }
    public void dlaKogo (){
        this.rodzajSkrzyni.dlaKogo();
    }
}
