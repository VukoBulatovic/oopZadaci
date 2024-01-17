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
        maxi.dodajNamirnicu(tuna);

        System.out.println(maxi);

        System.out.println("==========================");

        Korpa korpica = new Korpa();
        korpica.dodajUKorpu(tuna,3);
        korpica.dodajUKorpu(jaja);
        korpica.dodajUKorpu(hleb);
        korpica.ukloniIzKorpe(tuna,1);
        System.out.println(korpica);


        System.out.println("==============================\n");


        Kupac marko = new Kupac("Marko","Goranovic",31,22000);
        marko.dodajUKorpu(jaja,3);
        marko.dodajUKorpu(mleko,2);
        marko.dodajUKorpu(tuna);
        marko.dodajUKorpu(hleb,1);

        marko.kupi();
        System.out.println(marko);





    }
}
