import java.util.Arrays;

public class MainCompare {
    public static void main(String[] args) {
        Cerc[] cercList = new Cerc[3];

        Cerc c1 = new Cerc("verde", 5);
        Cerc c2 = new Cerc("albastru", 5);
        Cerc c3 = new Cerc("galben", 12);

        cercList[0] = c1;
        cercList[1] = c2;
        cercList[2] = c3;

        Arrays.sort(cercList);

        for (Cerc c : cercList) {
            System.out.println(c.getCuloare());
        }


        Patrat[] patratList = new Patrat[3];
        patratList[0] = new Patrat("x", 1);
        patratList[1] = new Patrat("y", 6);
        patratList[2] = new Patrat("h", 3);

        Arrays.sort(patratList);

        for (Patrat p : patratList) {
            System.out.printf("Culoare: %s, latura: %f %n",
                    p.getCuloare(), p.getLatura());
        }

        // 1. vrem sa comparam cercurile in functie de raza
        // 2. vrem sa comparam cercurile in functie de culoare
        // => 2 comparatori

        //dupa raza
        Arrays.sort(cercList, new CercRazaComparator());
        for (Cerc c : cercList) {
            System.out.println(c.getRaza());
        }

        //dupa culoare
        //Arrays.sort(cercList, new CercCuloareComparator());
    }
}
