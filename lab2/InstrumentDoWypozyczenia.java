public class InstrumentDoWypozyczenia extends Instrument implements Wypozyczalny {
    private boolean czyDostepny;
    private double dziennaStawka;

    public InstrumentDoWypozyczenia(String name, double cenaBazowa, int sztuki, String rodzaj, String marka, boolean czyAkustyczny, double dziennaStawka) {
        super(name, cenaBazowa, sztuki, rodzaj, marka, czyAkustyczny);
        this.czyDostepny = true;
        this.dziennaStawka = dziennaStawka;
    }

    public String czyDost() { 
        return czyDostepny ? "Dostępny" : "Niedostępny";
    }

    @Override
    public boolean czyDostepny() {
        return this.czyDostepny;
    }

    @Override
    public void zwroc() { 
        this.czyDostepny = true;
    }

    @Override
    public void wypozycz() { 
        if(czyDostepny()) {
            this.czyDostepny = false;
        }
        else {
            System.out.println("Błąd: Instrument nie jest dostępny do wypożyczenia");
        }
    }

    @Override
    public double obliczKosztWypozyczenia(int liczbaDni) {
        // Zniżka przy dłuższym okresie wypożyczenia
        if (liczbaDni > 30) {
            return liczbaDni * dziennaStawka * 0.8; // 20% zniżki
        } else if (liczbaDni > 7) {
            return liczbaDni * dziennaStawka * 0.9; // 10% zniżki
        }
        return liczbaDni * dziennaStawka;
    }

    @Override
    public String getInfo() {
        return "Instrument: " + getName() + ", Marka: " + getMarka() + ", Rodzaj: " + getRodzaj() + ", " + getCzyAku() + ", Cena: " + obliczCene() + " zł, Stawka dzienna: " + this.dziennaStawka + " zł, " + czyDost();

    }

    
}
