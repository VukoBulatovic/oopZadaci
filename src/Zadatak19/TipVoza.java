package Zadatak19;

public enum TipVoza {

    PUTNICKI(0),
    TERETNI(2);

    private final int brojVagona;

    TipVoza(int brojVagona) {
        this.brojVagona = brojVagona;
    }

    public int getBrojVagona() {
        return brojVagona;
    }
}

