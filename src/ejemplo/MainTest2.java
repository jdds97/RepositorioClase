package ejemplo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest2 {
	/*
	 * Prueba para verificar que el método devuelve 0 cuando no hay vocales en la
	 * entrada.
	 */
	@Test
	public void testContarVocalesSinVocales() {
		int resultado = Main2.contarVocales("1234");
		assertEquals(0, resultado);
	}

	/*
	 * Prueba para verificar que el método devuelve el número correcto de vocales
	 * cuando se proporcionan solo vocales minúsculas.
	 */
	@Test
	public void testContarVocalesConVocales() {
		int resultado = Main2.contarVocales("aeiou");
		assertEquals(5, resultado);
	}

	/*
	 * Prueba para verificar que el método devuelve el número correcto de vocales
	 * cuando se proporcionan solo vocales mayúsculas.
	 */
	@Test
	public void testContarVocalesConVocalesMayusculas() {
		int resultado = Main2.contarVocales("AEIOU");
		assertEquals(5, resultado);
	}

	/*
	 * Prueba para verificar que el método devuelve el número correcto de vocales
	 * cuando se proporcionan vocales en mayúsculas y minúsculas, así como otros
	 * caracteres.
	 */
	@Test
	public void testContarVocalesConVocalesMixto() {
		int resultado = Main2.contarVocales("Mi Nombre es Jesus");
		assertEquals(6, resultado);
	}
}
