import java.io.File;
//Zaprogramuj unkompressor zip, który jako parametry z linii komend przyjmie folder źródłowy oraz folder docelowy.
//Pliki w folderze źródłowym (nazwijmy go compressed to te same pliki, które poprzednio zostały skompresowane) zostaną rozzipowane,
// i zapisane w folderze docelowym (nazwijmy go uncompressed).
//Rozzipowanie każdego pliku musi odbyć się w oddzielnym wątku wykonującym zadanie UncompressingTask implementujące interfejs
// Runnable (uwaga: to niejest zaznaczone na diagramie UML) i skutkować:
//1. Outputem jak poniżej.
//2. Zapisaniem plików w folderze uncompressed
public class FolderUncompressor {
    public static void main(String[] args) {
        String sourcePath = args[0];
        String destinationPath = args[1];

        File sourceFolder = new File(sourcePath);
        File[] files = sourceFolder.listFiles();

        if(files != null) {
            for(File zipFile : files) {
                UncompressingTask task = new UncompressingTask(zipFile, destinationPath);
                Thread thread = new Thread(task);
                thread.start();
            }
        }
    }
}

//Archiwum Angular2_Succinctly.pdf.zip rozpakowane przez wątekThread-0. Rozmiar archiwum: 1,9 MB, rozmiar po rozpakowaniu: 2,1 MB
//Archiwum Android-UI-Design.pdf.zip rozpakowane przez wątekThread-2. Rozmiar archiwum: 3,4 MB, rozmiar po rozpakowaniu: 3,9 MB
//Archiwum Android-Programming-Cookbook.pdf.zip rozpakowane przez wątekThread-1. Rozmiar archiwum: 8,0 MB, rozmiar po rozpakowaniu: 8,6 MB
