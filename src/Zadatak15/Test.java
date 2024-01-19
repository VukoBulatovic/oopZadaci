package Zadatak15;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("Matisa");
        al.add("Srpski");
        al.add("Veronauka");


        Profesor pr = new Profesor("Vuko","Bulatovic",30,al);
        System.out.println(pr);







    }
}
