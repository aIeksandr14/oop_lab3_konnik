package Lab3;

import java.util.ArrayList;
import java.util.List;

public class SimpleStorage<T> {
    private List<T> elements = new ArrayList<>();

    public void add(T item) {
        elements.add(item);
    }

    public T get(int index) {
        return elements.get(index);
    }

    public void printStorage() {
        System.out.println("Storage contains: " + elements);
    }
}
