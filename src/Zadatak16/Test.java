package Zadatak16;

public class Test {
    public static void main(String[] args) {

        Vozilo v = new Automobil();
        System.out.println(v + "\n");

        Automobil a = new Automobil("123141","Audi","Karavan",4);
        System.out.println(a + "\n");

        Vozilo v1 = new Automobil("131431243","Golf","Kupe",2);
        System.out.println(v1);

        a.dodajPutnika();
        a.isprazniAuto();
        a.napuniAuto();
        a.dodajPutnika();
        System.out.println(a);

    }
}
