package Zadatak17;

public class Macka extends DomacaZivotinja {

    public Macka(String ime, double kilaza) {
        super("Macka", ime, kilaza, 4);
    }

    public Macka() {
    }

    @Override
    public boolean daLiSeJedem() {
        return false;
    }

    @Override
    void leti() {
        System.out.println("Ja ne letim!");
    }

    @Override
    void pliva() {
        System.out.println("Ja ne plivam");
    }

    @Override
    int brojNogu() {
        return 4;
    }

    @Override
    boolean daLiJeDomaca() {
        return true;
    }

    @Override
    void oglasiSe() {
        System.out.println("mjauuu mjauu");
    }
}
