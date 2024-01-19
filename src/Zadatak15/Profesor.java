package Zadatak15;

import java.util.ArrayList;
import java.util.Objects;

public class Profesor extends Osoba {

    private ArrayList<String> predmetiKojePredaje;

    public Profesor(String ime, String prezime, int brGod, ArrayList<String> predmetiKojePredaje) {
        super(ime, prezime, brGod);
        this.predmetiKojePredaje = predmetiKojePredaje;
    }

    public Profesor() {
        this.predmetiKojePredaje = new ArrayList<>();
    }

    public ArrayList<String> getPredmetiKojePredaje() {
        return predmetiKojePredaje;
    }

    public void setPredmetiKojePredaje(ArrayList<String> predmetiKojePredaje) {
        this.predmetiKojePredaje = predmetiKojePredaje;
    }

    //1. add(String predmet) - koja dodaje predmet na listu predmete
    public void add(String predmet){
        predmetiKojePredaje.add(predmet);
    }

    //2. add(String predmet, int i) - koja postavlja predmet na index i u listi predmeta
    public void add(String predmet, int i){
        predmetiKojePredaje.add(i,predmet);
    }

    //3. addAll(ArrayList<String> predmeti) - koja postavlja sve predmete iz prosledjene liste na listu
    // predmeta koje profesor predaje
    public void addAll(ArrayList<String> predmeti){
        predmetiKojePredaje.addAll(predmeti);
    }

    //4. remove(int i) - koja brise predmet sa indeksa i iz liste predmeta
    public void remove(int i){
        predmetiKojePredaje.remove(i);
    }

    //5. remove(String predmet) - koja brise predmet sa istim imenom iz liste
    // predmeta kao prosledjeni predmet
    public void remove(String predmet){
        predmetiKojePredaje.remove(predmet);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profesor profesor = (Profesor) o;
        return Objects.equals(predmetiKojePredaje, profesor.predmetiKojePredaje);
    }

    @Override
    public int hashCode() {
        return Objects.hash(predmetiKojePredaje);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(" je profesor i predaje: ").append("\n");
        sb.append(predmetiKojePredaje);
        return sb.toString();
    }
}
