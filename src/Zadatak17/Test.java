package Zadatak17;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Zivotinja k = new Krava("Belka",230);
        Zivotinja o = new Ovca("Bleki",120);
        Zivotinja p = new Pas("Lesi",25);
        Zivotinja m = new Macka("Mici",5);
        Zivotinja ko = new Konj("Oto",205);
        Zivotinja kok = new Kokoska("Sofronije",2);

        ArrayList<Zivotinja> listaDomacih = new ArrayList<>();
        listaDomacih.add(o);
        listaDomacih.add(p);
        listaDomacih.add(k);
        listaDomacih.add(m);
        listaDomacih.add(ko);
        listaDomacih.add(kok);


        for (Zivotinja z : listaDomacih){
            System.out.println(z);
            z.leti();
            z.pliva();
            System.out.print("Oglasavam se sa : ");
            z.oglasiSe();
            System.out.print("\n");
        }

        Zivotinja l = new Lav();
        Zivotinja z = new Zmija();
        Zivotinja d = new Delfin();

        ArrayList<Zivotinja> listaDivljih = new ArrayList<>();
        listaDivljih.add(l);
        listaDivljih.add(z);
        listaDivljih.add(d);

        for (Zivotinja zi : listaDivljih){
            System.out.println(zi);
            zi.leti();
            zi.pliva();
            System.out.print("Oglasavam se sa : ");
            zi.oglasiSe();
            System.out.print("\n");
        }







    }
}
