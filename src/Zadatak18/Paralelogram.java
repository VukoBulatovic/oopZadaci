package Zadatak18;

public abstract class Paralelogram extends Figura {

    private double a;
    private double b;

    public Paralelogram(double a, double b) {
        if(a >= 0 && b >= 0){
        this.a = a;
        this.b = b;}
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    double obim() {
        return 2 * (a + b);
    }
}
