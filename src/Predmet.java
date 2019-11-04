import java.util.List;

public class Predmet {
    private String naziv;
    private int ects;
    private List<Student> studenti;
    boolean obavezni;

    public Predmet(String naziv, int ects, List<Student> studenti, boolean obavezni) {
        this.naziv = naziv;
        this.ects = ects;
        this.studenti = studenti;
        this.obavezni = obavezni;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public boolean isObavezni() {
        return obavezni;
    }

    public void setObavezni(boolean obavezni) {
        this.obavezni = obavezni;
    }

    public void upisiStudenta(Student s) {
        studenti.add(s);
        s.setEctsOpterecenje(s.getEctsOpterecenje()+ects);
    }
}
