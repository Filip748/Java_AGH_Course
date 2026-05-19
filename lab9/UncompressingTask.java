import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UncompressingTask implements Runnable {

    private String destFolder;
    private File f;

    public UncompressingTask(File f, String destFolder) {
        this.f = f;
        this.destFolder = destFolder;
    }
    
    public String getDestFolder() { return destFolder; }
    public File getF() { return f; }

    @Override
    public void run() {
        File zipFile = getF();
        long archiveSizeBytes = zipFile.length();

        File unpackedFile = null;

        try(FileInputStream fis = new FileInputStream(zipFile);
        ZipInputStream zis = new ZipInputStream(fis)) {

            ZipEntry entry = zis.getNextEntry();

            if(entry != null) {
                unpackedFile = new File(getDestFolder(), entry.getName());

                try(FileOutputStream fos = new FileOutputStream(unpackedFile)) {
                    byte[] buffer = new byte[1024];
                    int length;

                    while((length = zis.read(buffer)) >= 0) {
                        fos.write(buffer, 0, length);
                    }
                }
                zis.closeEntry();
            }

        } catch (IOException e) {
            //
        }

        long unpackedSizeBytes = unpackedFile.length();

        double archiveSizeMb = (double) archiveSizeBytes / (1024 * 1024);
        double unpackedSizeMb = (double) unpackedSizeBytes / (1024 * 1024);

        String threadName = Thread.currentThread().getName();

        String message = String.format(
                    "Archiwum %s rozpakowane przez wątek%s. Rozmiar archiwum: %.1f MB, rozmiar po rozpakowaniu: %.1f MB",
                    zipFile.getName(),
                    threadName,
                    archiveSizeMb,
                    unpackedSizeMb
            );

            System.out.println(message);

    }
}
