public class MainCast {
    public static void main(String[] args) {
        Cerc c = new Cerc("verde", 7);

        if (c instanceof ObiectGeometric) {
            System.out.println("Este " + c.getClass());
            System.out.println("Este ObiectGeometric");
        }

        if (c instanceof IPrintare) {
            System.out.println("Este IPrintare");
        }

        ObiectGeometric og = new Cerc("albastru", 11);

        if (og instanceof Cerc) {
            ((Cerc)og).calculArie();
        }

    }
}
