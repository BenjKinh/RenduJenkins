import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

/**
 * 
 */

/**
 * @author Benjamin
 *
 */
class TestCalcul {
	
    private Calculs c = null;
    
    /**
     * Initialise les valeurs avant chaque test 
     */
    @BeforeEach
    void setUp() throws Exception 
    {
        c = new Calculs(1,2);
    }
	
	/**
	 * Test method for {@link Calculs#Calculs(int, int)}.
	 */
	@Test
	void testCalculs() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Calculs#multiplier()}.
	 */
	@Test
	void testMultiplier() {
		if (c.multiplier() != 2)
		{
			fail("Méthode multiplier non valide");
		}
		assertEquals(c.multiplier(), 2);

	}

	/**
	 * Test method for {@link Calculs#additionner()}.
	 */
	@Test
	void testAdditionner() {
		if (c.additionner() != 3)
		{
			fail("Méthode Additionner non valide");
		}
		assertEquals(c.additionner(), 3);

	}

	/**
	 * Test method for {@link Calculs#diviser()}.
	 */
	@Test
	void testDiviser() {
		if (c.diviser() != 0)
		{
			fail("Méthode Diviser non valide");
		}
		assertEquals(c.diviser(), 0);

	}

	/**
	 * Test method for {@link Calculs#soustraire()}.
	 */
	@Test
	void testSoustraire() {
		if (c.soustraire() != -1)
		{
			fail("Méthode Soustraire non valide");
		}
		assertEquals(c.soustraire(), -1);

	}

}
