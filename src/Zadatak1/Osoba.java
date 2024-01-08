package Zadatak1;
/*1. Napisati klasu Osoba, koja ima sledece atribute:
            - ime
            - prezime
            - godinaRodjenja
            - visina
            Obezbediti konstruktor koji prima sve argumente za atribute i za svaki atribut getter i setter.
            Napisati toString() metod koji ispisuje Osobu na sledeci nacin:
            Ime osobe je: {ime}
            Prezime osobe je: {prezime}
            Godina rodjenja osobe je: {godinaRodjenja}
            Visina osobe je: {visina}*/

public class Osoba {

    //atributi
        private String ime;
        private String prezime;
        private int godRodjenja;
        private double visina;

    //pun konstruktor
        public Osoba (String ime, String prezime, int godRodjenja, double visina){
        this.ime = ime;
        this.prezime = prezime;
        this.godRodjenja = godRodjenja;
        this.visina = visina;
        }

    //prazan konstruktor
        public Osoba (){
        }

   //getteri i setteri
        public String getIme(){
            return ime;
        }

        public void setIme(String ime){
            this.ime = ime;
        }

        public String getPrezime() {
            return prezime;
         }

        public void setPrezime(String prezime) {
            this.prezime = prezime;
        }

        public int getGodRodjenja() {
            return godRodjenja;
        }

        public void setGodRodjenja(int godRodjenja) {
            this.godRodjenja = godRodjenja;
        }

        public double getVisina() {
            return visina;
        }

        public void setVisina(double visina) {
            this.visina = visina;
        }

        //metode
    @Override
    public String toString(){
       StringBuilder sb = new StringBuilder();
        sb.append("Ime osobe je: ").append(ime).append("\n");
        sb.append("Prezime osobe je: ").append(prezime).append("\n");
        sb.append("Godina rodjenja osobe je: ").append(godRodjenja).append("\n");
        sb.append("Visina osobe je: ").append(visina);
        return sb.toString();
    }



}
