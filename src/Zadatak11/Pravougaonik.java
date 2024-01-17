package Zadatak11;

import java.util.Objects;

public class Pravougaonik {

    private double a;
    private double b;

    public Pravougaonik(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Pravougaonik() {
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

    public double obim() {
        return (2*a) + (2*b);
    }

    public double povrsina(){
        return a * b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pravougaonik that = (Pravougaonik) o;
        return Double.compare(a, that.a) == 0 && Double.compare(b, that.b) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
