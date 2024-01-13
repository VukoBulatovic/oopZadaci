package Zadatak7;
public class Voznja {
    public static void main(String[] args) {

        Automobil honda = new Automobil("Honda","Civic",858247713);
        Automobil audi = new Automobil("Audi","quattro",314312512);
        Automobil golf = new Automobil("Volkswagen","Golf",324234114);

        System.out.println(honda.getMarka());
        System.out.println(honda.getModel());
        System.out.println(honda.getSerijskiBroj());
        System.out.println(honda.getVlasnik());
        honda.setVlasnik("Nikola");
        System.out.println(honda.getVlasnik());

        System.out.println("=====================");

        System.out.println(audi.getMarka());
        System.out.println(audi.getModel());
        System.out.println(audi.getSerijskiBroj());
        System.out.println(audi.getVlasnik());
        audi.setVlasnik("Nikola");
        System.out.println(audi.getVlasnik());

        System.out.println("=====================");

        System.out.println(golf.getMarka());
        System.out.println(golf.getModel());
        System.out.println(golf.getSerijskiBroj());
        golf.setVlasnik("Nikola");
        System.out.println(golf.getVlasnik());
    }
}
