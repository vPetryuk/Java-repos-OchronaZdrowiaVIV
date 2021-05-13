package pacjent;

import java.util.List;

public class pacjent extends Osoba {
    private int nrUbezpieczenia;
    private Osoba lekarzRodzinny;
    private List<Skierowanie> listaskierowan;
    private List<Badanie> listaBadan;
    private List<String> leki;
    private List<Recepty> recepty;
}
