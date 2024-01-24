package Zadatak17;

public class Krava extends DomacaZivotinja {

    public Krava(String ime, double kilaza) {
        super("Krava", ime, kilaza, 4);
    }

    public Krava() {
    }

    @Override
    public boolean daLiSeJedem() {
        return true;
    }

    @Override
    void leti() {
        System.out.println("Ja ne letim!");
    }

    @Override
    void pliva() {
        System.out.println("Ja ne plivam!");
    }

    @Override
    int brojNogu() {
        return super.brojNogu();
    }

    @Override
    void oglasiSe() {
        System.out.println("muuuuuuuuu");
    }

    @Override
    public String getIme() {
        return super.getIme();
    }

    @Override
    boolean daLiJeDomaca() {
        return true;
    }


}
