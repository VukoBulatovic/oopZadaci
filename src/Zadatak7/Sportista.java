package Zadatak7;
/*sport - Napisati klasu Sportista. Sportista ima
1) ime i prezime (polje tipa String) koje moze da se dohvati, ali ne i postavi
2) sport kojim se bavi (polje tipa String) koje moze da se dohvati ali ne i postavi
3) klub za koji igra (polje tipa String) koje moze da se dohvati. Sportista moze da promeni klub za koji igra.
4) broj koji nosi na dresu (tipa int) koje moze i da se dohvati i da se postavi.
Napisati glavni program koji kreira tri igraca. U glavnom programu iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Sportista.*/
public class Sportista {

    private String ime;
    private String prezime;
    private String sport;
    private String klub;
    private int brojDresa;

    public Sportista(String ime, String prezime, String sport, String klub, int brojDresa) {
        this.ime = ime;
        this.prezime = prezime;
        this.sport = sport;
        this.klub = klub;
        this.brojDresa = brojDresa;
    }

    public Sportista() {
    }

    public String getIme() {
        return ime;
    }
    public String getPrezime() {
        return prezime;
    }
    public String getSport() {
        return sport;
    }

    public String getKlub() {
        return klub;
    }
    public void setKlub(String klub) {
        this.klub = klub;
    }

    public int getBrojDresa() {
        return brojDresa;
    }
    public void setBrojDresa(int brojDresa) {
        this.brojDresa = brojDresa;
    }
}

    class GlavniProgram {
        public static void main(String[] args) {

            Sportista fudbaler = new Sportista("Peter","Crouch","Fudbal","Manchester UTD",22);
            System.out.println(fudbaler.getIme());
            System.out.println(fudbaler.getPrezime());
            System.out.println(fudbaler.getSport());
            System.out.println(fudbaler.getKlub());
            System.out.println(fudbaler.getBrojDresa());

            System.out.println("=============");
            fudbaler.setKlub("Newcastle");
            System.out.println(fudbaler.getKlub());
            fudbaler.setBrojDresa(44);
            System.out.println(fudbaler.getBrojDresa());

        }
    }
