import java.util.Collection;

public class LibraryUtils {
    public static void printItems(Collection<? extends LibraryItem> items) {
        for (LibraryItem item : items) {
            System.out.println(item);
        }
    }
}
