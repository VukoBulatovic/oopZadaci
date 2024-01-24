package Zadatak17;

public class Kokoska extends DomacaZivotinja {

    public Kokoska(String ime, double kilaza) {
        super("Kokoska", ime, kilaza, 2);
    }

    public Kokoska() {
    }

    @Override
    public boolean daLiSeJedem() {
        return true;
    }

    @Override
    void leti() {
        System.out.println("Ja letim");
    }

    @Override
    void pliva() {
        System.out.println("Ja ne plivam");
    }

    @Override
    int brojNogu() {
        return super.brojNogu();
    }

    @Override
    boolean daLiJeDomaca() {
        return super.daLiJeDomaca();
    }

    @Override
    void oglasiSe() {
        System.out.println("kukuriku");
    }
}
