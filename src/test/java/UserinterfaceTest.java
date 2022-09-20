import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserinterfaceTest {

    @Test //Vigtigt "Keyword", uden dette vil testen ikke virke

    public void testObjectCreation() {
        //Her der går den ind og tester om det hele er om som det skal være
        //Hvis jeg fx, tastede true i stedet for false, ville denne give mig en forklaring på en error

        Superhero hero8 = new Superhero("Superman", "Strong", 1999, 1.88, false);
        assertEquals("Superman", hero8.getSuperheroname());
        assertEquals("Strong", hero8.getSuperpower());
        assertEquals(1999, hero8.getCreationyear());
        assertEquals(1.88, hero8.getHeight());
        assertEquals(false, hero8.getIsHumanOrNot());

    }

    // Her der bliver Get metoden testet
    @Test
    public void testIsEmpty() {
        Superhero hero8 = new Superhero("Superman", "Strong", 1999, 1.88, false);
        assertFalse(hero8.getIsHumanOrNot());
    }
    //@Disabled ("Disable line, until it gets fixed")//Den disabler testen
   //Her bliver en set metode testet
    @Test
    public void test() {
        Superhero hero8 = new Superhero("Superman", "Strong", 1999, 1.88, false);
        hero8.setSuperpower(null);
        assertNotNull(hero8.getSuperpower());
    }
}
