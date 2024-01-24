package DZadatak1;

import java.util.ArrayList;

public class Audi extends Automobil {

    public Audi(ArrayList<Tocak> listaTockova, int godiste, double cena) {
        super(listaTockova, godiste, cena);
    }

    @Override
    public boolean vratiOstecene(Tocak t) {
        return t.getTrajanjeTocka() <= 60;
    }

}
