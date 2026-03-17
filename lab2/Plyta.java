public class Plyta extends ProduktMuzyczny {
    private String wykonawca;
    private int rok;
    private String gatunek;

    public Plyta(String name, double cenaBazowa, int sztuki, String wykonawca, int rok, String gatunek) {
        super(name, cenaBazowa, sztuki);
        this.wykonawca = wykonawca;
        this.rok = rok;
        this.gatunek = gatunek;
    }

    @Override
    public double obliczCene() {
        int aktualnyRok = 2025;
        return (aktualnyRok - rok <= 5) ? getCenaBazowa() * 1.1 : getCenaBazowa();
    }

    @Override
    public String getInfo() {
        return "Płyta: " + getName() + ", Wykonawca: " + this.wykonawca + ", Rok: " + this.rok + ", Gatunek: " + this.gatunek + ", Cena: " + obliczCene() + " zł";
    }
}
