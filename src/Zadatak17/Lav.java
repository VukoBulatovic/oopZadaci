package Zadatak17;

public class Lav extends DivljaZivotinja{

    public Lav() {
        super("Lav", 4, "Savana");
    }

    @Override
    public boolean daLiSamOpasna() {
        return true;
    }

    @Override
    void leti() {
        System.out.println("Ja ne letim");
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
    void oglasiSe() {
        System.out.println("roarrrr");
    }
}
