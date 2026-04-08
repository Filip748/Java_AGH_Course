public class Akcesorium extends ProduktMuzyczny {
    private String kategoria;
    private boolean pro;

    public Akcesorium(String name, double cena, int ilosc, String kategoria, boolean pro) {
        super(name, cena, ilosc);
        this.kategoria = kategoria;
        this.pro = pro;
    }

    public String getKategoria() { return this.kategoria; }
    public String getPro() {
        if(pro) {
            return "profesjonalne";
        }
        return "amatorskie";
    }

    @Override
    public double obliczCene() {
        return pro ? getCenaBazowa() * 1.25 : getCenaBazowa();
    }

    @Override
    public String getInfo() { 
        return "Akcesorium: " + getName() + ", Kategoria: " + getKategoria() + ", " + getPro() + ", Cena: " + obliczCene() + " zł";
    }
    
}
