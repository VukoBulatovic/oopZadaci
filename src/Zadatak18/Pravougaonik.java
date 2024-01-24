package Zadatak18;

public class Pravougaonik extends Paralelogram {


    public Pravougaonik(double a, double b) {
        super(a, b);
    }

    @Override
    double povrsina() {
        return super.getA() * super.getB();
    }

    @Override
    String getIme() {
        return "Pravougaonik";
    }
}
