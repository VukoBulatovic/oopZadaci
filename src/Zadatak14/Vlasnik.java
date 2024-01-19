package Zadatak14;

import java.util.ArrayList;

public class Vlasnik extends Osoba {
    ArrayList<Ljubimac> ljubimci;

    public Vlasnik(String ime, String prezime, int brGod, ArrayList<Ljubimac> ljubimci) {
        super(ime, prezime, brGod);
        this.ljubimci = ljubimci;
    }

    public Vlasnik(String ime, String prezime, int brGod) {
        super(ime, prezime, brGod);
        this.ljubimci = new ArrayList<>();
    }

    public ArrayList<Ljubimac> getLjubimci() {
        return ljubimci;
    }

    public void setLjubimci(ArrayList<Ljubimac> ljubimci) {
        this.ljubimci = ljubimci;
    }

    //1. dodajLjubimca - koja dodaje ljubimca u listu ljubimaca
    public void dodajLjubimca(Ljubimac lj){
        this.ljubimci.add(lj);
    }

    //2. oduzmiLjubimca - koja oduzima ljubimca iz liste ljubimaca
    public void oduzmiLjubimca(Ljubimac lj){
        this.ljubimci.remove(lj);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(" ima ljubimce:").append("\n");
        sb.append(ljubimci).append("\n");
        return sb.toString();
    }
}
