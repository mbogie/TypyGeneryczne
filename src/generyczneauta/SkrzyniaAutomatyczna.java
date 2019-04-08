package generyczneauta;

public class SkrzyniaAutomatyczna implements Skrzynia {
    @Override
    public void dlaKogo() {
        System.out.println("auto dla bardziej wymagajacych");
    }
}
