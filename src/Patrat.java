public class Patrat extends ObiectGeometric implements Comparable{
    private float latura;

    public Patrat(String culoare, float latura) {
        super(culoare);
        this.latura = latura;
    }

    public float getLatura() {
        return latura;
    }

    @Override
    public float calculArie() {
        return this.latura * this.latura;
    }

    @Override
    public float calculPerimetru() {
        return 4 * this.latura;
    }

    @Override
    public void redimensionare(int procent) {
        this.latura = this.latura * (1 - procent / 100f);
    }

    @Override
    public void colorare(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public int compareTo(Object o) {
        Patrat p1 = ((Patrat)o);
        if (this.latura > p1.latura) {
            return -1;
        } else if (this.latura < p1.latura) {
            return 1;
        } else {
            return 0;
        }
    }
}
