package View;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import com.aprilhoward.Vendable;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Test;

public class CSVLoaderTest {
    /**
     * Method under test: {@link CSVLoader#convertLineIntoVendable(String)}
     */
    @Test
    public void testConvertLineIntoVendable() {



        assertNull((new CSVLoader()).convertLineIntoVendable("Line"));
    }

    /**
     * Method under test: {@link CSVLoader#loadMachine()}
     */
    @Test
    public void testLoadMachine() {
        List<Vendable> allItems = (new CSVLoader()).loadMachine().getAllItems();
        assertEquals(Short.SIZE, allItems.size());
        Vendable getResult = allItems.get(2);
        assertEquals("A3", getResult.getSlot());
        assertEquals(5, getResult.getQuantity());
        assertEquals("Grain Waves", getResult.getName());
        Vendable getResult1 = allItems.get(0);
        assertEquals(5, getResult1.getQuantity());
        Vendable getResult2 = allItems.get(14);
        assertEquals("D3", getResult2.getSlot());
        assertEquals(5, getResult2.getQuantity());
        assertEquals("Chiclets", getResult2.getName());
        Vendable getResult3 = allItems.get(1);
        assertEquals("Stackers", getResult3.getName());
        assertEquals("A1", getResult1.getSlot());
        assertEquals(5, getResult3.getQuantity());
        assertEquals("A2", getResult3.getSlot());
        Vendable getResult4 = allItems.get(13);
        assertEquals("D2", getResult4.getSlot());
        assertEquals(5, getResult4.getQuantity());
        assertEquals("Little League Chew", getResult4.getName());
        Vendable getResult5 = allItems.get(15);
        assertEquals("Triplemint", getResult5.getName());
        assertEquals("Potato Crisps", getResult1.getName());
        BigDecimal price = getResult2.getPrice();
        assertEquals(price, getResult5.getPrice());
        assertEquals(5, getResult5.getQuantity());
        assertEquals("D4", getResult5.getSlot());
        assertEquals("2.75", getResult.getPrice().toString());
        assertEquals("1.45", getResult3.getPrice().toString());
        assertEquals("0.75", price.toString());
    }
}

