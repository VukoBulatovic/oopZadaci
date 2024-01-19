package Zadatak15;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("Matisa");
        al.add("Srpski");
        al.add("Veronauka");

        ArrayList<Double> al1 = new ArrayList<>();
        al1.add(2.0);
        al1.add(2.0);
        al1.add(5.0);


        Profesor pr = new Profesor("Vuko","Bulatovic",30,al);
        System.out.println(pr + "\n");

        Ucenik u = new Ucenik("Jane","Mercury",32,al1);
        //System.out.println(u + "\n");
        //System.out.println(u.kakavJeDjak());


        u.dodajOcenu(4.0);
        System.out.println(u);
        u.promeniOcenu(3.0,1);
        System.out.println(u);



    }
}
