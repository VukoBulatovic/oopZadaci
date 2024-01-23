package Zadatak16;

public class Automobil extends Vozilo {

    private int brojPutnika;

    public Automobil(int brojPutnika) {
        this.brojPutnika = brojPutnika;
    }

    public Automobil() {
    }

    @Override
    public char vratiKategoriju() {
        return 'B';
    }

    @Override
    public int brojTockova() {
        return 4;
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

    //1. dodajPutnika() - koja dodaje jednog putnika u Auto, pazeci da auto moze najvise imati 5 putnika.

    public void dodajPutnika(){
        brojPutnika ++;
        if(brojPutnika > 5){
            brojPutnika = 5;
        }
    }
    //2. oduzmiPutnika() - koja oduzima jednog putnika iz Auta, pazeci da auto mzoe imati najmanje 0 putnika.
    public void oduzmiPutnika(){
        brojPutnika --;
        if(brojPutnika <= 0){
            brojPutnika = 0;
        }
    }

    //3. dodajPutnika(int n) - koja dodaje n putnika u Auto.
    // Ukoliko ne mogu da stanu svih n putnika, onda ih dodati do gornje granice
    public void dodajPutnika(int n){
        brojPutnika = brojPutnika + n;
        if(brojPutnika > 5){
            brojPutnika = 5;
        }
    }
    //4. oduzmiPutnika(int n) - koja oduzima n putnika iz Auta.
    // Ukoliko nema n putnika u autu, izbaciti sve putnike iz auta.
    public void oduzmiPutnika(int n){
        brojPutnika = brojPutnika - n;
        if (brojPutnika < 0){
            brojPutnika = 0;
        }
    }
    //5. isprazniAuto() - izbacuje sve putnike iz auta
    public void isprazniAuto(){
        brojPutnika = 0;
    }
    //6. napuniAuto() - puni auto sa 5 putnika
    public void napuniAuto(){
        brojPutnika = 5;
    }


}
