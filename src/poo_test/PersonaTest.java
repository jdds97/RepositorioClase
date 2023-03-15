package poo_test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;


import poo_modelo.Persona;

class PersonaTest {

	
	
	@Test
	void testCumplirAnio() {
		Persona jesus=new Persona();
		
		assertEquals(jesus.getEdad(),1);	
		}

}
