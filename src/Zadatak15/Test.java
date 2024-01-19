package Zadatak15;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<String> predmeti = new ArrayList<>();
        predmeti.add("Matisa");
        predmeti.add("Srpski");
        predmeti.add("Veronauka");

        ArrayList<Double> ocene = new ArrayList<>();
        ocene.add(4.0);
        ocene.add(5.0);
        ocene.add(5.0);
        ocene.add(3.0);

        ArrayList<String> bojice = new ArrayList<>();
        bojice.add("Plava");
        bojice.add("Crvena");
        bojice.add("Zelena");


        Profesor pr = new Profesor("Vuko","Bulatovic",30,predmeti);
        Profesor pr2 = new Profesor("Blagoje","Stanic",28,predmeti);
        Profesor pr3 = new Profesor("Miloje","Medenica",48,predmeti);

        ArrayList<Profesor> profesori = new ArrayList<>();
        profesori.add(pr);
        profesori.add(pr2);
        profesori.add(pr3);

        System.out.println(pr + "\n");

        Ucenik u = new Ucenik("Jane","Mercury",32,ocene);
        System.out.println(u + "\n");
        //System.out.println(u + "\n");
        //System.out.println(u.kakavJeDjak());
        /*u.dodajOcenu(4.0);
        System.out.println(u);
        u.promeniOcenu(3.0,1);
        System.out.println(u);
        u.izbrisiOcenu(2);
        System.out.println(u);
        u.izbrisiOcenu(4.0);
        System.out.println(u);
        System.out.println(u.kakavJeDjak());*/

        Osnovac o = new Osnovac("Marko","Markovic",6,ocene, bojice);
        System.out.println(o + "\n");

        Gimnazijalac g = new Gimnazijalac("Milos","Boskovic",16,ocene,"Nije polozen");
        System.out.println(g + "\n");

        Student s = new Student("Marija","Radovic",21,ocene,predmeti,profesori);
        System.out.println(s);





    }
}
