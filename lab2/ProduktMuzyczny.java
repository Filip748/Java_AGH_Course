public abstract class ProduktMuzyczny implements Sprzedawalny {
    private String name;
    private double cenaBazowa;
    private int sztuki;

    public ProduktMuzyczny(String name, double cenaBazowa, int sztuki) {
        this.name = name;
        this.cenaBazowa = cenaBazowa;
        this.sztuki = sztuki;
    }

    public double getCenaBazowa() {
        return this.cenaBazowa;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void zmniejszIloscSztuk(int n) {
        this.sztuki -= n;
    }

    @Override
    public int getIloscSztuk() {
        return this.sztuki;
    }

    @Override
    public double obliczCene() {
        return this.cenaBazowa;
    }
}
