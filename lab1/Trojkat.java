public class Trojkat extends Figura{
    private static int liczbaTrojkatow = 0;
    private int a;
    private int b;
    private int c;

    public Trojkat(int a, int b, int c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
        liczbaTrojkatow++;
    }

    public static int pobierzLiczbeTrojkatow() { 
        return liczbaTrojkatow;
    }

    @Override
    public double obliczPole() {
        double p = obliczObwod() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double obliczObwod() {
        return a + b + c;
    }

    @Override
    public String pobierzNazwe() {
        return "Trojkat: ";
    }
}
