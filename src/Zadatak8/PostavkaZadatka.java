package Zadatak8;

public class PostavkaZadatka {
    /*
    * 8. Napisati naredne klase:
Napisati klasu grad koja ima sledece polja/atribute
	- ime(String)
	- brojStanovnika(int)
	- drzava(String)
Napisati sledece metode
	konstruktor - samo jedan, ( sva polja su obavezna)
	getter i setter
	toString
		Ime grada: <ime>
		Broj stanovnika: <brojStanovnika>
		Drzava: <drzava>
---------------------------------------------------------------------------------------
Napisati klasu Putovanje koja ima sledeca polja/atribute:
	- destinacija(Grad)
	- vodjaPuta (Osoba)
	- vozilo (Automobil) - ovo polje se odnosi na automobil kojim se ide na putovanje
	- udaljenostUKm (double)
	- prijavljeneOsobe (arrayList)
udaljenostUKm ne sme biti negativna.
Ispisati poruku o gresci ako korisnik pokusa da napravi Putovanje sa negativnom udaljenoscu.
Takodje ispisati poruku o gresci ako korisnik pokusa da set-uje udaljenostUKm na negativno.
Napisati sledece metode:
	2 konstruktora -> vodja puta ne mora da postoji, u oba konstruktora ne treba slati niz prijavljeneOsobe, vec u oba konstruktora ovaj niz napravite kao prazan
	gettere settere
	toString metodu koristeci StringBuilder
	format
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
	primer
	Destincija: Pariz, Francuska
	Vodja puta je: Petar Petrovic
	Putuje se automobilom: BMW, 2016, 192000
	Udaljenost do destinacije je: 1300
	Prijavljene osobe:
		Zoran Milicevic
		Pera Peric
		Marko Markovic
	napisati i metodu koja racuna koliko je vremena potrebno da se stigne na destinaciju pri odredjenoj prosecnoj brzini.
	Dakle metoda treba da primi argument koji kaze koliko kilometra na sat (double) ce biti prosecna brzina automobila,
	a da vrati koliko ce sati biti potrebno da se dodje do destinacije ako se auto bude vozio tom prosecnom brzinom.

	napisati metodu prijava, koja prima kao argument osobu koja se prijavljuje na putovanje
	napisati metodu odjava, koja prima kao argument osobu koja se odjavljjuje sa putovanja (opciono)
	Napisati i test program koji pravi nekoliko gradova i nekoliko automobila i nekoliko osoba, i onda napravite neka putovanja u neke od tih gradova,
	sa nekim od tih automobila i vodja puta,
	i onda prijavite neke od osoba na neka od putovanja, i onda pozovite i metodu za racunanje koliko je vremena potrebno da se stigne pri odredjenoj brzini.*/


}
