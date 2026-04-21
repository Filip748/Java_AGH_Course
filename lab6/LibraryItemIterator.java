import java.util.Iterator;
import java.util.List;

public class LibraryItemIterator<T extends LibraryItem> implements Iterator<T> {
    private List<T> list;
    private int position = 0;

    public LibraryItemIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public T next() {
        return list.get(position++);
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public void remove() {
        list.remove(--position);
    }
}
