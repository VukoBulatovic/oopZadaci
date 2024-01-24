package DZadatak1;

import java.util.ArrayList;

public abstract class Automobil {

    private ArrayList<Tocak> listaTockova;
    private int godiste;
    private double cena;

    public Automobil(ArrayList<Tocak> listaTockova, int godiste, double cena) {
        this.listaTockova = listaTockova;
        this.godiste = godiste;
        this.cena = cena;
    }

    public ArrayList<Tocak> getListaTockova() {
        return listaTockova;
    }

    public void setListaTockova(ArrayList<Tocak> listaTockova) {
        this.listaTockova = listaTockova;
    }

    public int getGodiste() {
        return godiste;
    }

    public void setGodiste(int godiste) {
        this.godiste = godiste;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

   public abstract boolean vratiOstecene(Tocak t);
   public abstract double cenaTockova();
   public abstract void zameniTocak();








}
