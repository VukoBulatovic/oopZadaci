package Zadatak9;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Integer> listaOcenaRatko = new ArrayList<>();
        listaOcenaRatko.add(5);
        listaOcenaRatko.add(5);
        listaOcenaRatko.add(4);
        listaOcenaRatko.add(5);
        Ucenik marko = new Ucenik("Marko","Petrovic");
        Ucenik vuko = new Ucenik("Vuko","Bulatovic");
        Ucenik vaso = new Ucenik("Vaso","Markovic");
        Ucenik milena = new Ucenik("Milena","Boskovic");
        Ucenik ratko = new Ucenik("Ratko","Kuvic", listaOcenaRatko);

        vuko.ubaciUcene(3,4,5,3,2);
        vaso.ubaciUcene(3,2,3,1,3);
        milena.ubaciUcene(1,2,2,2,1);

        ArrayList<Ucenik> ucenici = new ArrayList<>();
        ucenici.add(marko);
        ucenici.add(vuko);
        ucenici.add(vaso);
        ucenici.add(milena);

        Odeljenje VI2 = new Odeljenje("VII-2",ucenici);
        System.out.println(VI2);

        VI2.upisiUcenika(ratko,2);
        System.out.println(VI2);
        VI2.ispisiUcenika(vaso);
        System.out.println(VI2);

        VI2.ispisiUcenika(1);
        System.out.println(VI2);

        System.out.println("===========================");
        VI2.pogledajOcene(milena);

        System.out.println("===========================");
        VI2.pogledajOcene(1);

        VI2.prosecnaOcena(milena);
        VI2.procecnaOcena(1);

        //VI2.ispisiUcenika(marko);
        //VI2.ispisiUcenika(ratko);
        //VI2.ispisiUcenika(milena);

        System.out.println(VI2.prosecnaOcenaOdeljenja());




    }
}
