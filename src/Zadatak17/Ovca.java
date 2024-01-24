package Zadatak17;

public class Ovca extends DomacaZivotinja {

    public Ovca(String ime, double kilaza) {
        super("Ovca", ime, kilaza, 4);
    }

    public Ovca() {
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
        System.out.println("meeeeeeeee");
    }
}
