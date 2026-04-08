public abstract class ProduktMuzyczny implements Sprzedawalny {
    private String name;
    private double cenaBazowa;
    private int ilosc;

    public ProduktMuzyczny(String name, double cenaBazowa, int ilosc) {
        this.name = name;
        this.cenaBazowa = cenaBazowa;
        this.ilosc = ilosc;
    }

    public String getName() { return this.name; }
    public double getCenaBazowa() { return this.cenaBazowa; }

    @Override
    public void zmniejszIloscSztuk(int n) {
        this.ilosc -= n;
    }

    @Override
    public int getIloscSztuk() {
        return this.ilosc;
    }

    @Override
    public double obliczCene() {
        return cenaBazowa;
    }

}