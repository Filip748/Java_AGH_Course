public class Akcesorium extends ProduktMuzyczny {
    private String kategoria;
    private boolean czyProfesjonalne;

    public Akcesorium(String name, double cenaBazowa, int sztuki, String kategoria, boolean czyProfesjonalne) {
        super(name, cenaBazowa, sztuki);
        this.kategoria = kategoria;
        this.czyProfesjonalne = czyProfesjonalne;
    }

    public String getCzyPro() {
        if(this.czyProfesjonalne == true) {
            return "profesjonalne";
        }
        return "amatorskie";
    }

    @Override
    public double obliczCene() {
        return czyProfesjonalne ? getCenaBazowa()* 1.25 : getCenaBazowa();
    }

    @Override
    public String getInfo() {
        return "Akcesorium: " + getName() + ", Kategoria: " + this.kategoria + getCzyPro() + ", Cena: " + obliczCene() + " zł"; 
    }
}
