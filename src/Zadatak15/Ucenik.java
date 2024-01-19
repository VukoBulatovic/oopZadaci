package Zadatak15;

import java.util.ArrayList;

public class Ucenik extends Osoba {
    ArrayList<Double> ocene;

    public Ucenik(String ime, String prezime, int brGod, ArrayList<Double> ocene) {
        super(ime, prezime, brGod);
        this.ocene = ocene;
        for (Double a : this.ocene) {
            if (a < 1.0 || a > 5.0) {
                System.out.println("Ocena mora biti izmedju 1 i 5");
                this.ocene = new ArrayList<>();
                break;
            }
        }
    }


    public Ucenik() {
        this.ocene = new ArrayList<>();
    }

    public ArrayList<Double> getOcene() {
        return ocene;
    }
    public void setOcene(ArrayList<Double> ocene) {
        this.ocene = ocene;
    }

    //1. dodajOcenu(double x) - koja dodaje ocenu x u listu ocena.
    public void dodajOcenu(double x){
        if(x >= 1.0 && x <= 5.0)
            ocene.add(x);
        else
            System.out.println("Ocena nije dodata, ocena mora imati vrednost izmedju 1 i 5");
    }
    //2. promeniOcenu(double x, int i) - koja menja ocenu na indexu i u ocenu x.
    public void promeniOcenu(double x, int i){
        if(x >= 1.0 && x <= 5.0)
            ocene.set(i,x);
        else
            System.out.println("Ocena nije promenjena jer unesena vrednost nije izmedju 1 i 5");
    }
    //3. izbrisiOcenu(int i) - koja brise ocenu na indeksu i
    public void izbrisiOcenu(int i){
        ocene.remove(i);
    }
    //4. izbrisiOcenu(double x) - koja brise ocenu x
    public void izbrisiOcenu(double x){
        ocene.remove(x);
    }
    //5. prosek() - koja vraca ucenikov prosek.
    // Ukoliko ucenik ima barem jednu jedinicu (bilo koji broj x, 1.0 <= x < 2.0)
    public double prosek(){
        double pr = 0.0;
        double ele = 0;
        for (Double a : ocene) {
            if (ocene.contains(1.0)) {
                return 1;
            } else {
                pr = pr + a;
                ele ++;
            }
        }
        return pr / ele;
    }

    //6. kakavJeDjak() - koja vraca string na sledeci nacin:
    // "Nedovoljan" - ako ima barem jednu jedinicu
    // "Dovoljan" - ako je prosek u intervalu [2.0, 2.5)
    // "Dobar" - ako je prosek u intervalu [2.5. 3.5)
    // "Vrlo dobar" - ako je prosek u intervalu [3.5, 4.5)
    // "Odlican" - inace
    public String kakavJeDjak(){
        if (prosek() == 1) {
            return "Nedovoljan";
        } else if (prosek() >= 2.0 && prosek() < 2.5) {
            return "Dovoljan";
        } else if (prosek() >= 2.5 && prosek() < 3.5) {
            return "Dobar";
        } else if (prosek() >= 3.5 && prosek() < 4.5) {
            return "Vrlo dobar";
        } else {
            return "Odlican";
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(" ima ocene: ").append("\n");
        sb.append(ocene.toString()).append("\n");
        sb.append("Prosek: ").append(prosek());

        return sb.toString();
    }
}
