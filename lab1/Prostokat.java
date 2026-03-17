public class Prostokat extends Figura {
    private static int liczbaProstokatow = 0;
    private int a;
    private int b;

    public Prostokat(int a, int b) {
        super();
        this.a = a;
        this.b = b;
        liczbaProstokatow++;
    }

    public static int pobierzLiczbeProstokatow() {
        return liczbaProstokatow;
    }

    @Override
    public double obliczPole() {
        return a * b;
    }

    @Override
    public double obliczObwod() {
        return 2 * a + 2 * b;
    }

    @Override 
    public String pobierzNazwe() {
        return "Prostokat: ";
    }
}