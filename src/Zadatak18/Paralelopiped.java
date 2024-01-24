package Zadatak18;

public abstract class Paralelopiped extends Telo{

    private double a;
    private double b;
    private double c;

    public Paralelopiped(double a, double b, double c) {
        if(a > 0 && b > 0 && c > 0){
        this.a = a;
        this.b = b;
        this.c = c;}
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    double obim() {
        return 4 * (a + b + c);
    }
}
