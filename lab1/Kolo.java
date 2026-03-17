public class Kolo extends Figura {
    private static int liczbaKol = 0;
    private int promien;

    public Kolo(int promien) {
        super();
        this.promien = promien;
        liczbaKol++;
    }

    public static int pobierzLiczbeKol() {
        return liczbaKol;
    }

    @Override
    public double obliczPole() {
        return Math.PI * promien * promien;
    }

    @Override 
    public double obliczObwod() {
        return 2 * Math.PI * promien;
    }

    @Override
    public String pobierzNazwe() {
        return "Kolo: ";
    }
}
