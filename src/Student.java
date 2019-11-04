public class Student {
    private String imePrezime;
    private int indeks;
    private int ectsOpterecenje;
    private static int brojStudenata = 0;

    public Student(String imePrezime) {
        this.imePrezime = imePrezime;
        indeks = ++brojStudenata;
        ectsOpterecenje = 0;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public int getIndeks() {
        return indeks;
    }

    public void setIndeks(int indeks) {
        this.indeks = indeks;
    }

    public int getEctsOpterecenje() {
        return ectsOpterecenje;
    }

    public void setEctsOpterecenje(int ectsOpterecenje) {
        this.ectsOpterecenje = ectsOpterecenje;
    }
}
