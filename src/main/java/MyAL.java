/**
 * Самодельный List. Основные методы в учебных целях.
 *
 * @param <T> обобщенный тип
 * @author Banin Roman
 * @version 1.0
 */
public interface MyAL<T> {

    /**
     * Добавление элемента в конец коллекции
     *
     * @param t добавляемый в коллекцию элемент
     */
    void add(T t);

    /**
     * Добавление элемента в коллекцию в позицию index
     *
     * @param t     добавляемый в коллекцию элемент
     * @param index индекс элемента
     */
    void add(int index, T t);

    /**
     * Получение элемента по индексу
     *
     * @param index индекс элемента
     * @return возвращает элемент из MyAL по индексу
     * @throws IndexOutOfBoundsException если элемента с таким index не существует.
     */
    T get(int index);

    /**
     * Удаление элемента из коллекции по индексу
     *
     * @param index индекс элемента
     */
    void remove(int index);

    /**
     * Удаление всех элементов из коллекции
     */
    void clear();

    /**
     * Размер коллекции
     *
     * @return текущий размер коллекции
     */
    int size();

    //boolean quicksort(Comparator<? super T> c);

    /**
     * Установка элемента по заданному индексу
     *
     * @param index индекс элемента который будет установлен
     * @param t     устанавливаемый элемент
     * @throws IndexOutOfBoundsException если элемента с таким index не существует.
     */
    void set(int index, T t);
}
