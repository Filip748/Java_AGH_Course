import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Container<T extends LibraryItem> implements Iterable<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) { items.add(item); }

    public T removeItem(String id) {
        for(T item : items) {
            if(item.getId().equals(id)) {
                items.remove(item);
                return item;
            }
        }
        return null;
    }

    public List<T> getItems() { return items; }

    @Override
    public Iterator<T> iterator() {
        return new LibraryItemIterator<>(items);
    }

}
