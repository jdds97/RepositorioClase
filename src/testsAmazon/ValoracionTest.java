package testsAmazon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import interfaces.IValoracion;
import model.PuntuacionInvalidaException;
import model.Valoracion;

class ValoracionTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testLanzaExcepcion() {
		//Valoracion5
		IValoracion valoracion5=new Valoracion();
		valoracion5.setComentario("Bueno");
		assertThrows(PuntuacionInvalidaException.class,()->{valoracion5.setPuntuacion(7);});
	}

}
