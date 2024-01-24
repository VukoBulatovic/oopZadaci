package Zadatak19;

public class Voz implements Pokretljivo {

    private TipVoza tipVoza;
    private int brojVagona;

    public Voz(TipVoza tipVozaa, int brojVagona) {
        this.tipVoza = tipVozaa;
        this.brojVagona = brojVagona;
    }


    @Override
    public void pokreniSe() {
        System.out.println("Dobio sam zeleno svetlo.");
    }

    @Override
    public String potrosnja() {
        return "Struja";
    }

    public TipVoza getTipVoza() {
        return tipVoza;
    }

    public void setTipVoza(TipVoza tipVoza) {
        this.tipVoza = tipVoza;
    }

    public int getBrojVagona() {
        return brojVagona;
    }

    public void setBrojVagona(int brojVagona) {
        this.brojVagona = brojVagona;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getTipVoza()).append(" sa ").append(getBrojVagona()).append(" vagona.");
        return sb.toString();
    }
}
