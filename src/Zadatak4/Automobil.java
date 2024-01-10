package Zadatak4;
/*4. Napisati klasu Automobil koja ima atribute:
    - String marka
    - String zemljaPoreka
    - int godinaProizvodnje
    - double kilometraza
    Napraviti dva konstruktora koja primaju sve argumente, s tim da prvi prima godinu proizvodnja kao int, a drugi kao String (pa ga parsirati kasnije).
    Napisati gettere i settere za sva polja (atribute) i automatski generisati toString() metodu.*/
public class Automobil {

   //atributi
   private String marka;
   private String zemljaPorekla;
   private int godinaProizvodnje;
   private double kilometraza;

   //konstruktori
   public Automobil (String marka, String zemljaPorekla, int godinaProizvodnje, double kilometraza){
       this.marka = marka;
       this.zemljaPorekla = zemljaPorekla;
       this.godinaProizvodnje = godinaProizvodnje;
       this.kilometraza = kilometraza;
   }

    public Automobil (String marka, String zemljaPorekla, String godinaProizvodnje, double kilometraza){
        this.marka = marka;
        this.zemljaPorekla = zemljaPorekla;
        this.godinaProizvodnje = Integer.parseInt(godinaProizvodnje);
        this.kilometraza = kilometraza;
    }

    //getteri i setteri
    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getZemljaPorekla() {
        return zemljaPorekla;
    }

    public void setZemljaPorekla(String zemljaPorekla) {
        this.zemljaPorekla = zemljaPorekla;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public double getKilometraza() {
        return kilometraza;
    }

    public void setKilometraza(double kilometraza) {
        this.kilometraza = kilometraza;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Marka automobila je: ").append(marka).append("\n");
        sb.append("Zemlja porijekla je: ").append(zemljaPorekla).append("\n");
        sb.append("Godina prozvodnje je: ").append(godinaProizvodnje).append("\n");
        sb.append("Kilometraza je: ").append(kilometraza);
        return sb.toString();
    }
}
