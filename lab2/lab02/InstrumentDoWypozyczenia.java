public class InstrumentDoWypozyczenia  extends Instrument implements Wypozyczalny {
    private double dziennaStawka;
    private boolean dostepny;

    public InstrumentDoWypozyczenia(String name, double cena, int ilosc, String rodzaj, String marka, boolean czyAkustyczny, double dziennaStawka) {
        super(name, cena, ilosc, rodzaj, marka, czyAkustyczny);
        this.dziennaStawka = dziennaStawka;
        this.dostepny = true;
    }

    public double getDziennaStawka() { return dziennaStawka; }

    @Override
    public void zwroc() {
        dostepny = true;
    }

    @Override
    public void wypozycz() { 
        if(dostepny) {
            dostepny = false;
        }
    }

    @Override
    public boolean czyDostepny() { return dostepny; }

    @Override
    public double obliczKosztWypozyczenia(int liczbaDni) { 
        if (liczbaDni > 30) {
            return liczbaDni * dziennaStawka * 0.8; // 20% zniżki
        } else if (liczbaDni > 7) {
            return liczbaDni * dziennaStawka * 0.9; // 10% zniżki
        }
        return liczbaDni * dziennaStawka;
    } 

    @Override
    public String getInfo() {
        return "Instrument: " + getName() + ", Marka: " + getMarka() + ", Rodzaj: " + getRodzaj() + ", " + getCzyAkustyczny() + ", Cena: " + obliczCene() + " zł, Stawka dzienna: " + getDziennaStawka() + ", " + (czyDostepny() ? "Dostepny" : "Niedostepny");

    }
    
}
