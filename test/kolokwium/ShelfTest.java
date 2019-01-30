package kolokwium;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adam Małota
 */
public class ShelfTest {

    Shelf shelf = new Shelf();
    Box box;
    
    @Test
    public void testAdd() {
       shelf.add(new Box("Jabłko",100));
       assertEquals(1,shelf.list.size());
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testAddNull() {
        shelf.add(null);        
    }

    @Test
    public void testRemove() {
        shelf.add(new Box("Jabłko",100));
        shelf.add(new Box("Banan",100));
        shelf.remove("Jabłko");
        assertEquals(1,shelf.list.size());
    }

    @Test
    public void testTotalWidth() {
        shelf.add(new Box("Jabłko",100));
        shelf.add(new Box("Banan",100));
        assertEquals(200,shelf.totalWidth());
    }
    
}
