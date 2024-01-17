package Zadatak13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Kupac extends Osoba {

    private Korpa korpa;
    private ArrayList<Namirnica> kupljeneNamirnice;
    private double novac;

    //Napisati konstruktor koji prima double n i postavlja novac na n,
    // i kreira novu praznu korpu, i novu praznu ArrayListu kupljenih namirnica.
    //Ukoliko je n nepozitivan broj, postaviti ga na 100.


    public Kupac(String ime,String prezime, int brG, double n) {
        super(ime, prezime, brG);
        this.korpa = new Korpa();
        this.kupljeneNamirnice = new ArrayList<>();
        this.novac = n;
        if(n < 0)
            this.novac = 100;
    }

    public Korpa getKorpa() {
        return korpa;
    }

    public void setKorpa(Korpa korpa) {
        this.korpa = korpa;
    }

    public ArrayList<Namirnica> getKupljeneNamirnice() {
        return kupljeneNamirnice;
    }

    public void setKupljeneNamirnice(ArrayList<Namirnica> kupljeneNamirnice) {
        this.kupljeneNamirnice = kupljeneNamirnice;
    }

    public double getNovac() {
        return novac;
    }

    public void setNovac(double novac) {
        this.novac = novac;
    }

    //1. dodajUkorpu(Namirnica n) - koja dodaje u korpu neku namirnicu n
    // i dodaje na cenuKorpe odgovarajucu cenu namirnice
    public void dodajUKorpu(Namirnica n){
        korpa.dodajUKorpu(n);
    }

    //2. dodajUkorpu(Namirnica n, int k) - koja dodaje u korpu neku namirnicu n k puta
    // i dodaje na cenuKorpe odgovarajucu cenu svih tih namirnica.
    public void dodajUKorpu(Namirnica n, int k){
        korpa.dodajUKorpu(n,k);
    }

    //3. ukloniIzKorpe(Namirnica n) - koja prima referencu na neku Namirnicu uklanja iz korpe jednu
    //                                kopiju takve namirnice. Oduzeti od ceneKorpe cenu tog artikla. Ukoliko nema tog
    //                                artikla u korpi, uraditi nista.
    public void ukloniIzKorpe(Namirnica n){
        korpa.ukloniIzKorpe(n);
    }

    //4. ukloniIzKorpe(Namirnica n, int k) - koja radi kao metoda 3, s time sto brise k kopija takve namirnice. Ukoliko u korpi ima manje od k broja
    //                                       takve namirnice, obrisati sve takve namirnice.
    public void ukloniIzKorpe(Namirnica n, int k){
        korpa.ukloniIzKorpe(n,k);
    }

    //5. ukloniIzKorpeSveNamirniceN(Namirnica n) - radi kao 3. metoda, s time sto uklanja sve kopije takve namirnice.
    public void ukloniIzKorpeSveNamirniceN(Namirnica n){
        korpa.ukloniIzKorpeSveNamirniceN(n);
    }

    //6. isprazniKorpu - koja prazni korpu i postavlja cenuKorpe na odgovarajucu vrednos.
    public void isprazniKorpu(){
        korpa.isprazniKorpu();
    }

    //7. cenaKrope - koja vraca ukupnu cenu korpe
    public double cenaKorpe(){
        return korpa.cenaKorpe();
    }

    //8. kupi - koja kupuje sve namirnice iz korpe.
    // Tj. prvo proverava da li kupac ima dovoljno novca. Ukoliko nema ispisati poruku
    // "Nemate dovoljno novca". Ukoliko ima dovoljno novca, isprazniti mu citavu korpu i
    // dodati te namirnice u ArrayListu kupljenih namirnica i oduzeti od novca cenu korpe.
    public void kupi(){
        if(novac >= korpa.cenaKorpe()){
                kupljeneNamirnice.addAll(korpa.getNamirnice());
                novac -= cenaKorpe();
                //korpa.isprazniKorpu();
        } else {
            System.out.println("Nemate dovoljno novca!");
        }
    }

    public double cenaKupljenihProizvoda(){
        double cena = 0;
        for (Namirnica n : kupljeneNamirnice){
            cena += n.getCena();
        }
        return cena;
    }

    public double brojKopijaKupljenihPorizvoda() {
        double br = 0;
        Set<Namirnica> vecDodato = new HashSet<>();

        for (Namirnica n : kupljeneNamirnice) {
            if (!vecDodato.contains(n)) {
                br += korpa.brojKopijaNamirnice(n);
                vecDodato.add(n);
            }
        }
        return br;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Kupac ").append(super.toString()).append(" ima u korpi: ").append("\n");
        sb.append(korpa.toString()).append("\n");
        sb.append("----------------------------").append("\n");
        sb.append("Od kupljenih namirnica ima: ").append("\n");

        Set<Namirnica> vecDodato = new HashSet<>();

        for (Namirnica n : kupljeneNamirnice) {
            if (!vecDodato.contains(n)) {
                sb.append(n.getIme()).append(" | ").append(korpa.brojKopijaNamirnice(n)).append("\n");
                vecDodato.add(n);
            }
        }

        sb.append("Ukupna cena kupljenih proizvoda je: ").append(cenaKupljenihProizvoda());
        return sb.toString();
    }




}
