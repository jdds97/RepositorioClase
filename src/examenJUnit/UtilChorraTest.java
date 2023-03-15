/**
 * 
 */
package examenJUnit;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

/**
 * @author JesusDeDios
 *
 */
class UtilChorraTest {

	/**
	 * @throws java.lang.Exception
	 */
	/*
	 * Tests de saludarPersona()
	 */
	

	@Test
	void testNombrePersonaIgualANull(){
		assertEquals(UtilChorra.saludarPersona(21,null),null);
	}
	
	@Test
	void testHoraMenorA20MayorA12(){
		assertEquals(UtilChorra.saludarPersona(19,"Jesus"), "Buenas tardes Jesus");;
	}
	@Test
	void testHoraMayorA20MenorA24(){
		assertEquals(UtilChorra.saludarPersona(20,"Jesus"), "Hola Jesus");;
	}
	@Test
	void testHoraMayorA25YMenorA0(){
		assertEquals(UtilChorra.saludarPersona(25,"Jesus"),null);
	}
	
	/**
	 * Tests de potenciaConBucles()
	 */
	@Test
	void testExponenteIgualA0(){
		assertEquals(UtilChorra.potenciaConBucles(1,0),1.0);
	}
	@Test
	void testExponenteMayorA0(){
		assertEquals(UtilChorra.potenciaConBucles(3,1),3.0);
	}
	/**
	 * Este test de abajo esta hecho para que el bucle sume iteracciones
	 */
	@Test
	void testExponenteMayorA0YBaseMayorA1(){
		assertEquals(UtilChorra.potenciaConBucles(3,3),27.0);
	}
	
	@Test
	void testExponenteMenorA0(){
		assertEquals(UtilChorra.potenciaConBucles(1,-2),1.0);
	}
	/**
	 * /**
	 * Este test de abajo esta hecho para que entre dentro del bucle
		mientras i sea menor al valor absoluto del exponente
	 */
	 
	@Test
	void testExponenteMenorA0YBaseMayorA1(){
		assertEquals(UtilChorra.potenciaConBucles(2,-2),0.25);

	}
	
	
}
