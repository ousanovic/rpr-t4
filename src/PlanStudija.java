import java.util.ArrayList;
import java.util.List;

public class PlanStudija {
    List<Predmet> predmeti;

    public PlanStudija() {
        this.predmeti = new ArrayList<Predmet>();
    }

    public List<Predmet> getPredmeti() {
        return predmeti;
    }

    public void dodajPredmet(Predmet p) {
        predmeti.add(p);
    }
}
