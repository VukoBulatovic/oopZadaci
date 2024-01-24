package Zadatak17;

public class Zmija extends DivljaZivotinja {

    public Zmija() {
        super("Zmija", 0, "Kamenito");
    }

    @Override
    public boolean daLiSamOpasna() {
        return true;
    }

    @Override
    void leti() {
        System.out.println("Ja ne letim!");
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
        System.out.println("sssssssssssss");;
    }
}
