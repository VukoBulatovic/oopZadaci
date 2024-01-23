package Zadatak16;

public class Autobus extends Vozilo {

    private int brojPutnika;

    public Autobus(int brojPutnika) {
        this.brojPutnika = brojPutnika;
    }

    public Autobus() {
    brojPutnika = 0;
    }

    @Override
    public char vratiKategoriju() {
        return 'D';
    }

    @Override
    public int brojTockova() {
        return 8;
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
        if(brojPutnika > 90)
            brojPutnika = 90;
    }

    public void oduzmiPutnika(){
        brojPutnika --;
        if (brojPutnika < 0)
            brojPutnika = 0;
    }

    public void dodajPutnika(int n){
        brojPutnika = brojPutnika + n;
        if (brojPutnika > 90)
            brojPutnika = 90;
    }

    public void oduzmiPutnika(int n){
        brojPutnika = brojPutnika - n;
        if (brojPutnika < 0)
            brojPutnika = 0;
    }

    public void isprazniAutobus(){
        brojPutnika = 0;
    }

    public void napuniNapuniAutobus(){
        brojPutnika = 2;
    }



}
