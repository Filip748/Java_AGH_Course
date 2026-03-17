import java.util.ArrayList;
import java.util.List;

public class SklepMuzyczny {
    private List<ProduktMuzyczny> asortyment;

    public SklepMuzyczny(int pojemnosc) {
        this.asortyment = new ArrayList<>(pojemnosc);
    }

    public void dodajProdukt(ProduktMuzyczny produkt) { 
        asortyment.add(produkt);
    }

    public void wyswietlWszystkieProdukty() { 
        for(ProduktMuzyczny produkt : asortyment) {
            System.out.println(produkt.getInfo());
        }
    }

    public void sprzedajProdukt(int indeks, int ilosc) {
        if (indeks >= 0 && indeks < this.asortyment.size()) {
            ProduktMuzyczny produkt = this.asortyment.get(indeks);
            produkt.zmniejszIloscSztuk(ilosc);
            System.out.println("Sprzedano: " + produkt.getInfo());
        } else {
            System.out.println("Błąd: Nie znaleziono produktu o podanym indeksie.");
        }
    }

    public void wypozyczInstrument(InstrumentDoWypozyczenia instrument, int liczbaDni) {
        if (instrument.czyDostepny()) {
            instrument.wypozycz();
            System.out.println("Wypożyczono: " + instrument.getInfo());
            System.out.println("Koszt wypożyczenia na " + liczbaDni + " dni: " + instrument.obliczKosztWypozyczenia(liczbaDni) + " zł");
        } else {
            System.out.println("Błąd: Instrument nie jest dostępny do wypożyczenia");
        }
    }

    public void zwrocInstrument(InstrumentDoWypozyczenia instrument) {
        instrument.zwroc();
        System.out.println("Zwrócono: " + instrument.getInfo());
    }
}
