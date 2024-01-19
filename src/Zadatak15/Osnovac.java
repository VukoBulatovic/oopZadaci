package Zadatak15;

import java.util.ArrayList;

public class Osnovac extends Ucenik {

    private ArrayList<String> bojice;

    public Osnovac(String ime, String prezime, int brGod, ArrayList<Double> ocene, ArrayList<String> bojice) {
        super.setIme(ime);
        super.setPrezime(prezime);
        super.setBrGodina(brGod);
        if(brGod < 7 || brGod > 14){
            super.setBrGodina(7);
        }
        super.setOcene(ocene);
        this.bojice = bojice;
    }

    public Osnovac() {
        this.bojice = new ArrayList<>();
    }

    public ArrayList<String> getBojice() {
        return bojice;
    }

    public void setBojice(ArrayList<String> bojice) {
        this.bojice = bojice;
    }

    //1. dodajBojicu(String b) - koja dodaje bojicu na listu bojica
    public void dodajBojicu(String b){
        bojice.add(b);
    }
    //2. dodajBojicu(String b, int i) - koja postavlja bojicu u listu bojica na indeks i
    public void dodajBojicu(String b, int i){
        bojice.add(i,b);
    }
    //3. ukloniBojicu(String b) - koja ukljanja bojicu b sa liste bojica
    public void ukloniBojicu(String b){
        bojice.remove(b);
    }
    //4. ukloniBojicu(int i) - koja ukljanja bojicu sa indexa i.
    public void ukloniBojicu(int i){
        bojice.remove(i);
    }
    //Overridovati metod prosek() tako da na svaku ocenu dodati 0.3
    // prilikom racunanja proseka, pazeci da se ne predje gornja granica od 5.0 po oceni
    @Override
    public double prosek() {
        double noviProsek = super.prosek() + 0.3;
        if(noviProsek >= 5.0){
            noviProsek = 5.0;
        }
        return noviProsek;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getIme()).append(" ").append(super.getPrezime()).
        append(" ").append(getBrGodina()).append(" pohadja osnovnu skolu.").append("\n");
        sb.append("Ocene: ").append(ocene).append("\n");
        sb.append("Prosek: ").append(prosek());
        return sb.toString();
    }
}
