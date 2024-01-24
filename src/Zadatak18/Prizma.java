package Zadatak18;

public class Prizma extends Paralelopiped {


    public Prizma(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    double povrsina() {
        return 2 * (getA() * getB() + getB() * getC() + getC() * getA());
    }

    @Override
    double zapremina() {
        return getA() * getB() * getC();
    }

    @Override
    String getIme() {
        return "Prizma";
    }
}
