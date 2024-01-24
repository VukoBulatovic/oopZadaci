package Zadatak18;

public class Test {
    public static void main(String[] args) {

        Oblik kv = new Kvadrat(4);
        System.out.println(kv + "\n");
        Oblik kc = new Kocka(3,4,5);
        System.out.println(kc + "\n");
        Oblik pr = new Pravougaonik(4,8);
        System.out.println(pr + "\n");
        Oblik prz = new Prizma(3,6,7);
        System.out.println(prz + "\n");

        Figura fi = new Kvadrat(4);
        System.out.println(fi);





    }
}
