package Zadatak15;

public class PostavkaZadatka {

    /*
    * 15.
Napisati klasu Osoba standardno


Napisati klasu Profesor koja prosiruje klasu Osoba i ima atribute:
- ArrayList<String> predmetiKojePredaje;

Napisati 2 konstruktora:
- Jedan koji prima sve argumente
- Podrazuemvani koji postavlja listu predmeta na novu praznu listu

Napisati sve gettere i settere

Napisati metode:
1. add(String predmet) - koja dodaje predmet na listu predmete
2. add(String predmet, int i) - koja postavlja predmet na index i u listi predmeta
3. addAll(ArrayList<String> predmeti) - koja postavlja sve predmete iz prosledjene liste na listu predmeta koje profesor predaje
4. remove(int i) - koja brise predmet sa indeksa i iz liste predmeta
5. remove(String predmet) - koja brise predmet sa istim imenom iz liste predmeta kao prosledjeni predmet

Omoguciti da mozemo porediti dva objekta ove klase.

Overridovati toString() metod:
"<ime> <prezime> <brojGodina> je profesor i predaje:
 [<predmet1>, ..., <predmetN>]"
---------------------------------------------------------------------------------------------------------------------------------------



Napisati klasu Ucenik koja nasledjuje klasu Osoba i ima atribute:
- ArrayList<Double> ocene;

Uvek paziti da ocena mora biti u intervalu [1.0, 5.0]

Napisati 2 konstruktora:
- Jedan koji prima sve argumente
- Podrazumevani koja postavlja listu na novu praznu listu

Napisati sve gettere i settere

Napisati metode:
1. dodajOcenu(double x) - koja dodaje ocenu x u listu ocena.
2. promeniOcenu(double x, int i) - koja menja ocenu na indexu i u ocenu x.
3. izbrisiOcenu(int i) - koja brise ocenu na indeksu i
4. izbrisiOcenu(double x) - koja brise ocenu x
5. prosek() - koja vraca ucenikov prosek. Ukoliko ucenik ima barem jednu jedinicu (bilo koji broj x, 1.0 <= x < 2.0)
6. kakavJeDjak() - koja vraca string na sledeci nacin:
 "Nedovoljan" - ako ima barem jednu jedinicu
 "Dovoljan" - ako je prosek u intervalu [2.0, 2.5)
 "Dobar" - ako je prosek u intervalu [2.5. 3.5)
 "Vrlo dobar" - ako je prosek u intervalu [3.5, 4.5)
 "Odlican" - inace

Overridovati toString() metod:
"<ime> <prezime> <brGodina> ima ocene:
 [<ocena1>, <ocena2>, ..., <ocenaN>]
 Prosek: <prosek>"
---------------------------------------------------------------------------------------------------------------------------------------


Napisati klasu Osnovac koja prosiruje klasu Ucenik i ima atribute:
- ArrayList<String> bojice

Napraviti 2 konstruktora:
- Jedan koji prima sve atribute
- Podrazumevani koji postavlja bojice na novu praznu ArrayListu

Paziti da prilikom kreiranja Osnovca broj godina mora biti u intervalu [7, 14]
Ukoliko se nevalidan broj godina proseldi, postaviti ih na 7

Napisati sve gettere i settere

Napisati metode:
1. dodajBojicu(String b) - koja dodaje bojicu na listu bojica
2. dodajBojicu(String b, int i) - koja postavlja bojicu u listu bojica na indeks i
3. ukloniBojicu(String b) - koja ukljanja bojicu b sa liste bojica
4. ukloniBojicu(int i) - koja ukljanja bojicu sa indexa i.

Overridovati metod prosek() tako da na svaku ocenu dodati 0.3 prilikom racunanja proseka, pazeci da se ne predje gornja granica od 5.0 po oceni

Overridovati toString() metod:
"<ime> <prezime> <brojGodima> pohadja osnovnu skolu.
 Ocene: [<ocena1>, <ocena2>, ..., <ocenaN>]
 Prosek: <prosek>"
---------------------------------------------------------------------------------------------------------------------------------------


Napisati Klasu Gimnazijalac koja nasledjuje klasu Ucenik i ima atribute:
- String maturski

Napraviti 2 konstruktora:
- Jedan koji prima sve argumente
- Podrazumevani koji postavlja maturski na ""

Paziti da prilikom kreiranja Gimnazijalca broj godina mora biti u intervalu [15, 19].
Ukoliko se prosledi nevalidan broj godina, postaviti ih na 15

Napisati sve gettere i settere

Overridovati metod prosek() tako da na svaku ocenu oduzima 0.1 prilikom racunajna proseka, pazeci da se ne predje donja granica od 1.0 po oceni.

Overridovati toString() metod:
"<ime> <prezime> <brojGodima> pohadja gimnaziju.
 Ocene: [<ocena1>, <ocena2>, ..., <ocenaN>]
 Prosek: <prosek>"
---------------------------------------------------------------------------------------------------------------------------------------



Napisati klasu Student koja nasledjuje klasu Ucenik i ima atribute:
- ArrayList<String> predmeti
- ArrayList<Profesor> profesori

Napraviti 2 konstrutkora:
- Jedan oji prima sve argumente
- Podrazumevani koji ne prima ni jedan argument i postavlja ove 2 liste na nove prazne ArrayListe.

Napisati sve gettere i settere

Napisati metode:
1. addPredmet(String s)
2. addPredmet(String s, int i)
3. addProfesor(Profesor p)
4. addProfesor(Profesor p, int i)
5. removePredmet(String s)
6. removeProfesor(Profesor p) - Paziti da ovakav profesor postoji u listi! Ako ne postoji, ne raditi nista

Overridovati toString() metod:
"<ime> <prezime> <brGodina> je student i pohadja predmete:
 <predmet1.toString()>
 ...
 <predmetN.toString()>
 Ovom studentu predaju profesori:
 <profesor1.toString()>
 ...
 <profesorK.toString()>"
---------------------------------------------------------------------------------------------------------------------------------------*/

}
