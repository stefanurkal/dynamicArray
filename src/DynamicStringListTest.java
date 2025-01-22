import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class DynamicStringListTest {

    private DynamicStringList list;

    @BeforeEach
    public void setUp() {
        
        list = new DynamicStringList();
    }

    @Test
    public void testSet() {
        
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
        
        list.add("Seahawks");
        list.add("Mariners");
        list.add("Sonics");

        String removeItem= list.remove(2);
        assertEquals("Sonics", removeItem);
    }

    @Test
    public void testCapacity() {
        assertEquals(10, list.capacity());
    }
}