/**
 * Zadanie: System Figur Geometrycznych
 * <p>
 * Zaimplementuj system klas reprezentujących figury geometryczne.
 * System powinien zawierać:
 * 1. Klasę Figura jako bazę dla wszystkich figur implementującą metodę toString()
 * 2. Klasy pochodne reprezentujące konkretne figury: Koło, Prostokąt, Trójkąt
 * 3. Pola statyczne zliczające utworzone instancje każdego typu figury
 * 4. Metody obliczające pole i obwód dla każdej figury
 */
// Klasa testowa
public class TestFigur {
    public static void main(String[] args) {
        // Tworzenie obiektów figur
        Kolo kolo1 = new Kolo(5);
        Kolo kolo2 = new Kolo(7);
        Prostokat prostokat1 = new Prostokat(4, 6);
        Trojkat trojkat1 = new Trojkat(3, 4, 5);

        // Wyświetlanie informacji o figurach
        System.out.println(kolo1);
        System.out.println(kolo2);
        System.out.println(prostokat1);
        System.out.println(trojkat1);

        // Wyświetlanie informacji o liczbie utworzonych figur
        System.out.println("\nStatystyki:");
        System.out.println("Liczba wszystkich figur: " + Figura.pobierzLiczbeWszystkichFigur());
        System.out.println("Liczba kół: " + Kolo.pobierzLiczbeKol());
        System.out.println("Liczba prostokątów: " + Prostokat.pobierzLiczbeProstokatow());
        System.out.println("Liczba trójkątów: " + Trojkat.pobierzLiczbeTrojkatow());
    }
}
/*
Program powinien wydrukować:

Koło: Pole = 78.53981633974483, Obwód = 31.41592653589793
Koło: Pole = 153.93804002589985, Obwód = 43.982297150257104
Prostokąt: Pole = 24.0, Obwód = 20.0
Trójkąt: Pole = 6.0, Obwód = 12.0

Statystyki:
Liczba wszystkich figur: 4
Liczba kół: 2
Liczba prostokątów: 1
Liczba trójkątów: 1
 */