package Zadatak18;

public abstract class Oblik {

    public Oblik() {
    }

    abstract double obim();
    abstract double povrsina();
    abstract double zapremina();
    abstract String getIme();

    public String getOsobine(){
        StringBuilder sb = new StringBuilder();
        sb.append("Obim: ").append(obim()).append("\n");
        sb.append("Povrsina: ").append(povrsina()).append("\n");
        sb.append("Zapremina: ").append(zapremina());
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getIme()).append("\n");
        sb.append(getOsobine());
        return sb.toString();
    }

}
