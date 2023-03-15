package poo_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import poo_gestionl.Main3;

class MainTest {

	@Test
	void testRestar() {
		assertEquals(Main3.restar(-4,-5),1);
	}

	@Test
	void testMayorDeEdad() {
		assertEquals(Main3.mayorDeEdad(19),false);	
		}
	@Test
	void testMenorDeEdad() {
		assertEquals(Main3.mayorDeEdad(17),false);	
		}

}
