package Zadatak13;

import java.util.ArrayList;

public class Prodavnica {

    private String ime;
    private ArrayList<Namirnica> namirnice;

    //1. Jedan koji prima sve argumente i Arraylistu namirnica duboko kopira
    public Prodavnica(String ime, ArrayList<Namirnica> namirnice) {
        this.ime = ime;
        //this.namirnice = namirnice;
        this.namirnice = new ArrayList<>();
        for (Namirnica n : namirnice) {
            this.namirnice.add(new Namirnica(n.getIme(), n.getCena()));
        }
    }

    //2. Jedan koji prima ime i postavlja Arraylistu na novu praznu ArrayListu.
    public Prodavnica(String ime) {
        this.ime = ime;
        this.namirnice = new ArrayList<>();
    }

    //3. Jedan koji prima ime i niz Namirnica preko ...
    public Prodavnica(String ime, Namirnica ... namirnice){
        this.ime = ime;
        this.namirnice = new ArrayList<>();
        for (Namirnica n : namirnice){
            this.namirnice.add(new Namirnica(n.getIme(),n.getCena()));
        }
    }

    //getteri i setteri
    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public ArrayList<Namirnica> getNamirnice() {
        return namirnice;
    }

    public void setNamirnice(ArrayList<Namirnica> namirnice) {
        this.namirnice = namirnice;
    }

    public void dodajNamirnicu(Namirnica nam){
        this.namirnice.add(nam);
    }

    public void ukloniNamirnicu(Namirnica nam){
        this.namirnice.remove(nam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Prodavnica ").append(ime).append(" ime sledece namirnice: ").append("\n");
        for (Namirnica n : namirnice)
            sb.append(n.toString()).append("\n");
        return sb.toString();
    }
}
