package Zadatak14;

public class Osoba {

    private String ime;
    private String prezime;
    private int brGodina;

    public Osoba(String ime, String prezime, int brGod) {
        this.ime = ime;
        this.prezime = prezime;
        this.brGodina = brGod;
    }

    public Osoba() {
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBrGodina() {
        return brGodina;
    }

    public void setBrGodina(int brGodina) {
        this.brGodina = brGodina;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getIme()).append(" ").append(getPrezime()).append(" ").append(brGodina);
        return sb.toString();
    }

}
