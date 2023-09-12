import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тесты интерфейса MyAL
 */
public class MyArrayListTest {

    /**
     * Создаем ссылку на испытуемый объект
     */
    private MyAL<String> myArrayList;

    /**
     * Перед каждым тестом добавляем 50 студентов
     */
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        myArrayList = new MyArrayList<>();
        for (int i = 0; i < 50; i++) {
            myArrayList.add("Студент_" + i);
        }
    }


    /**
     * Проверяем, что метод get возвращает ожидаемое значение
     */
    @Test
    public void getTest(){
        assertEquals("Студент_3", myArrayList.get(3));
    }


    /**
     * Проверяем, что размер коллекции равен 50
     */
    @Test
    public void sizeTest() {
        assertEquals(50, myArrayList.size());
    }


    /**
     * Проверяем, что при удалении размер массива уменьшается на 1
     */
    @Test
    public void removeTest(){
        myArrayList.remove(30);
        assertEquals(49, myArrayList.size());
    }


    /**
     * Проверяем, что при удалении не существующего индекса выбрасывается ошибка
     */
    @Test
    public void indexOutOfBoundsExceptionTest(){
        assertThrows(IndexOutOfBoundsException.class, ()->{
            myArrayList.remove(60);
                });
    }

    /**
     * Проверяем, что после очистки коллекции ее размер
     * становится равным 0
     */
    @Test
    public void clearTest(){
        myArrayList.clear();
        assertEquals(0, myArrayList.size());
    }


    /**
     * Проверяем вставку элемента по индексу
     * Размер коллекции после вставки не меняется.
     */
    @Test
    public void setTest(){
        myArrayList.set(25, "Студент_1000");
        assertEquals("Студент_1000", myArrayList.get(25));
        assertEquals(50, myArrayList.size());
    }
}