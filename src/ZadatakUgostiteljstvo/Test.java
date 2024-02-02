package ZadatakUgostiteljstvo;

public class Test {
    public static void main(String[] args) {

        Osoba o1 = new Osoba("Vuko","Bulatovic",30);
        Osoba o2 = new Osoba("Marko","Makrovic",30);

        Radnik r1 = new Radnik(324);
        Radnik r2 = new Radnik(233);

        System.out.println(r1);
        System.out.println(r2);
        r2.setId(0);
        System.out.println(r2);
        System.out.println(r1);







    }
}
