package Zadatak13;

import java.util.Objects;

public class Namirnica {

    private String ime;
    private double cena;

    public Namirnica(String ime, double cena) {
        this.ime = ime;
        this.cena = cena;

        if(ime == null)
            this.ime = "";
        if(cena < 0)
            this.cena = 0;
    }

    public Namirnica() {
        this.ime = "";
        this.cena = 0;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Namirnica namirnica = (Namirnica) o;
        return Double.compare(cena, namirnica.cena) == 0 && Objects.equals(ime, namirnica.ime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ime, cena);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ime).append(" | ").append(cena);
        return sb.toString();
    }
}
