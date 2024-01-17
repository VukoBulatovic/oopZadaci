package Zadatak13;

public class PostavkaZadatka {
    /*
    13.
Napisati klasu Namirnica koja ima atribute
- String ime
- double cena

Napisati 2 konstruktora:
- Jedan koji prima sve argumente. Ukoliko primi null za ime, postaviti ga na prazan string.
 Ukoliko primi negativnu vrednost za cenu postaviti je na 0.
- Podrazumevani konstruktor koji ne prima ni jedan argument i postavlja atribute na "" i 0

Napisati sve gettere i settere

Omoguciti poredjenje objekata ove klase preko equals() i hashCode() metoda
Dve namirnice su iste ako imaju isto ime i istu cenu.

Overridovati toString() metod na sledeci nacin:
"<ime> | <cena>"
---------------------------------------------------------------------------------------------------------------------------------------


Napisati klasu Prodavnica koja ima atribute
- String ime
- ArrayList<Namirnica> namirnice

Napisati konstruktore:
1. Jedan koji prima sve argumente i Arraylistu namirnica duboko kopira
2. Jedan koji prima ime i postavlja Arraylistu na novu praznu ArrayListu.
3. Jedan koji prima ime i niz Namirnica preko ...

Napisti sve settere i gettere

Napisati metode:
1. dodajNamirnicu - koja dodaje namirnicu u listu namirnica
2. ukoloniNamirnicu - koja uklanja namirnicu iz liste namirnica

Overridovati toString() metod na sledeci nacin:
"Prodavnica <ime> ima sledece namirnice:
 <imeNamirnice1> | <cenaNamirnice1>
 ...
 <imeNamirniceN> | <cenaNamriniceN>"
---------------------------------------------------------------------------------------------------------------------------------------


Napisati klasu Osoba kao i do sada. (Mozete iskoristit vec napisanu)
---------------------------------------------------------------------------------------------------------------------------------------

Napisati klasu Korpa koja ima atribute:
- ArrayList<Namirnice>
- double cenaKorpe

Napisati podrazumevani konstruktor koji
postavlja ArrayListu na novu ArrayListu i cenaKorpe na 0.

Napisati sve gettere i settere

Napisati metode:
1. dodajUkorpu(Namirnica n) - koja dodaje u korpu neku namirnicu n
 i dodaje na cenuKorpe odgovarajucu cenu namirnice
2. dodajUkorpu(Namirnica n, int k) - koja dodaje u korpu neku namirnicu n k puta i dodaje na cenuKorpe odgovarajucu cenu svih tih namirnica.
3. ukloniIzKorpe(Namirnica n) - koja prima referencu na neku Namirnicu uklanja iz korpe jednu
                                kopiju takve namirnice. Oduzeti od ceneKorpe cenu tog artikla. Ukoliko nema tog
                                artikla u korpi, uraditi nista.
4. ukloniIzKorpe(Namirnica n, int k) - koja radi kao metoda 3, s time sto brise k kopija takve namirnice. Ukoliko u korpi ima manje od k broja
                                       takve namirnice, obrisati sve takve namirnice.
5. ukloniIzKorpeSveNamirniceN(Namirnica n) - radi kao 3. metoda, s time sto uklanja sve kopije takve namirnice.
6. isprazniKorpu - koja prazni korpu i postavlja cenuKorpe na odgovarajucu vrednos.
7. cenaKrope - koja vraca ukupnu cenu korpe

Overridovati toString() metod kao:
"<imeNamirnice1> | <brojKopijaNamirnice1> | <cenaSvihNamirnica1>
 ...
 <imeNamirniceN> | <brojKopijaNamirniceN> | <cenaSvihNamirnicaN>
 Cena korpe je: <cenaKopre>"
---------------------------------------------------------------------------------------------------------------------------------------


Napisati klasu Kupac koji prosiruje klasu Osoba i ima atribute:
- Korpa korpa
- ArrayList<Namirnice> kupljeneNamirnice
- double novac

Napisati konstruktor koji prima double n i postavlja novac na n, i kreira novu praznu korpu, i novu praznu ArrayListu kupljenih namirnica.
Ukoliko je n nepozitivan broj, postaviti ga na 100.

Napisati sve gettere i settere

Napisati metode:
1. dodajUkorpu(Namirnica n) - koja dodaje u korpu neku namirnicu n i dodaje na cenuKorpe odgovarajucu cenu namirnice
2. dodajUkorpu(Namirnica n, int k) - koja dodaje u korpu neku namirnicu n k puta i dodaje na cenuKorpe odgovarajucu cenu svih tih namirnica.
3. ukloniIzKorpe(Namirnica n) - koja prima referencu na neku Namirnicu uklanja iz korpe jednu
                                kopiju takve namirnice. Oduzeti od ceneKorpe cenu tog artikla. Ukoliko nema tog
                                artikla u korpi, uraditi nista.
4. ukloniIzKorpe(Namirnica n, int k) - koja radi kao metoda 3, s time sto brise k kopija takve namirnice. Ukoliko u korpi ima manje od k broja
                                       takve namirnice, obrisati sve takve namirnice.
5. ukloniIzKorpeSveNamirniceN(Namirnica n) - radi kao 3. metoda, s time sto uklanja sve kopije takve namirnice.
6. isprazniKorpu - koja prazni korpu i postavlja cenuKorpe na odgovarajucu vrednos.
7. cenaKrope - koja vraca ukupnu cenu korpe
8. kupi - koja kupuje sve namirnice iz korpe. Tj. prvo proverava da li kupac ima dovoljno novca. Ukoliko nema ispisati poruku
          "Nemate dovoljno novca". Ukoliko ima dovoljno novca, isprazniti mu citavu korpu i dodati te namirnice u ArrayListu kupljenih namirnica i oduzeti od novca cenu korpe.

Overridovati toString() metod na sledeci nacin:
"Kupac <ime> <prezime> <brGodina> ima u korpi:
 <imeNamirnice1> | <brojKopijaNamirnice1> | <cenaSvihNamirnica1>
 ...
 <imeNamirniceN> | <brojKopijaNamirniceN> | <cenaSvihNamirnicaN>
 Cena korpe je: <cenaKopre>
 --------------------------
 Od kupljenih namirnica ima:
 <imeNamirnice1> | <brojKopijaNamirnice1>
 ...
 <imeNamirniceN> | <brojKopijaNamirniceN>
 Ukupna cena kupljenih namimirnica je je: <cenaKupljenih namirnica>
---------------------------------------------------------------------------------------------------------------------------------------
    * */


}
