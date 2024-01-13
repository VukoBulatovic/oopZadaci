package Zadatak8;

import java.util.ArrayList;

public class Putovanje {

    private Grad destinacija;
    private Osoba vodjaPuta;
    private Automobil vozilo;
    private double udaljenostUKm; //-ispisati gresku za negativnu udaljenost
    private ArrayList<Osoba> prijavljeneOsobe;

    //Konstruktori

    //bez vodje puta
    public Putovanje(Grad destinacija, Automobil vozilo, double udaljenostUKm) {
        this.destinacija = destinacija;
        this.vozilo = vozilo;
        setUdaljenostUKm(udaljenostUKm);
        this.prijavljeneOsobe = new ArrayList<>();
    }

    //sa vodjom puta
    public Putovanje(Grad destinacija, Osoba vodjaPuta, Automobil vozilo, double udaljenostUKm) {
        this.destinacija = destinacija;
        this.vodjaPuta = vodjaPuta;
        this.vozilo = vozilo;
        setUdaljenostUKm(udaljenostUKm);
        this.prijavljeneOsobe = new ArrayList<>();
    }

    //udaljenost ne sme bbiti negativna,
    //Ispisati poruku o gresci ako korisnik pokusa da napravi Putovanje sa negativnom udaljenoscu.
    //Takodje ispisati poruku o gresci ako korisnik pokusa da set-uje udaljenostUKm na negativno.

    public void setUdaljenostUKm(double udaljenostUKm) {
        if(udaljenostUKm >= 0)
         this.udaljenostUKm = udaljenostUKm;
        else
            System.out.println("Greska: Udaljenost ne moze biti negativna!");
    }

    //Ostali getteri i setteri

    public Grad getDestinacija() {
        return destinacija;
    }

    public void setDestinacija(Grad destinacija) {
        this.destinacija = destinacija;
    }

    public Osoba getVodjaPuta() {
        return vodjaPuta;
    }

    public void setVodjaPuta(Osoba vodjaPuta) {
        this.vodjaPuta = vodjaPuta;
    }


    public Automobil getVozilo() {
        return vozilo;
    }

    public void setVozilo(Automobil vozilo) {
        this.vozilo = vozilo;
    }

    public double getUdaljenostUKm() {
        return udaljenostUKm;
    }

    public ArrayList<Osoba> getPrijavljeneOsobe() {
        return prijavljeneOsobe;
    }

    public void setPrijavljeneOsobe(ArrayList<Osoba> prijavljeneOsobe) {
        this.prijavljeneOsobe = prijavljeneOsobe;
    }

    //pomocna za ubacivanje osoba u listu
    public void dodajPrijavljenuOsobu(Osoba osoba){
        prijavljeneOsobe.add(osoba);
    }

    //Metode


    /*toString format:

	Destincija: <ImeGrada, ImeDrzave>
	Vodja puta je: <ime i prezime vodje puta ako postoji, 'putovanje nema vodju puta' ako vodja puta nije postavljen (null)>
	Putuje se automobilom: <marka, godinaProizvodnje, kilometraza>
	Udaljenost do destinacije u kilometrima je: <udaljenostUKm>
	Prijavljene osobe:
		<ime> <prezime>
		<ime> <prezime>
		<ime> <prezime>
		<ime> <prezime>
		....
    * */
    //pomocna metoda za ispis grada,drzave
    public String imeGradaImeDrzave(){
        return destinacija.getIme() + ", " + destinacija.getDrzava();
    }

    //pomocna za ispis vodje puta
    public String ispisVodjePuta(){
        if(vodjaPuta != null)
            return vodjaPuta.getIme() + " " + vodjaPuta.getPrezime();
        else return "putovanje nema vodju puta";
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Destinacija: ").append(imeGradaImeDrzave()).append("\n");
        sb.append("Vodja puta je: ").append(ispisVodjePuta()).append("\n");
        sb.append("Putuje se automobilom: ").append(vozilo.toString()).append("\n");
        sb.append("Udaljenost do destinacije u kilometrima je: ").append(getUdaljenostUKm()).append("\n");
        sb.append("Prijavljene osobe: ").append("\n");
        /*for (Osoba osoba : prijavljeneOsobe) {
            sb.append(osoba.toString()).append("\n");
        }*/
        for (int i = 0; i < prijavljeneOsobe.size() - 1; i++) {
            sb.append(prijavljeneOsobe.get(i).toString()).append("\n");
        }
        sb.append(prijavljeneOsobe.get(prijavljeneOsobe.size()-1).toString());
        return sb.toString();
    }


    //napisati i metodu koja racuna koliko je vremena potrebno da se stigne na destinaciju pri odredjenoj prosecnoj brzini.
    //	Dakle metoda treba da primi argument koji kaze koliko kilometra na sat (double) ce biti prosecna brzina automobila,
    //	a da vrati koliko ce sati biti potrebno da se dodje do destinacije ako se auto bude vozio tom prosecnom brzinom.

    public double kolikoSatiCeTrajatiPutovanje(double prosecnaBrzinaUKmH){
        return getUdaljenostUKm() / prosecnaBrzinaUKmH;
    }

    //napisati metodu prijava, koja prima kao argument osobu koja se prijavljuje na putovanje

    public void prijavaOsobeNaPutovanje(Osoba o){
        prijavljeneOsobe.add(o);
    }
    //napisati metodu odjava, koja prima kao argument osobu koja se odjavljjuje sa putovanja (opciono)
    public void odjavaOsobeSaPutovanja(Osoba o){
        prijavljeneOsobe.remove(o);
    }





















}



