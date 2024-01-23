package Zadatak16;

public class Test {
    public static void main(String[] args) {

        Vozilo v = new Automobil();
        System.out.println(v + "\n");

        Automobil a = new Automobil();
        System.out.println(a + "\n");

        Vozilo v1 = new Automobil();
        System.out.println(v1 + "\n");

        /*a.dodajPutnika();
        a.isprazniAuto();
        a.napuniAuto();
        a.dodajPutnika();
        System.out.println(a);*/

        Motocikl m = new Motocikl(1);
        System.out.println(m);
        m.dodajPutnika();
        System.out.println(m);

        Autobus as = new Autobus();
        System.out.println(as);
        as.dodajPutnika(99);
        System.out.println(as);
        as.setRegistarskiBroj("31231414");
        System.out.println(as);



    }
}
