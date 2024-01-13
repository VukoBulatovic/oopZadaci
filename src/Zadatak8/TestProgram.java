package Zadatak8;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Grad bankok = new Grad("Bangkok",8249_000,"Thai");
        Osoba vuko = new Osoba("Vuko","Bulatovic");
        Osoba zoran = new Osoba("Zoran","Milicevic");
        Osoba marija = new Osoba("Marija","Radovic");
        Osoba marko = new Osoba("Marko","Pantovic");
        Automobil audi = new Automobil("Audi", 2013,189000);


        Putovanje ljetovanje = new Putovanje(bankok,vuko,audi,500);
        ljetovanje.dodajPrijavljenuOsobu(vuko);
        ljetovanje.dodajPrijavljenuOsobu(zoran);
        ljetovanje.dodajPrijavljenuOsobu(marija);
        ljetovanje.dodajPrijavljenuOsobu(marko);

        System.out.println(ljetovanje);
        System.out.println("Koliko sati traje putovanje: " + ljetovanje.kolikoSatiCeTrajatiPutovanje(65));

        System.out.println("====================");

        ljetovanje.odjavaOsobeSaPutovanja(zoran);
        System.out.println(ljetovanje);
        System.out.println("====================");
        ljetovanje.prijavaOsobeNaPutovanje(zoran);
        System.out.println(ljetovanje);

    }



}
