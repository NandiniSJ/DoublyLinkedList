import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DoublyLinkedListTest {

    private DoublyLinkedList<Integer> list;

    @BeforeEach
    public void setUp() {
        list = new DoublyLinkedList<>();
    }

    @Test
    void shouldAddNodeToDoublyLinkedList(){
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        assertEquals(30,list.get(2));


       // assertEquals();

    }

    @Test
    void shouldAddNodeToListInTheBeginning() {
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);
        list.addFirst(50);

        assertEquals(40,list.get(1));
    }

    @Test
    void shouldAddNodeToListAtGivenIndex() {
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(25,2);

        assertEquals(6, list.length());
        assertEquals(30,list.get(3));
    }

    @Test
    void shouldDeleteANodeAtGivenIndex() {
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(35);
        list.delete(2);

        assertEquals(40,list.get(2));
        assertEquals(5,list.length());
    }
}

