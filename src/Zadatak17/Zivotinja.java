package Zadatak17;

public abstract class Zivotinja {

    private String naziv;

    public Zivotinja(String naziv) {
        this.naziv = naziv;
    }

    public Zivotinja() {
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    //abstraktne metode:

    abstract void leti();
    abstract void pliva();
    abstract int brojNogu();
    abstract boolean daLiJeDomaca();
    abstract void oglasiSe();

}
