public class Semestar {
    private PlanStudija planStudija;
    private int redniBroj;

    public Semestar(PlanStudija planStudija, int redniBroj) {
        this.planStudija = planStudija;
        this.redniBroj = redniBroj;
    }

    public PlanStudija getPlanStudija() {
        return planStudija;
    }

    public void setPlanStudija(PlanStudija planStudija) {
        this.planStudija = planStudija;
    }

    public int getRedniBroj() {
        return redniBroj;
    }

    public void setRedniBroj(int redniBroj) {
        this.redniBroj = redniBroj;
    }
}
