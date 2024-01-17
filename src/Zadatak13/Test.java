package Zadatak13;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Namirnica hleb = new Namirnica("hleb",0.79);
        Namirnica mleko = new Namirnica("mleko",123.99);
        Namirnica jaja = new Namirnica("jaja",224.99);
        Namirnica brasno = new Namirnica("brasno",84.79);
        Namirnica tuna = new Namirnica("tuna",239.99);

        ArrayList<Namirnica> osnovneNamirnice = new ArrayList<>();
        osnovneNamirnice.add(hleb);
        osnovneNamirnice.add(mleko);
        osnovneNamirnice.add(jaja);
        osnovneNamirnice.add(brasno);

        Prodavnica maxi = new Prodavnica("Maxi",osnovneNamirnice);
        System.out.println(maxi);

        maxi.dodajNamirnicu(tuna);
        System.out.println(maxi);
        maxi.ukloniNamirnicu(tuna);
        System.out.println(maxi);

        System.out.println("==========================");

        Osoba vuko = new Osoba("Vuko","Bulatovic");


        Korpa korpica = new Korpa();
        korpica.dodajUKorpu(tuna,3);
        korpica.dodajUKorpu(jaja);
        korpica.dodajUKorpu(hleb);
        korpica.ukloniIzKorpe(tuna,1);
        System.out.println(korpica);

        /*orpica.dodajUKorpu(mleko,6);
        System.out.println(korpica);

        korpica.dodajUKorpu(mleko);
        System.out.println(korpica);

        korpica.ukloniIzKorpe(mleko);
        System.out.println(korpica);

        korpica.ukloniIzKorpe(mleko,3);
        System.out.println(korpica);

        System.out.println(korpica.cenaKorpe());
        korpica.isprazniKorpu();
        System.out.println(korpica);*/








    }
}
