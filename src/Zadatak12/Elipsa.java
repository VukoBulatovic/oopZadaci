package Zadatak12;

import java.util.Objects;

public class Elipsa {

    private double a;
    private double b;

    public Elipsa(double a, double b) {
        if(a < b){
            double t = a;
            a = b;
            b = t;
        }
        this.a = a;
        this.b = b;
    }


    public Elipsa() {
    }

    public double vecaPoluosa() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double manjaPoluosa() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Elipsa elipsa = (Elipsa) o;
        return Double.compare(a, elipsa.a) == 0 && Double.compare(b, elipsa.b) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    public double povrsina(){
        return a*b*Math.PI;
    }

    public double ekcentricitet(){
        return Math.sqrt(1 - (b * b) / (a * a));
    }

    //pomocna za ispis
    public String ispisPiE(){
        StringBuilder sb = new StringBuilder();
        sb.append("Povrsinu : ").append(povrsina()).append("\n");
        sb.append("Excentricitet: ").append(ekcentricitet());
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Elipsa vece poluose: ").append(vecaPoluosa()).append(" i manje poluose: ")
                .append(manjaPoluosa()).append(" ima").append("\n");
        sb.append(ispisPiE());
        return sb.toString();
    }
}
