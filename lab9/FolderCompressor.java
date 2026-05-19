import java.io.File;
//Zaprogramuj kompressor zip, który jako parametry z linii komend przyjmie folder źródłowy oraz folder docelowy.
//Pliki w folderze źródłowym (nazwijmy go to_comress i zawiera on dostarczone pliki) zostaną zzipowane,
// oddzielnie plik po pliku i zapisane w folderze docelowym.
//Zipowanie każdego pliku musi odbyć się w oddzielnym wątku wykonującym zadanie CompressingTask implementujące interfejs
// Runnable (uwaga: to niejest zaznaczone na diagramie UML) i skutkować:
//1. Outputem jak poniżej.
//2. Zapisaniem plików w folderze compressed

public class FolderCompressor {
    public static void main(String[] args) {
        String path1 = args[0];
        String path2 = args[1];

        File source = new File(path1);
        File[] files = source.listFiles();

        if(files != null) {
            for(File file : files) {
                CompressingTask task = new CompressingTask(file, path2);
                Thread thread = new Thread(task);
                thread.start();
            }
        }
    }
}

//
//Plik Angular2_Succinctly.pdf zzipowany w wątku Thread-1. Rozmiar początkowy: 2,1 MB,rozmiar końcowy: 1,9 MB
//Plik Android-UI-Design.pdf zzipowany w wątku Thread-2. Rozmiar początkowy: 3,9 MB,rozmiar końcowy: 3,4 MB
//Plik Android-Programming-Cookbook.pdf zzipowany w wątku Thread-0. Rozmiar początkowy: 8,6 MB,rozmiar końcowy: 8,0 MB

