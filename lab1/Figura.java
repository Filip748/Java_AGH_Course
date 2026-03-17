public abstract class Figura {
    private static int liczbaWszystkichFigur = 0;

    public Figura() {
        liczbaWszystkichFigur++;
    }

    public static int pobierzLiczbeWszystkichFigur() {
        return liczbaWszystkichFigur;
    }

    public abstract double obliczPole();
    public abstract double obliczObwod();
    public abstract String pobierzNazwe();

    @Override
    public String toString() {
        return pobierzNazwe() + "Pole = " + obliczPole() + ", Obwod = " + obliczObwod();
    }

}
