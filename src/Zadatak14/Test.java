package Zadatak14;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

     Ljubimac pas = new Ljubimac("Dzeki","Pas",4,false,5.6);
     Ljubimac pauk = new Ljubimac("Floki","Zglavkar",8,false,0.2);
     Ljubimac zmija = new Ljubimac("Tasta","Gmizavac",0,false,0.6);
     Ljubimac papagaj = new Ljubimac("Zako","Ptica",2,true,1.2);

     ArrayList<Ljubimac> domaci = new ArrayList<>();
     domaci.add(pas);
     domaci.add(pauk);
     domaci.add(zmija);
     domaci.add(papagaj);

     Vlasnik vuko = new Vlasnik("Vuko","Bulatovic",30,domaci);

     System.out.println(vuko);

     Odgajivac marko = new Odgajivac("Marko","Markovic",30,domaci,"Ptica");
     System.out.println(marko);






    }
}
