package Zadatak6;

/*6. Napisati klasu Knjiga koja ima sledeca polja/atribute:
nazivKnjige (string),
autor (Osoba),
vlasnik (Osoba)
brojStrana (int),
godinaIzdanja (int).

Broj strana i godina izadanje ne mogu biti negativni.
Ispisati poruku o gresci ako korisnik pokusa da napravi knjigu
sa negativnim brojem strana ili godinom izdanja (u konstruktoru, jer se tamo 'pravi' knjiga).

Takodje ispisati poruku o gresci ako korisnik pokusa da set-uje
neku od ove dve vrednosti na negativno.


Napisati sledece metode
	2 konstruktora. Knjiga ne mora imati vlasnika ->
	dakle jedan konstruktor gde se salje i ko je vlasnik,
	drugi konstruktor gde se ne salje ko je vlasnik

	getter i setter metode za sva polja

	toString koristeci stringBuilder
	format
		Naziv knjige je: <naziv knjige>
		Autor knjige je: <ime i prezime autora ako postoji, 'nepoznato' ako autor nije postavljen (null)>
		Vlasnik knjige je: <ime i prezime vlasnika ako postoji, 'knjiga nema vlasnika' ako vlasnik nije postavljen (null)>
		Broj strana: <broj strana>
		Godina izdanja: <godina izdanja>
	napisati i metodu "velicinaKnjige" koja vraca string
		- "mala knjiga" - ako je broj strana od 0 do 100
		- "srednje velika knjiga" - ako je broj strana od 101 do 300
		- "velika knjiga" - ako je broj strana od 301-600
		- "bas velika knjiga" - ako je broj strana 601 i vise*/
public class Knjiga {

    //atributi
    private String nazivKnjige;
    private int brojStrana;  //ne mogu biti  -
    private int godinaIzdanja;   //ne mogu biti  -
    private Osoba autor;
    private Osoba vlasnik;

    //konstruktori

    public Knjiga(String nazivKnjige, int brojStrana, int godinaIzdanja, Osoba autor, Osoba vlasnik) {
        this.nazivKnjige = nazivKnjige;
        setBrojStrana(brojStrana);
        setGodinaIzdanja(godinaIzdanja);
        this.autor = autor;
        this.vlasnik = vlasnik;
    }

    public Knjiga(String nazivKnjige, int brojStrana, int godinaIzdanja, Osoba autor) {
        this.nazivKnjige = nazivKnjige;
        setBrojStrana(brojStrana);
        setGodinaIzdanja(godinaIzdanja);
        this.autor = autor;
    }


    //getteri i setteri

    public String getNazivKnjige() {
        return nazivKnjige;
    }
    public void setNazivKnjige(String nazivKnjige) {
        this.nazivKnjige = nazivKnjige;
    }

    public int getBrojStrana() {
        return brojStrana;
    }
    public void setBrojStrana(int brojStrana) {
        if(brojStrana >= 0)
         this.brojStrana = brojStrana;
        else
            System.out.println("Greska broj strana ne moze biti negativan!");
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }
    public void setGodinaIzdanja(int godinaIzdanja) {
        if(godinaIzdanja >= 0)
         this.godinaIzdanja = godinaIzdanja;
        else
            System.out.println("Greska godina izdanja ne moze biti negativan broj!");
    }

    public Osoba getAutor() {
        return autor;
    }
    public void setAutor(Osoba autor) {
        this.autor = autor;
    }

    public Osoba getVlasnik() {
        return vlasnik;
    }
    public void setVlasnik(Osoba vlasnik) {
        this.vlasnik = vlasnik;
    }

    //metode

    public String velicinaKnjige(){
        String vk = "";
        if(getBrojStrana() >= 0 && getBrojStrana() <= 100){
            vk = "mala knjiga";}
        else if (getBrojStrana() >= 101 && getBrojStrana() <= 300) {
            vk = "srednje velika knjiga";}
        else if (getBrojStrana() >= 301 && getBrojStrana() <= 600) {
            vk = "velika knjiga";}
        else if (getBrojStrana() >= 601) {
            vk = "bas velika knjiga";}
        return vk;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Naziv knjige je: ").append(getNazivKnjige()).append("\n");
        sb.append("Autor knjige je: ");
        if (autor.getIme() != null && autor.getPrezime() != null) {
            sb.append(getAutor());
        } else {
            sb.append("Nepoznato");}
        sb.append("\n");
        if(vlasnik != null){
        sb.append("Vlasnik knjige je: ");
            if (vlasnik.getIme() != null && vlasnik.getPrezime() != null) {
                sb.append(getVlasnik());
            } else {
                sb.append("Nema vlasnika");
            }
            sb.append("\n");}
        sb.append("Broj strana je: ").append(getBrojStrana()).append("\n");
        sb.append("Godina izdanja je: ").append(getGodinaIzdanja()).append("\n");
        sb.append("Velicina knjige: ").append(velicinaKnjige());
        return sb.toString();
    }}