/**
 * 
 */
package ejemplo;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Jesús De Dios.R4
 *
 */
class MainTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testIf() {
assertEquals(Main.contar(0, 4),"0,1,2,3,4");
}
	@Test
	void testFor() {
assertEquals(Main.contar(0, 0),"0");
}
	@Test
	void testNiIfFor() {
assertEquals(Main.contar(1, 1),"1");
}
}
