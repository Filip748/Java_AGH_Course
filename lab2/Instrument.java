public class Instrument extends ProduktMuzyczny {
    private String rodzaj;
    private String marka;
    private boolean czyAkustyczny;

    public Instrument(String name, double cenaBazowa, int sztuki, String rodzaj, String marka, boolean czyAkustyczny) {
        super(name, cenaBazowa, sztuki);
        this.rodzaj = rodzaj;
        this.marka = marka;
        this.czyAkustyczny = czyAkustyczny;    
    }

    public String getCzyAku() {
        if(this.czyAkustyczny == true) {
            return "akustyczny";
        }
        return "elektryczny";
    }

    public String getRodzaj() {
        return this.rodzaj;
    }

    public String getMarka() {
        return this.marka;
    }

    @Override
    public double obliczCene() {
        return czyAkustyczny ? getCenaBazowa() * 1.15 : getCenaBazowa();
    }

    @Override
    public String getInfo() {
        return "Instrument: " + getName() + ", Marka: " + this.marka + ", Rodzaj: " + this.rodzaj + ", " + getCzyAku() + ", Cena: " + obliczCene() + " zł";
    }
    
}
