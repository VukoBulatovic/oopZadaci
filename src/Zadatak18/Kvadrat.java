package Zadatak18;

public class Kvadrat extends Pravougaonik {
    public Kvadrat(double a) {
        super(a, a);
    }

    @Override
    String getIme() {
        return "Kvadrat";
    }
}
