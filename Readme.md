# University Java Labs

Lab1 and Lab2 have variable names and classes in Polish. This is incorrect, but I was given this assignment in a class at university. The other labs are in English.

---

## Lab 1: System Figur Geometrycznych

**Polecenie:**
Zaimplementuj system klas reprezentujących figury geometryczne. System powinien zawierać:
* **Klasę `Figura`**: jako bazę dla wszystkich figur implementującą metodę `toString()`.
* **Klasy pochodne**: reprezentujące konkretne figury: `Koło`, `Prostokąt`, `Trójkąt`.
* **Pola statyczne**: zliczające utworzone instancje każdego typu figury.
* **Metody**: obliczające pole i obwód dla każdej figury.

---

## Lab 2: System Zarządzania Sklepem Muzycznym

**Polecenie:**
Celem zadania jest implementacja systemu do zarządzania asortymentem sklepu muzycznego z wykorzystaniem:
* Dziedziczenia
* Polimorfizmu
* Klas abstrakcyjnych
* Interfejsów

---

## Lab 3: Menadżer Dokumentów

**Polecenie:**
Zaprogramuj menadżer dokumentów uwzględniając następujące elementy:

### Dziedziczenie i polimorfizm:
* **Interfejs:** `Document`
* **Abstrakcyjna klasa:** `BaseDocument`
* **Klasa potomna:** `TextDocument`

### Wzorce projektowe:
* **Singleton:** Klasa `DocumentManager` z metodą `getInstance()`.
* **Adapter:** Klasa `FileDocumentAdapter` umożliwiająca odczyt dokumentów z pliku.
    * *Uwaga:* Konstruktor `FileDocumentAdapter` powinien rzucać wyjątek `IOException`.

### Odczyt plików i wyjątków:
* Wykorzystanie `java.io.FileReader` oraz `java.util.Scanner`.
* Mechanizm `try-catch` oraz własna obsługa wyjątków `IOException`.

**Dane wejściowe:** Wykorzystaj plik `document.txt`.

---

## Lab 4: Stream API i Kolekcje

**Polecenie:**
Odczytaj dane z pliku `products.txt`, a następnie stwórz zestawienia wykorzystując wyłącznie przetwarzanie strumieniowe:
* Kolekcje i Wyrażenia lambda.
* **Stream API** oraz referencje do metod.
* **UWAGA:** Nie wolno używać instrukcji warunkowych `if`.

---

## Lab X: System Porównywania i Zarządzania

**Polecenie:**
Stwórz zestaw klas i metod statycznych demonstrujących operacje na obiektach, z uwzględnieniem:
* Klonowania oraz metod klasy `String`.
* Metod `equals()` oraz `hashCode()` odziedziczonych z klasy `Object`.
* Mechanizmu refleksji (**Reflection API**).