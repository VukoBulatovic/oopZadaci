package Zadatak2;
/*2. Napisati klasu Pravougaonik koja ima atribute:
        - double sirina
        - double visina
        Obezbediti konstruktor koji prima argumente za oba atributa i gettere i settere za svaki.
        Napisati metode:
        - obim : vraca obim pravougaonika
        - povrsina : vraca povrsinu pravougaonika
        Napisati toString() metod koji ispisuje Pravougaonik na sledeci nacin:
        Pravougaonik sirine {sirina} i visine {visina} ima:
        Obim: {obim},
        Povrsinu: {povrsinu}
    * */

public class Pravougaonik {

    //atributi
    private double sirina;
    private double visina;

    //konstruktor
    public Pravougaonik (double sirina,double visina){
        this.sirina = sirina;
        this.visina = visina;
    }

    public Pravougaonik(){
    }

    //getteri i setteri
    public double getSirina() {
        return sirina;
    }

    public void setSirina(double sirina) {
        this.sirina = sirina;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }

    //metode

    public double obimPravougaonika(){
        return (2 * sirina) + (2 * visina);
    }

    public double povrsinaPravougaonika(){
        return sirina * visina;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pravougaonik sirine ").append(sirina).append(" i visine ").append(visina).append(" ima:").append("\n");
        sb.append("Obim: ").append(obimPravougaonika()).append(" ,\n");
        sb.append("Povrsinu: ").append(povrsinaPravougaonika());
        return sb.toString();
    }
}
