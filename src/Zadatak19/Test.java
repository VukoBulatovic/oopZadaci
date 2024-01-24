package Zadatak19;

public class Test {
    public static void main(String[] args) {

        Osoba o = new Osoba("Vuko","Bulatovic",30);
        System.out.println(o);

        o.pokreniSe();
        System.out.println(o.potrosnja());
        System.out.println(" ");

        Auto a = new Auto("Audi","Quattro",100_000);
        System.out.println(a);

        a.pokreniSe();
        System.out.println(a.potrosnja());
        System.out.println(" ");

        Vozilo m = new Motocikl("Suzuki","4tact",55000);
        System.out.println(m + "\n");

        Voz v = new Voz(TipVoza.PUTNICKI,8);
        System.out.println(v);
        v.pokreniSe();

        Voz vo = new Voz(TipVoza.TERETNI,10);
        System.out.println(vo);
        vo.potrosnja();


    }
}
