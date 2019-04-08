package generycznezoo;

public class Klatka<ZW extends Zwierzak, PD extends Podloze> {

    private ZW zwierzak;
    private  PD podloze;

    public Klatka(ZW zwierzak) {
        this.zwierzak = zwierzak;
    }

    public void uderzWKlatke(){
        this.zwierzak.dajGlos();
    }

    public Klatka(ZW zwierzak, PD podloze) {
        this.zwierzak = zwierzak;
        this.podloze = podloze;
    }
}
