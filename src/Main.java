import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        ObiectGeometric og = new ObiectGeometric(); // nu merge pt ca e abstract

        ObiectGeometric[] objList = new ObiectGeometric[10];

        Scanner sc = new Scanner(System.in);

        while (true) {
            // TODO: oprire la introducerea cuvantului "stop"
            System.out.println("Introduceti tipul " +
                    "obiectului si parametrii");
            // cerc albastru 3.5
            // patrat negru 1.89
            String tip = sc.next();
            String culoare = sc.next();
            float param = sc.nextFloat();

            if (tip.equals("cerc")) {
                Cerc c = new Cerc(culoare, param);
                System.out.println(c.calculArie());
                System.out.println(c.calculPerimetru());

                c.redimensionare(5);
                System.out.println(c.calculArie());
            } else if (tip.equals("patrat")) {
                Patrat p = new Patrat(culoare, param);
                System.out.println(p.calculArie());
                System.out.println(p.calculPerimetru());
                p.redimensionare(5);
                System.out.println(p.calculArie());
                p.tipareste();
                System.out.printf("Un %s de culoare %s cu " +
                        "latura %.2f si aria de %.3f si perimetrul de %f %n",
                        tip,
                        culoare,
                        param,
                        p.calculArie(),
                        p.calculPerimetru());
            } else {
                System.out.println("Tip invalid");
            }


        }
//            String s = "abc";
//            s.compareTo("cde");
    }
}
