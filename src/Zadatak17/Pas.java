package Zadatak17;

public class Pas extends DomacaZivotinja {


    public Pas(String ime, double kilaza) {
        super("Pas", ime, kilaza, 4);
    }

    public Pas() {
    }

    @Override
    public boolean daLiSeJedem() {
        return false;
    }

    @Override
    public String getIme() {
        return super.getIme();
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
        System.out.println("wooof woof");
    }
}
