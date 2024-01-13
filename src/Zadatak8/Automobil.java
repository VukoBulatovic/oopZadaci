package Zadatak8;

public class Automobil {

    private String marka;
    private int godiste;
    private int predjenaKilometraza;

    public Automobil(String marka, int godiste, int predjenaKilometraza) {
        this.marka = marka;
        this.godiste = godiste;
        this.predjenaKilometraza = predjenaKilometraza;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getGodiste() {
        return godiste;
    }

    public void setGodiste(int godiste) {
        this.godiste = godiste;
    }

    public int getPredjenaKilometraza() {
        return predjenaKilometraza;
    }

    public void setPredjenaKilometraza(int predjenaKilometraza) {
        this.predjenaKilometraza = predjenaKilometraza;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getMarka()).append(", ").append(getGodiste()).append(", ").append(getPredjenaKilometraza());
        return sb.toString();
    }
}
