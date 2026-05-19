import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CompressingTask implements Runnable {
    private String outFolder;
    private String fname;
    private File f;

    public CompressingTask(File f, String outFolder) {
        this.f = f;
        this.outFolder = outFolder;
    }

    public String getOutFolder() { return outFolder; }
    public String getFname() { return fname; }
    public File getF() { return f; }

    @Override
    public void run() {
        File sourceFile = getF();
        File targetZipFile = new File(getOutFolder(), sourceFile.getName() + ".zip");

        long initialSizeBytes = sourceFile.length();

        try(FileOutputStream fos = new FileOutputStream(targetZipFile);
            ZipOutputStream zos = new ZipOutputStream(fos);
            FileInputStream fis = new FileInputStream(sourceFile)) {

            ZipEntry zipEntry = new ZipEntry(sourceFile.getName());
            zos.putNextEntry(zipEntry);

            byte[] buffer = new byte[1024];
            int length;

            while((length = fis.read(buffer)) >= 0) {
                zos.write(buffer, 0, length);
            }
            zos.closeEntry();

            } catch (IOException e) {
                //
        }

        long finalSizeBytes = targetZipFile.length();
        double initialSizeMb = (double) initialSizeBytes / (1024 * 1024);
        double finalSizeMb = (double) finalSizeBytes / (1024 * 1024);

        String threadName = Thread.currentThread().getName();
        String mess = String.format(
                "Plik %s zzipowany w wątku %s. Rozmiar początkowy: %.1f MB, rozmiar końcowy: %.1f MB",
                sourceFile.getName(),
                threadName,
                initialSizeMb,
                finalSizeMb
        );

        System.out.println(mess);
    }
}
