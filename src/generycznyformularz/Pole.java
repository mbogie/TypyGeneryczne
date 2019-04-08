package generycznyformularz;


import java.util.Objects;

public class Pole<P> {

    private P zawartosc;
    private String format;

    public Pole(String format){

    }

    public Pole() {
        this.format = format;
    }

    public void uzupelnijZawartosc(P zawartosc){
        if(this.zawartosc instanceof String && Objects.nonNull(format) && Objects.nonNull(zawartosc)) {                            //sprawdza czy zawartosc jest z klasy String
            boolean matches = ((String) this.zawartosc).matches(format);
            if (!matches){
                throw new IllegalStateException("Niepoprawny format");
            }
        }
        this.zawartosc = zawartosc;
    }

    public void wyczysc(){
        this.zawartosc = null;
    }

    public P getZawartosc() {
        return zawartosc;
    }
}


