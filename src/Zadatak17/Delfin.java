package Zadatak17;

public class Delfin extends DivljaZivotinja {

    public Delfin() {
        super("Delfin", 0, "More");
    }

    @Override
    public boolean daLiSamOpasna() {
        return false;
    }

    @Override
    void leti() {
        System.out.println("Ja ne letim");
    }

    @Override
    void pliva() {
        System.out.println("Ja plivam!");
    }

    @Override
    int brojNogu() {
        return super.brojNogu();
    }

    @Override
    void oglasiSe() {
        System.out.println("<3");
    }
}
