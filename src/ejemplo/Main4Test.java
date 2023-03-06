package ejemplo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Main4Test {
	/*
	 * La primera prueba testSiHayDiferenciaDeCincoEntreConRestaIgualACinco()
	 * comprueba el camino en el que la resta entre fin e inicio es igual a 5 y el
	 * método debería devolver true.
	 */
	@Test
	public void testSiHayDiferenciaDeCincoEntreConRestaIgualACinco() {
		boolean resultado = Main4.siHayDiferenciaDeCincoEntre(3, 8);
		assertTrue(resultado);
	}

	/*
	 * La segunda prueba testSiHayDiferenciaDeCincoEntreConRestaDistintaACinco()
	 * comprueba el camino en el que la resta entre fin e inicio no es igual a 5 y
	 * el método debería devolver false.
	 */
	@Test
	public void testSiHayDiferenciaDeCincoEntreConRestaDistintaACinco() {
		boolean resultado = Main4.siHayDiferenciaDeCincoEntre(3, 9);
		assertFalse(resultado);
	}
}
