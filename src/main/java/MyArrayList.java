import java.util.Arrays;
import java.util.Comparator;

public class MyArrayList<T> implements MyAL<T> {

    private static final int DEFAULT_CAPACITY = 10;
    private T[] myArrayList;
    private int size;

    public MyArrayList() {
        myArrayList = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    private void ensureCapacity(int capacity) {
        int newCapacity = Math.max(myArrayList.length * 2, capacity);
        myArrayList = Arrays.copyOf(myArrayList, newCapacity);
    }


    @Override
    public void add(T t) {
        if(size == myArrayList.length) {
            ensureCapacity(size + 1);
        }
        myArrayList[size++] = t;
    }

    @Override
    public void add(int index, T t) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (size == myArrayList.length) {
            ensureCapacity(size + 1);
        }
        System.arraycopy(myArrayList, index, myArrayList, index + 1, size - index);
        myArrayList[index] = t;
        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return myArrayList[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        System.arraycopy(myArrayList, index + 1, myArrayList, index, size - index - 1);
        myArrayList[--size] = null;
    }

    public void clear() {
        Arrays.fill(myArrayList, 0, size, null);
        size = 0;
    }

    public void quicksort(Comparator<? super T> c) {
        Arrays.sort((T[]) myArrayList, 0, size, c);
    }

    public void set(int index, T t) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        myArrayList[index] = t;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
