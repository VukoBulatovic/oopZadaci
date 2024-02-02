package DZadatak1;

import java.util.ArrayList;
import java.util.List;

public class Mercedes extends Automobil {

    public Mercedes(List<Tocak> listaTockova, int godiste, double cena) {
        super(listaTockova, godiste, cena);
    }

    @Override
    public boolean vratiOstecene(Tocak t) {
        return t.getTrajanjeTocka() <= 100;
    }

    @Override
    public void zameniTocak() {
        List<Tocak> noviTockovi = new ArrayList<>();
        for (Tocak t : getListaTockova()){
            if(t.getTrajanjeTocka() > 100){
                noviTockovi.add(new Tocak(0,t.getCenaTocka()));
            } else {
                noviTockovi.add(t);
            }
        }
        setListaTockova(noviTockovi);
    }
    }



