import java.util.Comparator;

public class MyCollections {
    public static <E> void sort(MyAL<E> myArrayList, Comparator<E> comparator) {
        int low = 0;
        int high = myArrayList.size() - 1;
        quickSort(myArrayList, low, high, comparator);
    }

    private static <T> void quickSort(MyAL<T> array, int low, int high, Comparator<T> comparator) {
        if (array.size() == 0)
            return;//завершить выполнение если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        T opora = array.get(middle);

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (comparator.compare(array.get(i), opora) < 0) {
                i++;
            }
            while (comparator.compare(array.get(j), opora) > 0) {
                j--;
            }

            if (i <= j) {//меняем местами
                T temp = array.get(i);
                array.set(i, array.get(j));
                array.set(j, temp);
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j, comparator);

        if (high > i)
            quickSort(array, i, high, comparator);
    }
}
