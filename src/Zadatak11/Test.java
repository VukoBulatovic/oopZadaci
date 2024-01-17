package Zadatak11;

public class Test {

    public static void main(String[] args) {


        Pravougaonik prvi = new Pravougaonik(34,61);
        Pravougaonik drugi = new Pravougaonik(61,34);
        Pravougaonik treci = new Pravougaonik(33,34);
        Pravougaonik cetvrti = new Pravougaonik(34,61);


        System.out.println(prvi.equals(drugi)); //exp false
        System.out.println(treci.equals(cetvrti)); //exp false
        System.out.println(prvi.equals(cetvrti)); //exp true

        System.out.println(prvi.hashCode());
        System.out.println(cetvrti.hashCode());

        if(prvi.hashCode() == cetvrti.hashCode()){
            System.out.println("Imaju isti hachCode!");
        }



    }


}
