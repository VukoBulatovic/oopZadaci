package Zadatak3;

    /*3. Napisati klasu Krug koja ima atribute:
        - double poluprecnik
        Obezbediti konstruktor koji prima vrednost za poluprecnik.
        Obezbediti getter i setter za atribut poluprecnik.
        Napisati metode:
        - obim : vraca obim kruga
        - povrsina : vraca povrsinu kruga
        Koristiti Math Java biblioteku (Math.PI za konstantu pi)*/

public class Krug {
    //a
    private double poluprecnik;

    //k
    public Krug(double poluprecnik) {
        this.poluprecnik = poluprecnik;
    }
    public Krug() {
    }

    //g&s
    public double getPoluprecnik() {
        return poluprecnik;
    }
    public void setPoluprecnik(double poluprecnik) {
        this.poluprecnik = poluprecnik;
    }

    //m
    public double obimKruga(){
        return 2 * poluprecnik * Math.PI;
    }

    public double povrsinaKruga(){
        return Math.pow(poluprecnik,2) * Math.PI;
    }







}
