package Zadatak9;

import java.util.ArrayList;

public class Odeljenje {

    private String oznaka;
    private ArrayList<Ucenik> dnevnik;

    public Odeljenje(String oznaka, ArrayList<Ucenik> dnevnik) {
        this.oznaka = oznaka;
        this.dnevnik = dnevnik;
    }

    public Odeljenje(String oznaka) {
        this.oznaka = oznaka;
        this.dnevnik = new ArrayList<>();
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public ArrayList<Ucenik> getDnevnik() {
        return dnevnik;
    }

    public void setDnevnik(ArrayList<Ucenik> dnevnik) {
        this.dnevnik = dnevnik;
    }

    //Napisati metod upisiUcenika(Ucenik u) koja dodaje ucenika {u} u dnevnik.

    public void upisiUcenika(Ucenik u){
        for (int i = 0; i < dnevnik.size(); i++) {
            dnevnik.add(u);
        }
    }

    //pomocna metoda za ispis imena i prezimena iz dnevnika
    public String imePrezime(){
        StringBuilder s = new StringBuilder();
        for (Ucenik ucenik : dnevnik) {
            s.append(ucenik.getIme()).append(" ").append(ucenik.getPrezime()).append("\n");
        }
        return s.toString();
    }

    //Napisati metod upisiUcenika(Ucenik u,
    //int redniBroj) koji dodaje ucenika {u} u dnevnik na redni broj {redniBroj}
    public void upisiUcenika(Ucenik u, int redniBroj){
        dnevnik.add(redniBroj,u);
    }

    //Napisati metod ispisiUcenika(Ucenik u) koja brise ucenika {u} iz dnevnika.
    public void ispisiUcenika(Ucenik u){
        dnevnik.remove(u);
    }

    //Napisati metod ispisiUcenika(int i) koja brise ucenika na poziciji {i} u dnevniku.
    public void ispisiUcenika(int i){
        dnevnik.remove(i);
    }

    //Napisati metod pogledajOcene(Ucenik u) koja ispisuje sve ocene ucenika {u}.
    public void pogledajOcene(Ucenik u){
        System.out.println(u.getOcene());
    }

    //Napisati metod pogledajOcene(int i) koja ispisuje sve ocene ucenika na poziciji {i} u dnevniku.
    public void pogledajOcene(int i){
        for (int j = 0; j < dnevnik.size(); j++) {
            if(i == j){
                System.out.println(getDnevnik().get(j).getOcene());
            }
        }
    }

    //Napisati metod prosecnaOcena(Ucenik u) koja ispisuje prosecnu ocenu ucenika {u}.
    public void prosecnaOcena(Ucenik u){
        System.out.println(u.prosek());
    }

    //Napisati metod prosecnaOcena(int i) koja ispisuje prosecnu ocenu ucenika na poziciji {i} u dnevniku.
    public void procecnaOcena(int i){
        System.out.println(dnevnik.get(i).prosek());
    }

    //Napisati metod prosecnaOcenaOdeljenja() koja vraca prosecnu ocenu celog odeljenja (0, ako nema ucenika u odeljenju).
    public double prosecnaOcenaOdeljenja(){
        if (dnevnik == null || dnevnik.isEmpty()) {
            return 0;
        }
        double zbirProseka = 0;
        for (Ucenik ucenik : dnevnik) {
            zbirProseka += ucenik.prosek();
        }

        return zbirProseka / dnevnik.size();
    }

    //Napisati metod opisnaOcena(Ucenik u) koja ispisuje:
    public void opisnaOcena(Ucenik u){
        if (u.getOcene().contains(1)) {
            System.out.println("Nedovoljan");
        } else if(u.prosek() >= 4.5){
            System.out.println("Odlican");
        } else if (u.prosek() >= 3.5){
            System.out.println("Vrlo dobar");
        } else if (u.prosek() >= 2.5){
            System.out.println("Dobar");
        } else if (u.prosek() >= 1.5) {
            System.out.println("Dovoljan");
        }
    }

    //Napisati metod izlistajDnevnik() koja vraca String oblika:
    //	{ime} i {prezime} ima ocene:
    //	{ocene}
    //za sve ucenike.
    public String izlistajDnevnik(){
        StringBuilder s = new StringBuilder();
        for (Ucenik u : dnevnik) {
            s.append(u.getIme()).append(" ").append(u.getPrezime()).append(" : ").append("\n");
            s.append(u.getOcene()).append("\n");
        }
        return s.toString();
    }

    //Napisati metod String velicinaOdeljenja() koja vraca odgovarajucu poruku:
    //	- "Veliko odeljenje"; ako ima vise od 25 ucenika
    //	- "Srednje odeljenje"; ako ima ucenika izmedju 15 i 25
    //	- "Malo odeljenje"; ako ima ucenika manje od 15
    public String velicinaOdeljenja(){
        String s = "";
        if(dnevnik.size() > 25){
            s = "Veliko odeljenje";
        } else if (dnevnik.size() >= 15) {
            s = "Srednje odeljenje";
        } else {
            s = "Malo odeljenje";
        }
        return s;
    }

    //Napisati toString() metod:
    //	{Oznaka} odeljenja ima djake:
    //	{Ime1} {Prezime1}
    //	{Ime2} {Prezime2}
    //	.
    //	.
    //	.
    //	{ImeN} {PrezimeN}*/

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(oznaka).append(" odeljenje ima djake: ").append("\n");
        sb.append(imePrezime());

        return sb.toString();

    }
}
