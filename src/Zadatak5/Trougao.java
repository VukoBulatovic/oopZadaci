package Zadatak5;
/*5. Napisati klasu Trougao koja ima 3 double atributa za polja.
Napraviti metodu 'daLiJeTrougaoValidan', koji proverava da li 3 prosledjene stranice mogu da budu stranice nekog trougla.
Trougao nije validan ako je zbir bilo kojih dveju stranica strogo manji od duzine trece ili ako je neka stranica nepozitivne duzine.
Napraviti konstruktor koji prima 3 argumenta za atribute i proverava njihovu validnost. Ako nisu validni, ispisati neku odgovarajucu poruku i postaviti sve stranice na -1.
Napraviti gettere i settere za svako polje, kao i metode 'obim' i 'povrsina'
(Pogledati heronov obrazac: https://en.wikipedia.org/wiki/Heron%27s_formula)
Napraviti toString() metod:
Duzina stranice A je: {stranicaA}
Duzina stranice B je: {stranicaB}
Duzina stranice C je: {stranicaC}*/

public class Trougao {

    private double poljeA;
    private double poljeB;
    private double poljeC;

    public boolean daLiJeTrougaoValidan(double poljeA, double poljeB, double poljeC){
        boolean validan = true;
        if((poljeA + poljeB) < poljeC)
            validan = false;
        if((poljeA + poljeC) < poljeB)
            validan = false;
        if((poljeB + poljeC) < poljeC)
            validan = false;
        if(poljeA < 0 || poljeB < 0 || poljeC < 0)
            validan = false;
        return validan;
    }

    public Trougao(double poljeA, double poljeB, double poljeC) {
        if(daLiJeTrougaoValidan(poljeA,poljeB,poljeC)){
        this.poljeA = poljeA;
        this.poljeB = poljeB;
        this.poljeC = poljeC;}
        else {
            System.out.println("Trougao nije validan!");
            this.poljeA = -1;
            this.poljeB = -1;
            this.poljeC = -1;
        }
    }

    public Trougao() {
    }

    public double getPoljeA() {
        return poljeA;
    }

    public void setPoljeA(double poljeA) {
        this.poljeA = poljeA;
    }

    public double getPoljeB() {
        return poljeB;
    }

    public void setPoljeB(double poljeB) {
        this.poljeB = poljeB;
    }

    public double getPoljeC() {
        return poljeC;
    }

    public void setPoljeC(double poljeC) {
        this.poljeC = poljeC;
    }



    public double obim(){
        return poljeA + poljeB + poljeC;
    }

    public double povrsina(){
        double s = obim() / 2;
        return Math.sqrt(s * (s - poljeA) * (s - poljeB) * (s - poljeC));
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Duzina stranice A je: ").append(poljeA).append("\n");
        sb.append("Duzina stranice B je: ").append(poljeB).append("\n");
        sb.append("Duzina stranice C je: ").append(poljeC);
        return sb.toString();
    }


}
