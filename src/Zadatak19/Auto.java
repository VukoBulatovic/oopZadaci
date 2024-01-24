package Zadatak19;

public class Auto extends Vozilo {


    public Auto(String marka, String tip, double kilometraza) {
        super(marka, tip, kilometraza);
    }

    @Override
    public void pokreniSe() {
        System.out.println("Vozim");
    }

    @Override
    public String potrosnja() {
        return "Dizel";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getMarka()).append(" ").append(getTip()).
                append(" je presao ").append(getKilometraza()).append(" km.");
        return sb.toString();
    }
}
