package Zadatak13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Korpa {

    private ArrayList<Namirnica> namirnice;
    private double cenaKorpe;

    public Korpa() {
        this.namirnice = new ArrayList<>();
        this.cenaKorpe = 0;
    }

    public ArrayList<Namirnica> getNamirnice() {
        return namirnice;
    }

    public void setNamirnice(ArrayList<Namirnica> namirnice) {
        this.namirnice = namirnice;
    }

    public double getCenaKorpe() {
        return cenaKorpe;
    }

    public void setCenaKorpe(double cenaKorpe) {
        this.cenaKorpe = cenaKorpe;
    }

    //1. dodajUkorpu(Namirnica n) - koja dodaje u korpu neku namirnicu n
    // i dodaje na cenuKorpe odgovarajucu cenu namirnice
    public void dodajUKorpu(Namirnica n){
        namirnice.add(new Namirnica(n.getIme(), n.getCena()));
        cenaKorpe += n.getCena();
    }


    //2. dodajUkorpu(Namirnica n, int k) - koja dodaje u korpu neku namirnicu n
    // k puta i dodaje na cenuKorpe odgovarajucu cenu svih tih namirnica.
    public void dodajUKorpu(Namirnica n, int k){
        for (int i = 0; i < k; i++) {
            namirnice.add(new Namirnica(n.getIme(),n.getCena()));
            cenaKorpe += n.getCena();
        }
    }

    //3. ukloniIzKorpe(Namirnica n) - koja prima referencu na neku Namirnicu uklanja iz korpe jednu
    //                                kopiju takve namirnice. Oduzeti od ceneKorpe cenu tog artikla. Ukoliko nema tog
    //                                artikla u korpi, uraditi nista.
    public void ukloniIzKorpe(Namirnica n) {
            for (int i = 0; i < namirnice.size(); i++) {
                if (namirnice.get(i).equals(n)) {
                    namirnice.remove(i);
                    cenaKorpe -= n.getCena();
                    break;  // Prekidam uklanjanje zbog micanja jednog proizvoda
                }
            }
        }

    //4. ukloniIzKorpe(Namirnica n, int k) - koja radi kao metoda 3, s time sto brise k kopija takve namirnice. Ukoliko u korpi ima manje od k broja
    //                                       takve namirnice, obrisati sve takve namirnice.
    public void ukloniIzKorpe(Namirnica n, int k){
        for (int i = 0; i < namirnice.size(); i++) {
            if(namirnice.get(i).equals(n)){
                for (int j = 0; j < k; j++) {
                    namirnice.remove(i);
                    cenaKorpe -= n.getCena();
                }
                break;
            }
        }
    }

    //5. ukloniIzKorpeSveNamirniceN(Namirnica n) -
    // radi kao 3. metoda, s time sto uklanja sve kopije takve namirnice.
    public void ukloniIzKorpeSveNamirniceN(Namirnica n) {
        for (int i = namirnice.size() - 1; i >= 0; i--) {
            Namirnica a = namirnice.get(i);
            if (a.equals(n)) {
                cenaKorpe -= a.getCena();
                namirnice.remove(i);
            }
        }
    }

    //6. isprazniKorpu - koja prazni korpu i postavlja cenuKorpe na odgovarajucu vrednos.
    public void isprazniKorpu(){
        namirnice.clear();
        cenaKorpe = 0;
    }

    //7. cenaKrope - koja vraca ukupnu cenu korpe
    public double cenaKorpe(){
        return cenaKorpe;
    }

    //8. kupi - koja kupuje sve namirnice iz korpe.
    // Tj. prvo proverava da li kupac ima dovoljno novca. Ukoliko nema ispisati poruku
    //"Nemate dovoljno novca". Ukoliko ima dovoljno novca, isprazniti mu citavu korpu
    // i dodati te namirnice u ArrayListu kupljenih namirnica i oduzeti od novca cenu korpe.







    //pomocna metoda
    public int brojKopijaNamirnice(Namirnica namirnica) {
        int br = 0;
        for (Namirnica n : namirnice) {
            if (n.equals(namirnica)) {
                br++;
            }
        }
        return br;
    }

    //pomocna metoda
    public double cenaSvihKopijaNamirnice(Namirnica n) {
        double ukC = 0;
        for (Namirnica a : namirnice) {
            if (a.equals(n)) {
                ukC += a.getCena();
            }
        }
        return ukC;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Set<Namirnica> vecDodato = new HashSet<>(); //Morao sam preko SET-a, najlakse mi je bilo da izbjegnem ponavljanje ispisa istog proizvoda

        for (Namirnica n : namirnice) {
            if (!vecDodato.contains(n)) {
                sb.append(n.getIme()).append(" | ").append(brojKopijaNamirnice(n)).append(" | ").append(cenaSvihKopijaNamirnice(n)).append("\n");
                vecDodato.add(n);
            }
        }

        sb.append("Cijena korpe je: ").append(getCenaKorpe());
        return sb.toString();
    }
}
