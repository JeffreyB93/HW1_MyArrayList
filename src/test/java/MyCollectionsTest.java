import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyCollectionsTest {

    private MyAL<Integer> list;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        list = new MyArrayList<>();
        list.add(2);
        list.add(3);
        list.add(6);
        list.add(1);
        list.add(7);
        list.add(0);
        list.add(8);
        list.add(5);
        list.add(4);
    }

    @Test
    public void sortTest(){
        MyCollections.sort(list, Integer::compareTo);
        for (int i = 0; i < list.size(); i++) {
            assertEquals(i, list.get(i));
        }
    }
}