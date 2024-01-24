package Zadatak19;

public abstract class Vozilo implements Pokretljivo {

    private String marka;
    private String tip;
    private double kilometraza;

    public Vozilo(String marka, String tip, double kilometraza) {
        this.marka = marka;
        this.tip = tip;
        if(kilometraza > 0)
            this.kilometraza = kilometraza;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public double getKilometraza() {
        return kilometraza;
    }

    public void setKilometraza(double kilometraza) {
        this.kilometraza = kilometraza;
    }

}
