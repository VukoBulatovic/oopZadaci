package Zadatak14;

public class Ljubimac {

    private String ime;
    private String red;
    private int brojNogu;
    private boolean leti;
    private double tezina;

    public Ljubimac(String ime, String red, int brojNogu, boolean leti, double tezina) {
        this.ime = ime;
        this.red = red;
        this.brojNogu = brojNogu;
        this.leti = leti;
        this.tezina = tezina;
    }

    public Ljubimac() {
        this.ime = "";
        this.red = "";
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getRed() {
        return red;
    }

    public void setRed(String red) {
        this.red = red;
    }

    public int getBrojNogu() {
        return brojNogu;
    }

    public void setBrojNogu(int brojNogu) {
        this.brojNogu = brojNogu;
    }

    public boolean isLeti() {
        return leti;
    }

    public void setLeti(boolean leti) {
        this.leti = leti;
    }

    public double getTezina() {
        return tezina;
    }

    public void setTezina(double tezina) {
        this.tezina = tezina;
    }

    //pomocna metoda za ispis
    public String letiNeLeti(){
        if(!leti)
            return "ne leti";
         else
            return "leti";
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ime ljubimca je: ").append(ime).append("\n");
        sb.append("Tip ljubimca je: ").append(red).append("\n");
        sb.append(ime).append(" ima ").append(brojNogu).append(" nogu").append("\n");
        sb.append(ime).append(" ").append(letiNeLeti()).append("\n");
        sb.append(ime).append(" je tezak: ").append(tezina).append("\n");

        return sb.toString();
    }


}
