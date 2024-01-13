package Zadatak9;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Integer> listaOcena = new ArrayList<>();
        listaOcena.add(4);
        listaOcena.add(2);
        listaOcena.add(3);
        listaOcena.add(5);

        Ucenik marko = new Ucenik("Marko","Petrovic");
        Ucenik vuko = new Ucenik("Vuko","Bulatovic", listaOcena);
        Ucenik vaso = new Ucenik("Vaso","Markovic", listaOcena);
        Ucenik milena = new Ucenik("Milena","Boskovic", listaOcena);
        Ucenik ratko = new Ucenik("Ratko","Kuvic", listaOcena);
        //System.out.println(marko);
        //System.out.println(vuko);

        //System.out.println(vuko.prosek());

        ArrayList<Ucenik> ucenici = new ArrayList<>();
        ucenici.add(marko);
        ucenici.add(vuko);
        ucenici.add(vaso);
        ucenici.add(milena);


        Odeljenje VI2 = new Odeljenje("VII-2",ucenici);
        //VI2.upisiUcenika(marko);
        //VI2.upisiUcenika(vuko);
        System.out.println(VI2);

        VI2.upisiUcenika(ratko,2);
        System.out.println(VI2);
        VI2.ispisiUcenika(vaso);
        System.out.println(VI2);





    }
}
