package examenJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class examenJUnitTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testExpIgualAUno() {
		assertEquals(Ejemplo.printFactor(1,1,1),"1");
	}
	@Test
	void testExpMayoraUno() {
		assertEquals(Ejemplo.printFactor(1,2,1),"1^2");
	}
	@Test
	void testNumberMayorAUno() {
		assertEquals(Ejemplo.printFactor(1,1,2),"1*");
	}
	@Test
	void testNingunIf() {
		assertEquals(Ejemplo.printFactor(0,0,0),"");
	}
	

}
