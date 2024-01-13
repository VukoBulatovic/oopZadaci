package Zadatak8;
    /*Napisati i test program koji pravi nekoliko gradova i nekoliko automobila i nekoliko osoba, i onda napravite neka putovanja u neke od tih gradova,
	sa nekim od tih automobila i vodja puta,
	i onda prijavite neke od osoba na neka od putovanja, i onda pozovite i metodu za racunanje koliko je vremena potrebno da se stigne pri odredjenoj brzini.*/

public class TestProgram {
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
