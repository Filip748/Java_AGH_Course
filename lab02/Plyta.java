public class Plyta extends ProduktMuzyczny {
    private String wykonawca;
    private int rok;
    private String gatunek;

    public Plyta(String name, double cena, int ilosc, String wykonawca, int rok, String gatunek) {
        super(name, cena, ilosc);
        this.wykonawca = wykonawca;
        this.rok = rok;
        this.gatunek = gatunek;
    }

    public String getWykonawca() { return this.wykonawca; }
    public int getRok() { return this.rok; }
    public String getGatunek() { return this.gatunek; }

    @Override
    public double obliczCene() { 
        int aktualnyRok = 2025;
        return (aktualnyRok - this.rok <= 5) ? getCenaBazowa() * 1.1 : getCenaBazowa();
    }

    @Override
    public String getInfo() {
        return "Plyta: "  + getName() + ", Wykonawca: " + getWykonawca() + ", Rok: " + getRok() + ", Gatunek: " + getGatunek() + ", Cena: " + obliczCene() + " zł";
    }
}
