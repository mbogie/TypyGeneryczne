package generyczneauta;

public class Main {

    public static void main(String[] args) {

        Samochod<Silnik,Skrzynia> auto1 = new Samochod<>(new SilnikElektryczny(), new SkrzyniaAutomatyczna());
        Samochod<Silnik,Skrzynia> auto2 = new Samochod<Silnik, Skrzynia>(new SilnikSpalinowy(), new SkrzyniaManualna());

        auto1.przekrecKluczyk();
        auto2.przekrecKluczyk();

        Samochod<Silnik,Skrzynia> auto3 = new Samochod<Silnik, Skrzynia>(new SkrzyniaAutomatyczna());
        auto3.dlaKogo();
        auto2.dlaKogo();
    }
}
