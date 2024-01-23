package Zadatak16;

public class PostavkaZadatka {
    /*
    * 16.
Napisati abstraktnu klasu Vozilo koje ima atribute:
- String registarskiBroj
- String marka
- String tip

Napisati konstruktor koji prima sve argumente

Napisati sve gettere i settere

Napisati abstraktne metode:
1. char vratiKategoriju() - koja vraca karakter kategorije:
 'A' -> ukoliko je u pitanju motocikl
 'B' -> ukoliko je u pitanju auto
 'C' -> ukoliko je u pitanju kamion
 'D' -> ukoliko je u pitanju autobus
2. int brojTockova() - koja vraca broj tockova vozila
3. int brojPutnika() - koja vraca broj trenutnih putnika vozila

Overridovati toString() metod:
"<regBroj> <marka> <tip> kategorije <kategorija> ima:
 Broj tockova: <brTockova>
 Broj putnika: <brPutnka>"

---------------------------------------------------------------------------------------------------------------------------------------
Napisati klasu Automobil koja nasledjuje klasu Vozilo i ima atribute:
- int brojPutnika

Auto ima 4 tocka

Napisati 2 konstruktora:
- Jedan koji prima broj putnika
- Podrazumevani koji ne prima argumente

Napisati sve gettere i settere

Napisati metode:
1. dodajPutnika() - koja dodaje jednog putnika u Auto, pazeci da auto moze najvise imati 5 putnika.
2. oduzmiPutnika() - koja oduzima jednog putnika iz Auta, pazeci da auto mzoe imati najmanje 0 putnika.
3. dodajPutnika(int n) - koja dodaje n putnika u Auto. Ukoliko ne mogu da stanu svih n putnika, onda ih dodati do gornje granice
4. oduzmiPutnika(int n) - koja oduzima n putnika iz Auta. Ukoliko nema n putnika u autu, izbaciti sve putnike iz auta.
5. isprazniAuto() - izbacuje sve putnike iz auta
6. napuniAuto() - puni auto sa 5 putnika


Overridovati sve metode iz natklase.
---------------------------------------------------------------------------------------------------------------------------------------

Napisati klasu Motocikl koja nasledjuje klasu Vozilo i ima atribute:
- int brojPutnika

Motocikl ima 2 tocka (Ko mi napise da moze da ima i 3 leti sa kursa!)

Napisati 2 konstruktora:
- Jedan koji prima broj putnika
- Podrazumevani koji ne prima argumente

Napisati sve gettere i settere

Napisati metode:
1. dodajPutnika() - koja dodaje jednog putnika na Motor, pazeci da motocikl moze najvise imati 2 putnika.
2. oduzmiPutnika() - koja oduzima jednog putnika sa Motora, pazeci da motor moze imati najmanje 0 putnika.
3. dodajPutnika(int n) - koja dodaje n putnika u Motor. Ukoliko ne mogu da stanu svih n putnika, onda ih dodati do gornje granice
4. oduzmiPutnika(int n) - koja oduzima n putnika iz Motora. Ukoliko nema n putnika u autu, izbaciti sve putnike sa motocikla.
5. isprazniMotor() - izbacuje sve putnike sa motora
6. napuniMotor() - puni motor sa 2 putnika


Overridovati sve metode iz natklase.
---------------------------------------------------------------------------------------------------------------------------------------


Napisati klasu Kamion koja nasledjuje klasu Vozilo i ima atribute:
- int brojPutnika
- ArrayList<String> proizvodi

Kamion ima 10 tockova

Napisati 2 konstruktora:
- Jedan koji prima broj putnika i listu proizvoda koje prenosi
- Podrazumevani koji ne prima argumente i postavlja listu proizvoda na novu praznu listu

Napisati sve gettere i settere



Napisati metode:
1. dodajPutnika() - koja dodaje jednog putnika u Kamion, pazeci da kamion moze najvise imati 1 putnika.
2. oduzmiPutnika() - koja oduzima jednog putnika iz Kamiona, pazeci da kamion moze imati najmanje 0 putnika.
3. dodajPutnika(int n) - koja dodaje n putnika u Kamiona. Ukoliko ne mogu da stanu svih n putnika,
*  onda ih dodati do gornje granice
4. oduzmiPutnika(int n) - koja oduzima n putnika iz Kamiona. Ukoliko nema n putnika u autu, izbaciti sve putnike iz kamiona.
5. isprazniKamion() - izbacuje sve putnike im kamiona
6. napuniKamion() - puni kamion sa 2 putnika
7. dodajProizvod(String s) - koji dodaje proizvod u kamion
8. oduzmiProizvod(String s) - koji oduzima proizvod iz kamiona


Overridovati sve metode iz natklase.
---------------------------------------------------------------------------------------------------------------------------------------


Napisati klasu Autobus koja nasledjuje klasu Vozilo i ima atribute:
- int brojPutnika

Autobus ima 8 tockova

Napisati 2 konstruktora:
- Jedan koji prima broj putnika
- Podrazumevani koji ne prima argumente i postavlja broj putnika na 0

Napisati sve gettere i settere



Napisati metode:
1. dodajPutnika() - koja dodaje jednog putnika u Autobus, pazeci da Autobus moze najvise imati 90 putnika.
2. oduzmiPutnika() - koja oduzima jednog putnika iz Autobusa, pazeci da Autobus moze imati najmanje 0 putnika.
3. dodajPutnika(int n) - koja dodaje n putnika u Autobus. Ukoliko ne mogu da stanu svih n putnika, onda ih dodati do gornje granice
4. oduzmiPutnika(int n) - koja oduzima n putnika iz Autobusa. Ukoliko nema n putnika u Autobus, izbaciti sve putnike iz Autobusa.
5. isprazniAutobus() - izbacuje sve putnike iz Autobusa
6. napuniAutobus() - puni Autobus sa 2


Overridovati sve metode iz natklase.
--------------------------------------------*/


}
