import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class DynamicStringListTest {

    private DynamicStringList list;

    @BeforeEach
    public void setUp() {
        // Initialize the list with an initial capacity of 5
        list = new DynamicStringList();
    }

    @Test
    public void testSet() {
        // Test replacing an element at a specific index
        list.add("Seahawks");
        list.add("Mariners");
        list.add("Sonics");

        list.set(1, "Sounders");
        assertEquals("Sounders", list.get(1));
    }

    @Test
    public void testAddAndSize() {
        
        list.add("Seahawks");
        list.add("Mariners");
        list.add("Sonics");

        assertEquals(3, list.size());
    }
    @Test
    public void testGet() {
        
        list.add("Seahawks");
        list.add("Mariners");
        list.add("Sonics");

        assertEquals("Mariners", list.get(1));
    }
    @Test
    public void testRemove() {
        // Test removing an element and checking the size and returned value
        list.add("Seahawks");
        list.add("Mariners");
        list.add("Sonics");

        String removeItem= list.remove(2);
        assertEquals("Sonics", removeItem);
    }
}