import java.util.AbstractList;

public class CustomList <T extends Comparable<T>> extends AbstractList {

    private Object[] data;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    CustomList() {

        data = new Object[DEFAULT_CAPACITY];
    }

    CustomList(int capacity) {

        if (capacity < 0) {
            throw new NegativeArraySizeException();
        }

        data = new Object[capacity];
    }

    @Override
    public boolean add(Object o) {

        if (size > data.length - 1) {
            arrayIncrease();
        }

        data[size++] = o;
        return true;
    }

    @Override
    public void add(int index, Object element) {

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }

        if (size > data.length - 1) {
            arrayIncrease();
        }

        for (int i = size(); i > index; i--) {
            data[i] = data[i - 1];
        }

        data[index] = element;
        size++;
    }

    private void arrayIncrease() {
        Object[] temp = new Object[data.length * 2];
        System.arraycopy(data, 0, temp, 0, data.length);
        data = temp;
    }

    @Override
    public T set(int index, Object element) {

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }

        Object temp = data[index];
        data[index] = element;
        return (T) temp;
    }


    @Override
    public T remove(int index) {

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }

        Object temp = data[index];

        for (int i = index; i < size() - 1; i++) {
            data[i] = data[i + 1];
        }

        size--;
        return (T) temp;
    }

    @Override
    public int indexOf(Object o) {
        return super.indexOf(o);
    }

    @Override
    public T get(int index) {

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }

        return (T) data[index];
    }

    @Override
    public int size() {
        return size;
    }

    private String outOfBoundsMsg(int index) {

        return "Index: " + index + ", Size: " + size;
    }
}
