package Zadatak20;

public class PostavkaZadatka {
    /*
    20.
Napraviti projekat (ili samo stavite u zaseban paket) Geometrija (geometrija)
-Napraviti 4 podpaketa:
1.baza
2.interfejsi
3.figure
4.tela

---------------------------------------------------------------------------------------------------------------------------------------

Napisati interfejs Merljivo u paketu interfejsi koji definise metode:
1. double povrsina()

---------------------------------------------------------------------------------------------------------------------------------------

Napisati interfejs MerljivoU2D  koji prosiruje interfejs merljivo u paketu interfejsi koji definise metode:
1. double obim()

---------------------------------------------------------------------------------------------------------------------------------------
Napisati interfejs MerljivoU3D koji prosiruje interfejs merljivo u paketu interfejsi koji definise metode:
1. double zapremina()

---------------------------------------------------------------------------------------------------------------------------------------


Napisati abstraktnu klasu Oblik unutar baza paketa koja nema atribute

Napisati jedan prazan konstruktor

Napisati abstraktne metode:
1. String getIme()
2. String getOsobine()


Overridovati toString() metod na sledeci nacin:
"<ime>
 getOsobine()"
---------------------------------------------------------------------------------------------------------------------------------------

Napisati abstrakntu klasu Figura koja nasledjuje klasu Oblik unutar baza paketa i imeplementuje interfejs merljivoU2D i nema atribute

Figura je 2D geometrijsko telo

Napisati prazan konstruktor

Implementovati metod:
1. getOsobine():
"Obim: <obim>
 Povrsina: <povrsina>"

---------------------------------------------------------------------------------------------------------------------------------------

Napisati abstraktnu klasu Telo unutar baza paketa koja nasledjuje klasu Oblik i implementuje merljivoU3D interfejs i nema atribute

Napisati prazan konstruktor

Impleentovati metod:
1. getOsobine():
"Povrsina: <povrsina>
 Zapremina: <zapremina>

---------------------------------------------------------------------------------------------------------------------------------------

Napisati abstraktnu klasu Paralelogramu paketu figura koja prosiruje klasu Figure i ima atribute:
- double a, b;

Napraviti konstruktor koji prima sve argumente pazeci na logiku.

Napisati sve gettere i settere

Implementovati metode
1. getIme() - vraca "Paralelogram"
2. obim()

---------------------------------------------------------------------------------------------------------------------------------------

Napisati klasu Pravougaonik u paketu figura koja nasledjuje klasu Paralelogram i nema atribute

Napisati sve odgovarajuce konstruktore pazeci na logiku

Implementovati metode:
1. povrsina()

Overridovati metode:
1. getIme() - vraca "Pravougaonik"

---------------------------------------------------------------------------------------------------------------------------------------

Napisati klasu Kvadrat u paketu figurea koja nasledjuje kalsu Pravougaonik i nema atribute

Napisati sve odogvarajuce konstruktore pazeci na logiku

Overridovati metode:
1. getIme() - vraca "Kvadrat"

---------------------------------------------------------------------------------------------------------------------------------------

Napisati klasu Elipsa u paketu figura koja nasledjuje klasu Figura i ima atribute
- double a, b

Napisati sve odogvarajuce konstruktore pazeci na logiku

Napisati sve settere i gettere


Implementovati metode:
1. getIme() - vraca "Elipsa"
2. obim() - vraca 0 ; nije analiticki resivo :(
3. povrsina()

---------------------------------------------------------------------------------------------------------------------------------------

Napisati klasu Krug u paketu figura koja nasledjuje klasu Elipsa i nema atribute

Napisati sve odogovarajuce konstruktore pazeci na logiku

Overridovati metode:
1. getIme() - vraca "Krug"
2. obim()

---------------------------------------------------------------------------------------------------------------------------------------

Napisati klasu Trougao u paketu figura koja nasledjuje klasu Figura i ima atribute:
- double a, b, c

Napisati sve odogovarajuce konstruktore pazeci na logiku

Napisati sve gettere i settere

Implementovati metode:
1. getIme() - vraca:
- "Jednakostranicni trougao"; ako trougao ima sve tri stranice jednake
- "Jednakokraki trougao"; ako trougao ima dve od tri stranice jednake
- "Pravougli trougao"; ako je pravougli
- "Trougao"; inace
2. obim()
3. povrsina() - preko Heronovog obrasca

---------------------------------------------------------------------------------------------------------------------------------------

Napisati abstraktnu klasu Paralelopiped u paketu telo koja prosiruje klasu Telo i ima atribute:
- double a, b, c

Napisati konstruktor koji prima sve argumente pazeci na logiku

Napisati sve gettere i settere

Implementovati metode:
1. getIme() - vraca "paralelopiped"

---------------------------------------------------------------------------------------------------------------------------------------

Napisati klasu CetvorostranaPrizma u paketu telo koja nasledjuje klasu Paralelopiped i nema atribute

Napisati sve odogvarajuce konstruktore pazeci na logiku

Implementovati metode:
1. povrsina()
2. zapremina()

Overridovati metode:
1. getIme() - vraca "Cetvorostrana prizma"

---------------------------------------------------------------------------------------------------------------------------------------

Napisati klasu Kocka u paketu telo koja nasledjuje klasu CetvorostranaPrizma i nema atribute

Napisati sve odgovarajuce konstruktore pazeci na logiku

Overridovati metode:
1. getIme() - vraca "Kocka"

---------------------------------------------------------------------------------------------------------------------------------------

Napisati klasu Elipsoid u paketu telo koja nasledjuje klasu Telo i ima atribute:
- double a, b, c

Napisati konstruktor koji prima sve argumente pazeci na logiku.

Napisati sve gettere i settere

Implementovati metode:
1. povrsina() - vraca 0; Nije analiticki resivo :(
2. zapremina()
3. getIme() - vraca "Elipsoid"

---------------------------------------------------------------------------------------------------------------------------------------

Napisati klasu ObrtniElipsoid u paketu telo koja nasledjuje klasu Elipsoid i nema atribute

Obrtni elipsoid ima dve (od tri) jednake poluose (Zemlja je obrtni elipsoid)

Napisati sve odgovarajuce konstruktore pazeci na logiku

Overridovati metod:
1. getIme() - vraca "Obrtni elipsoid"

---------------------------------------------------------------------------------------------------------------------------------------

Napisati kalsu Sfera u paketu telo koja prosiruje klasu Elipsoid i nema atribute

Sfera je elipsoid cije su sve tri poluose jednake

napisati sve odgovarajuce konstruktore pazeci na logiku

OVerridovati metod:
1. getIme() - vraca "Sfera"

-------------------------------
    * */
}
