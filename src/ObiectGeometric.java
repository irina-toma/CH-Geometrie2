public abstract class ObiectGeometric implements IComanda, IPrintare {
    protected String culoare;

    public ObiectGeometric(String culoare) {
        this.culoare = culoare;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public abstract float calculArie();

    public abstract float calculPerimetru();

    @Override
    public void tipareste() {
        System.out.printf("Tipareste obiect de culoarea %s %n", this.culoare);
    }
}
