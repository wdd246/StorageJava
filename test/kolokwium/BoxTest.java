package kolokwium;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adam Małota
 */
public class BoxTest {
    
    Shelf shelf = new Shelf();
    String name="Jabłko";
    int width = 100;
    Box box = new Box(name,width);

    @Test
    public void testSetName() {
        assertEquals(name,box.getName());
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testSetNameNull() {
        shelf.add(new Box(null,10));
        assertEquals(null,box.getName());
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testSetNameEmpty() {
        shelf.add(new Box("",10));
        assertEquals("",box.getName());
    }
    
    @Test
    public void testSetWidth() {
        assertTrue(Math.abs(width-box.getWidth())==0);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testSetWidthZero() {
        shelf.add(new Box(name,0));
        assertTrue(Math.abs(0-box.getWidth())==0);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testSetWidthMinus() {
        shelf.add(new Box(name,-100));
        assertTrue(Math.abs(-100-box.getWidth())==0);
    }    
}
