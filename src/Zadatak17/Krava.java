package Zadatak17;

public class Krava extends DomacaZivotinja {

    public Krava(String naziv, String ime, double kilaza, int brojNogu) {
        super(naziv, ime, kilaza, brojNogu);
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ja sam ").append("\n");
        sb.append(getNaziv()).append(" ").append(getIme()).append(" i imam ")
                .append(getKilaza()).append(" kilograma i imam ").append(getBrojNogu()).append(" noge\n");
        return sb.toString();
    }
}
