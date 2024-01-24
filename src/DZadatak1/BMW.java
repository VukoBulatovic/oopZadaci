package DZadatak1;

import java.util.ArrayList;

public class BMW extends Automobil {


    public BMW(ArrayList<Tocak> listaTockova, int godiste, double cena) {
        super(listaTockova, godiste, cena);
    }

    @Override
    public boolean vratiOstecene(Tocak t) {
        return t.getTrajanjeTocka() <= 100;
    }

    @Override
    public double cenaTockova() {
        double c = 0;
        for (Tocak t : getListaTockova()){
            c = c + t.getCenaTocka();
        }
        return c;
    }

    @Override
    public void zameniTocak() {


    }


}
