package Zadatak14;

import java.util.ArrayList;

public class Odgajivac extends Vlasnik {

    private String kategorija;

    public Odgajivac(String ime, String prezime, int brGod, ArrayList<Ljubimac> ljubimci, String kategorija) {
        super(ime, prezime, brGod, ljubimci);
        this.kategorija = kategorija;
    }

    public Odgajivac(String ime, String prezime, int brGod, String kategorija) {
        super(ime, prezime, brGod);
        this.kategorija = kategorija;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    //1. ispisiSveLjubimceKojeOdgajas() - koja ispisuje sve ljubimce koje odgajivac odgaja.

    public void ispisiSveLjubimceKojeOdgajas(){
        System.out.println(getLjubimci());
    }

    //2. vratiSveLjubimceKojeOdgajas() - koja vraca ArrayListu ljubimaca koje odgajivac odgaja.
    //Odgajivac odgaja one ljubimce ciji se tip poklapa sa Kategorijom odgajivaca
    //(npr Odgajivac.kategorija = "Pas", Ljubimac.red = "Pas")
    //public ArrayList<Ljubimac> vratiSveLjubimceKojeOdgajas(){
    public ArrayList<Ljubimac> vratiSveLjubimceKojeOdgajas(){
        ArrayList<Ljubimac> al = new ArrayList<>();
        for (Ljubimac lj : ljubimci)
            if(lj.getRed().equals(kategorija)){
            al.add(lj);
        }
        return al;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("A odgaja ljubimce: ").append("\n");
        sb.append(vratiSveLjubimceKojeOdgajas());

        return sb.toString();
    }
}

