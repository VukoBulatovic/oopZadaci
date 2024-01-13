package Zadatak6;

public class Test {
    public static void main(String[] args) {

        Osoba autor = new Osoba("Vuko","Bulatovic");
        Osoba vlasnik = new Osoba();

        Knjiga knjiga = new Knjiga("Upornost",365,1993,autor,vlasnik);
        Knjiga knjiga2 = new Knjiga("Volja",730,1993,autor);

        System.out.println(knjiga);
        System.out.println("\n");
        System.out.println(knjiga2);



    }
}
