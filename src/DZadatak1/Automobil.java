package DZadatak1;

import java.util.List;

public abstract class Automobil {

    private List<Tocak> listaTockova;
    private int godiste;
    private double cena;

    public Automobil(List<Tocak> listaTockova, int godiste, double cena) {
        this.listaTockova = listaTockova;
        this.godiste = godiste;
        this.cena = cena;
    }

    public List<Tocak> getListaTockova() {
        return listaTockova;
    }

    public void setListaTockova(List<Tocak> listaTockova) {
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
    public abstract void zameniTocak();


    public double cenaTockova(){
       double ukupnaCena = 0.0;
       for (Tocak tocak : getListaTockova()) {
           if (this instanceof BMW) {
               ukupnaCena += tocak.getCenaTocka() * 100;
           } else if (this instanceof Mercedes) {
               ukupnaCena += tocak.getCenaTocka() * 120;
           } else if (this instanceof Audi) {
               ukupnaCena += tocak.getCenaTocka() * 110;
           }
       }
       return ukupnaCena;
   }









}
