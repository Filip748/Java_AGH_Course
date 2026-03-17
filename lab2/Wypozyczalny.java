public interface Wypozyczalny {

    boolean czyDostepny();
    double obliczKosztWypozyczenia(int n);
    void zwroc();
    void wypozycz();
    
}
