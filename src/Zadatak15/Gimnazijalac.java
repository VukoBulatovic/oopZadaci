package Zadatak15;

import java.util.ArrayList;

public class Gimnazijalac extends Ucenik {

    private String maturski;

    public Gimnazijalac(String ime, String prezime, int brGod, ArrayList<Double> ocene, String maturski) {
        super.setIme(ime);
        super.setPrezime(prezime);
        super.setBrGodina(brGod);
        if(brGod < 15 || brGod > 19){
            super.setBrGodina(15);
        }
        super.ocene = ocene;
        this.maturski = maturski;
    }

    public Gimnazijalac() {
        this.maturski = "";
    }

    public String getMaturski() {
        return maturski;
    }

    public void setMaturski(String maturski) {
        this.maturski = maturski;
    }

    @Override
    public double prosek() {
        double pr = super.prosek() - 0.1;
        if(pr < 1.0){
            pr = 1.0;
        }
        return pr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getIme()).append(" ").append(super.getPrezime()).
                append(" ").append(getBrGodina()).append(" pohadja gimnaziju.").append("\n");
        sb.append("Ocene: ").append(ocene).append("\n");
        sb.append("Prosek: ").append(prosek());
        return sb.toString();
    }
}
