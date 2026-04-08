public class Instrument extends ProduktMuzyczny {
    private String rodzaj;
    private String marka;
    private boolean czyAkustyczny;

    public Instrument(String name, double cena, int ilosc, String rodzaj, String marka, boolean czyAkustyczny) {
        super(name, cena, ilosc);
        this.rodzaj = rodzaj;
        this.marka = marka;
        this.czyAkustyczny = czyAkustyczny;       
    }

    public String getRodzaj() { return this.rodzaj; }
    public String getMarka() { return this.marka; }
    public String getCzyAkustyczny() { 
        if(czyAkustyczny) {
            return "akustyczny";
        }
        return "elektryczny";
     }

    @Override
    public double obliczCene() {
        return czyAkustyczny ? getCenaBazowa()* 1.15 : getCenaBazowa();
    }

    @Override
    public String getInfo() { 
        return "Instrument: " + getName() + ", Marka: " + getMarka() + ", Rodzaj: " + getRodzaj() + ", " + getCzyAkustyczny() + ", Cena: " + obliczCene() + " zł";
    }
}
