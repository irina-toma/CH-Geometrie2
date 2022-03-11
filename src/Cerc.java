public class Cerc extends ObiectGeometric implements Comparable {
    private float raza;

    public Cerc(String culoare, float raza) {
        super(culoare);
        this.raza = raza;
    }

    public float getRaza() {
        return this.raza;
    }

    @Override
    public float calculArie() {
        return (float) (Math.PI * this.raza * this.raza);
    }

    @Override
    public float calculPerimetru() {
        return (float) (2 * Math.PI * this.raza);
    }

    @Override
    public void redimensionare(int procent) {
        // procent > 0 - se miscoreaza; procent < 0 - se mareste
//        raza = 3
//        procent = 5
        this.raza = raza * (1 - procent / 100f);
    }

    @Override
    public void colorare(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public int compareTo(Object o) {
        if (this.raza > ((Cerc)o).raza) {
            return 1; // ceva pozitiv
        } else if (this.raza < ((Cerc)o).raza) {
            return -1; // ceva negativ
        } else {
            return this.culoare.compareTo(((Cerc) o).culoare);
        }

        // return (int)(this.raza - ((Cerc)o).raza); // doar daca raza este int
    }

}
