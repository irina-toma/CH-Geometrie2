import java.util.Comparator;

public class CercRazaComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Cerc c1 = ((Cerc)o1);
        Cerc c2 = ((Cerc)o2);

        if (c1.getRaza() > c2.getRaza()) {
            return 1;
        } else if (c1.getRaza() < c2.getRaza()) {
            return -1;
        } else {
            return 0;
        }
    }
}
