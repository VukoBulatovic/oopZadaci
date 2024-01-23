package Zadatak17;

public abstract class DomacaZivotinja extends Zivotinja {

    private String ime;
    private double kilaza;
    private int brojNogu;

    public DomacaZivotinja(String naziv, String ime, double kilaza, int brojNogu) {
        super(naziv);
        this.ime = ime;
        this.kilaza = kilaza;
        this.brojNogu = brojNogu;
    }

    public DomacaZivotinja() {
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getKilaza() {
        return kilaza;
    }

    public void setKilaza(double kilaza) {
        this.kilaza = kilaza;
    }

    public int getBrojNogu() {
        return brojNogu;
    }

    public void setBrojNogu(int brojNogu) {
        this.brojNogu = brojNogu;
    }

    public abstract boolean daLiSeJedem();

    @Override
    void leti() {
    }

    @Override
    void pliva() {
    }

    @Override
    int brojNogu() {
        return brojNogu;
    }

    @Override
    boolean daLiJeDomaca() {
        return false;
    }

    @Override
    void oglasiSe() {
    }
}
