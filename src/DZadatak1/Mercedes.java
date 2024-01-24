package DZadatak1;

import java.util.ArrayList;

public class Mercedes extends Automobil {

    public Mercedes(ArrayList<Tocak> listaTockova, int godiste, double cena) {
        super(listaTockova, godiste, cena);
    }

    @Override
    public boolean vratiOstecene(Tocak t) {
        return t.getTrajanjeTocka() <= 100;
    }




}
