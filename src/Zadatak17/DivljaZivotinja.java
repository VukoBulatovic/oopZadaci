package Zadatak17;

public abstract class DivljaZivotinja extends Zivotinja {

    private int brojNogu;
    private String staniste;

    public DivljaZivotinja(String naziv, int brojNogu, String staniste) {
        super(naziv);
        this.brojNogu = brojNogu;
        this.staniste = staniste;
    }

    public DivljaZivotinja() {
    }

    public int getBrojNogu() {
        return brojNogu;
    }

    public void setBrojNogu(int brojNogu) {
        this.brojNogu = brojNogu;
    }

    public String getStaniste() {
        return staniste;
    }

    public void setStaniste(String staniste) {
        this.staniste = staniste;
    }

    public abstract boolean daLiSamOpasna();

    @Override
    void leti() {
    }

    @Override
    void pliva() {
    }

    @Override
    int brojNogu() {
        return 0;
    }

    @Override
    boolean daLiJeDomaca() {
        return false;
    }

    @Override
    void oglasiSe() {
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ja sam ").append(getNaziv()).append(" ").append(" i imam ").append(getBrojNogu()).append(" noge\n");
        sb.append("Da li sam domaca zivotinja : ").append(daLiJeDomaca()).append("\n");
        sb.append("Da li sam opasna: ").append(daLiSamOpasna());
        return sb.toString();
    }

}
