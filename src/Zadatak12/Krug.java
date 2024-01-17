package Zadatak12;

public class Krug extends Elipsa {

    private double r;

    public Krug(double r){
        super(r,r);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double obim(){
        return 2*r*Math.PI;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Elipsa poluprecnika ").append(r).append(" ima").append("\n");
        sb.append("Obim: ").append(obim()).append("\n");
        sb.append("Povrsinu: ").append(povrsina()).append("\n");
        sb.append("Excentricitet: ").append(ekcentricitet());
        return sb.toString();
    }
}
