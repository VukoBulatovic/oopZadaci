package Zadatak16;

public class Motocikl extends Vozilo {

    private int brojPutnika;

    public Motocikl(int brojPutnika) {
        this.brojPutnika = brojPutnika;
    }

    public Motocikl() {
    }

    @Override
    public char vratiKategoriju() {
        return 'A';
    }

    @Override
    public int brojTockova() {
        return 2;
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

    public void dodajPutnika(){
        brojPutnika ++;
        if(brojPutnika > 2)
            brojPutnika = 2;
    }

    public void oduzmiPutnika(){
        brojPutnika --;
        if (brojPutnika < 0)
            brojPutnika = 0;
    }

    public void dodajPutnika(int n){
        brojPutnika = brojPutnika + n;
        if (brojPutnika > 2)
            brojPutnika = 2;
    }

    public void oduzmiPutnika(int n){
        brojPutnika = brojPutnika - n;
        if (brojPutnika < 0)
            brojPutnika = 0;
    }

    public void isprazniMotor(){
        brojPutnika = 0;
    }

    public void napuniMotor(){
        brojPutnika = 2;
    }











}
