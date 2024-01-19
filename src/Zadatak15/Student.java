package Zadatak15;

import java.util.ArrayList;

public class Student extends Ucenik {

    ArrayList<String> predmeti;
    ArrayList<Profesor> profesori;

    public Student(String ime, String prezime, int brGod, ArrayList<Double> ocene, ArrayList<String> predmeti, ArrayList<Profesor> profesori) {
        super(ime, prezime, brGod, ocene);
        this.predmeti = predmeti;
        this.profesori = profesori;
    }

    public Student() {
        this.predmeti = new ArrayList<>();
        this.profesori = new ArrayList<>();
    }

    public ArrayList<String> getPredmeti() {
        return predmeti;
    }

    public void setPredmeti(ArrayList<String> predmeti) {
        this.predmeti = predmeti;
    }

    public ArrayList<Profesor> getProfesori() {
        return profesori;
    }

    public void setProfesori(ArrayList<Profesor> profesori) {
        this.profesori = profesori;
    }

    //1. addPredmet(String s)
    public void addPredmet(String s){
        predmeti.add(s);
    }
    //2. addPredmet(String s, int i)
    public void addPredmet(String s, int i){
        predmeti.add(i,s);
    }
    //3. addProfesor(Profesor p)
    public void addProfesor(Profesor p){
        profesori.add(p);
    }
    //4. addProfesor(Profesor p, int i)
    public void addProfesor(Profesor p, int i){
        profesori.add(i,p);
    }
    //5. removePredmet(String s)
    public void removePredmet(String s){
        predmeti.remove(s);
    }
    //6. removeProfesor(Profesor p) - Paziti da ovakav profesor postoji u listi!
    // Ako ne postoji, ne raditi nista
    public void removeProfesor(Profesor p){
        profesori.remove(p);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getIme()).append(" ").append(super.getPrezime()).
                append(" ").append(getBrGodina()).append(" je student i pohadja predmete: ").append("\n");
        for (int i = 0; i < predmeti.size() - 1; i++) {
            sb.append(predmeti.get(i)).append("\n");
        }
        sb.append(predmeti.get(predmeti.size() - 1)).append("\n");
        sb.append("Ovom studentu predaju profesori: ").append("\n");
        for (Profesor pp : profesori) {
            sb.append(pp.getIme()).append(" ").append(pp.getPrezime()).append(" ").append(pp.getPredmetiKojePredaje()).append("\n");
        }
        return sb.toString();
    }
}
