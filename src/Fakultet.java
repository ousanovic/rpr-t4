import java.util.ArrayList;
import java.util.List;

public class Fakultet {
    private List<Semestar> semestri;
    private List<Student> neupisaniStudenti;

    public Fakultet() {
        semestri = new ArrayList<Semestar>();
        neupisaniStudenti = new ArrayList<Student>();
    }

    public List<Semestar> getSemestri() {
        return semestri;
    }

    public List<Student> getNeupisaniStudenti() {
        return neupisaniStudenti;
    }
}
