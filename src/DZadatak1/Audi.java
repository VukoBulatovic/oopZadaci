package DZadatak1;

import java.util.ArrayList;
import java.util.List;

public class Audi extends Automobil {

    public Audi(List<Tocak> listaTockova, int godiste, double cena) {
        super(listaTockova, godiste, cena);
    }

    @Override
    public boolean vratiOstecene(Tocak t) {
        return t.getTrajanjeTocka() <= 60;
    }

    @Override
    public void zameniTocak() {
        List<Tocak> noviTockovi = new ArrayList<>();
        for (Tocak t : getListaTockova()){
            if(t.getTrajanjeTocka() > 60){
                noviTockovi.add(new Tocak(0,t.getCenaTocka()));
            } else {
                noviTockovi.add(t);
            }
        }
        setListaTockova(noviTockovi);
    }
    }

