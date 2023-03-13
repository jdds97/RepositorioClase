package ExamenGestion;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import examenJUnit.RepasoExamen;

class MainExamenTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testPrecioBaseMayorA1000() {
		assertEquals(RepasoExamen.precioProducto(1001,true) );
}

}
