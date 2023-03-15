package poo_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Entornos.AleatorioImpar;

class AleatorioImparTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		boolean condicion = false;
		if(AleatorioImpar.aleatorioImpar(0, 0)>8 && AleatorioImpar.aleatorioImpar(0, 0)<9) {
			condicion=true;
		}
		assertEquals(AleatorioImpar.aleatorioImpar(0, 0), condicion);
}

}
