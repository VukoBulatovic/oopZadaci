package Zadatak16;

import java.util.ArrayList;

public class Kamion extends Vozilo {

    private int brojPutnika;
    private ArrayList<String> proizvodi;

    public Kamion(int brPutnika, ArrayList<String> proizvodi){
        this.brojPutnika = brPutnika;
        this.proizvodi = proizvodi;
    }

    public Kamion() {
        this.proizvodi = new ArrayList<>();
    }

    @Override
    public char vratiKategoriju() {
        return 'C';
    }

    @Override
    public int brojTockova() {
        return 10;
    }

    @Override
    public int brojPutnika() {
        return brojPutnika;
    }

    public int getBrojPutnika() {
        return brojPutnika;
    }

    public void setBrojPutnika(int brojPutnika) {
        this.brojPutnika = brojPutnika;
    }

    public ArrayList<String> getProizvodi() {
        return proizvodi;
    }

    public void setProizvodi(ArrayList<String> proizvodi) {
        this.proizvodi = proizvodi;
    }
//
    public void dodajPutnika(){
        brojPutnika ++;
        if(brojPutnika > 1)
            brojPutnika = 1;
    }

    public void oduzmiPutnika(){
        brojPutnika --;
        if (brojPutnika < 0)
            brojPutnika = 0;
    }

    public void dodajPutnika(int n){
        brojPutnika = brojPutnika + n;
        if (brojPutnika > 1)
            brojPutnika = 1;
    }

    public void oduzmiPutnika(int n){
        brojPutnika = brojPutnika - n;
        if (brojPutnika < 0)
            brojPutnika = 0;
    }

    public void isprazniKamion(){
        brojPutnika = 0;
    }

    public void napuniKamion(){
        brojPutnika = 2;
    }

    public void dodajProizvod(String s){
        proizvodi.add(s);
    }

    public void oduzmiProizvod(String s){
        proizvodi.remove(s);
    }

}
